package com.centerpoint.connect.classes.expandable_view

import android.annotation.SuppressLint
import android.content.Context
import android.content.res.TypedArray
import android.graphics.Color
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import com.centerpoint.connect.R
import com.centerpoint.connect.base.bindCustomBackground
import com.centerpoint.connect.base.bindVisibility
import com.centerpoint.connect.databinding.LayoutExpandableBinding
import com.centerpoint.connect.databinding.LayoutHeadingExpandableBinding

/**
@author Khawaja Moiz
created on 1/18/23
 **/
class ExpandableView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    private var rootBinding: LayoutHeadingExpandableBinding? = null
    private var expandableView: LayoutExpandableBinding? = null

    private var heading = DEFAULT_HEADING
    private var subHeading = DEFAULT_SUB_HEADING
    private var subDescription = DEFAULT_SUB_DESCRIPTION
    private var headingAllCaps = DEFAULT_HEADING_ALL_CAPS
    private var headingColor = DEFAULT_HEADING_COLOR
    private var subHeadingColor = DEFAULT_SUB_HEADING_COLOR
    private var isExpanded = DEFAULT_EXPANDED
    private var isExpandable = DEFAULT_EXPANDABLE
    private var subHeadingEnabled = DEFAULT_SUB_HEADING_ENABLED
    private var showDropDownIcon = DEFAULT_SHOW_ICON
    private var bgColor = DEFAULT_BACKGROUND_COLOR
    private var cornerRadius = DEFAULT_CORNER_RADIUS

    private var viewAdded = false

    init {
        orientation = VERTICAL
        init(attrs, defStyleAttr)
    }

    private fun init(attrs: AttributeSet?, defStyleAttr: Int) {
        val typedArray =
            context.obtainStyledAttributes(attrs, R.styleable.ExpandableView, defStyleAttr, 0)
        initAttrs(typedArray)
        typedArray.recycle()
    }

    private fun initAttrs(typedArray: TypedArray) {
        heading = typedArray.getString(R.styleable.ExpandableView_ev_heading)
            ?: DEFAULT_HEADING
        subHeading = typedArray.getString(R.styleable.ExpandableView_ev_sub_heading)
            ?: DEFAULT_SUB_HEADING
        subDescription = typedArray.getString(R.styleable.ExpandableView_ev_sub_description)
            ?: DEFAULT_SUB_DESCRIPTION
        headingAllCaps = typedArray.getBoolean(
            R.styleable.ExpandableView_ev_heading_all_caps,
            DEFAULT_HEADING_ALL_CAPS
        )
        isExpanded = typedArray.getBoolean(
            R.styleable.ExpandableView_ev_expanded,
            DEFAULT_EXPANDED
        )
        isExpandable = typedArray.getBoolean(
            R.styleable.ExpandableView_ev_expandable,
            DEFAULT_EXPANDABLE
        )
        showDropDownIcon = typedArray.getBoolean(
            R.styleable.ExpandableView_ev_show_drop_down_icon,
            DEFAULT_SHOW_ICON
        )
        subHeadingEnabled = typedArray.getBoolean(
            R.styleable.ExpandableView_ev_sub_heading_enabled,
            DEFAULT_SUB_HEADING_ENABLED
        )
        bgColor = typedArray.getColor(
            R.styleable.ExpandableView_ev_background_color,
            DEFAULT_BACKGROUND_COLOR
        )
        headingColor = typedArray.getColor(
            R.styleable.ExpandableView_ev_heading_color,
            DEFAULT_HEADING_COLOR
        )
        subHeadingColor = typedArray.getColor(
            R.styleable.ExpandableView_ev_sub_heading_color,
            DEFAULT_SUB_HEADING_COLOR
        )
        cornerRadius = typedArray.getDimension(
            R.styleable.ExpandableView_ev_corner_radius,
            DEFAULT_CORNER_RADIUS
        )
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

        val width = measuredWidth
        val height = measuredHeight

        if (!viewAdded) initView()

        setMeasuredDimension(width, height)
    }

    private fun initView() {
        val inflater =
            context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        if (childCount > 0) {
            val bodyView = getChildAt(0)
            updateInsideView(bodyView)
            this.removeView(bodyView)

            expandableView = LayoutExpandableBinding.inflate(inflater, null, false).apply {
                expandableLayout.let {
                    it.addView(bodyView)
                    it.expansion = if (isExpanded) 1f else 0f
                    it.setOnExpansionUpdateListener { expansion, _ ->
                        when {
                            expansion >= 0.1f -> updateViews(true)
                            expansion <= 0.13f -> updateViews(false)
                        }
                    }
                }
            }
        }

        rootBinding = LayoutHeadingExpandableBinding.inflate(inflater, null, false).apply {
            tvHeading.let {
                if (isExpandable) {
                    it.setOnClickListener {
                        isExpanded = !isExpanded
                        toggleExpandableLayout(isExpanded)
                    }
                }
                it.setTextColor(headingColor)
                it.text = heading
                it.isAllCaps = headingAllCaps
            }
            if (subHeadingEnabled) {
                tvHSubHeading.let {
                    it.setTextColor(subHeadingColor)
                    it.text = subHeading
                }
                tvHSubDescription.text = subDescription
            }
        }

        updateViews(isExpanded)

        rootBinding?.let { this.addView(it.root) }
        expandableView?.let { this.addView(it.root) }

        viewAdded = true
    }

    private fun toggleExpandableLayout(show: Boolean) = expandableView?.expandableLayout?.apply {
        if (show) expand(true) else collapse(true)
    }

    @SuppressLint("ResourceType")
    private fun updateViews(expanded: Boolean) {
        rootBinding?.apply {
            llMain.bindCustomBackground(
                backgroundColor = bgColor,
                topCorners = cornerRadius,
                bottomCorners = if (expanded) 0f else cornerRadius,
                strokeColor = null,
                strokeWidth = null
            )
            viewLine.bindVisibility(expanded || subHeadingEnabled)
            tvHSubHeading.bindVisibility(subHeadingEnabled)
            tvHSubDescription.bindVisibility(subHeadingEnabled)
            if (showDropDownIcon) {
                val drawable = ContextCompat.getDrawable(
                    this@ExpandableView.context,
                    if (expanded) R.drawable.ic_drop_down_open else R.drawable.ic_drop_down
                )
                tvHeading.setCompoundDrawablesWithIntrinsicBounds(null, null, drawable, null)
            } else
                tvHeading.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null)
        }
    }

    @SuppressLint("ResourceType")
    private fun updateInsideView(view: View) = view.bindCustomBackground(
        backgroundColor = bgColor,
        topCorners = 0f,
        bottomCorners = cornerRadius,
        strokeColor = null,
        strokeWidth = null
    )

    /*
    * Getters / Setters for binding
    */
    var mSubHeading: String
        get() = subHeading
        set(value) {
            subHeading = value
            rootBinding?.tvHSubHeading?.text = subHeading
        }

    var mSubHeadingColor: Int
        get() = subHeadingColor
        set(value) {
            subHeadingColor = value
            rootBinding?.tvHSubHeading?.setTextColor(value)
        }

    var mSubHeadingDesc: String
        get() = subDescription
        set(value) {
            subDescription = value
            rootBinding?.tvHSubDescription?.text = subDescription
        }

    companion object {
        private const val DEFAULT_HEADING = ""
        private const val DEFAULT_SUB_HEADING = ""
        private const val DEFAULT_SUB_DESCRIPTION = ""
        private const val DEFAULT_HEADING_COLOR = Color.BLACK
        private const val DEFAULT_SUB_HEADING_COLOR = Color.BLACK
        private const val DEFAULT_HEADING_ALL_CAPS = false
        private const val DEFAULT_EXPANDED = false
        private const val DEFAULT_EXPANDABLE = true
        private const val DEFAULT_SHOW_ICON = true
        private const val DEFAULT_SUB_HEADING_ENABLED = false
        private const val DEFAULT_BACKGROUND_COLOR = Color.WHITE
        private const val DEFAULT_CORNER_RADIUS = 20f
    }
}