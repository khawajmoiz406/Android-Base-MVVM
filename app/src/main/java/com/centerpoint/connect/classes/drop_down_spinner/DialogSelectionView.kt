package com.centerpoint.connect.classes.drop_down_spinner

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.PopupWindow
import androidx.constraintlayout.widget.ConstraintLayout
import com.centerpoint.connect.R
import com.centerpoint.connect.base.listeners.BaseAdapterListener
import com.centerpoint.connect.classes.drop_down_spinner.adapter.PopupAdapter
import com.centerpoint.connect.databinding.LayoutPopupViewBinding
import com.centerpoint.connect.databinding.LayoutSelectedViewBinding

/**
@author Khawaja Moiz
created on 1/17/23
 **/
class DialogSelectionView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr), BaseAdapterListener {

    private var rootBinding: LayoutSelectedViewBinding? = null
    private var popupBinding: LayoutPopupViewBinding? = null
    private var popup: PopupWindow? = null
    private val adapter: PopupAdapter by lazy { PopupAdapter(this) }

    private var hint = DEFAULT_SELECTION_HINT
    private var showHint = DEFAULT_SHOW_SELECTION_HINT
    private var autoSelectFirst = DEFAULT_AUTO_SELECT_FIRST
    private var itemsList = listOf<String>()

    init {
        init(attrs, defStyleAttr)
    }

    private fun init(attrs: AttributeSet?, defStyleAttr: Int) {
        val typedArray =
            context.obtainStyledAttributes(attrs, R.styleable.DialogSelectionView, defStyleAttr, 0)
        initAttrs(typedArray)
        initView()
        typedArray.recycle()
    }

    private fun initAttrs(typedArray: TypedArray) {
        hint = typedArray.getString(R.styleable.DialogSelectionView_selection_hint)
            ?: DEFAULT_SELECTION_HINT
        showHint = typedArray.getBoolean(
            R.styleable.DialogSelectionView_show_selection_hint,
            DEFAULT_SHOW_SELECTION_HINT
        )
        autoSelectFirst = typedArray.getBoolean(
            R.styleable.DialogSelectionView_auto_select_first,
            DEFAULT_AUTO_SELECT_FIRST
        )
    }

    private fun initView() {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        rootBinding = LayoutSelectedViewBinding.inflate(inflater, this, true).apply {
            expanded = false
            textView.text = getSelectionTextAccordingly()
            root.setOnClickListener {
                if ((popup == null || popup?.isShowing == false) && itemsList.isNotEmpty()) {
                    showPopup()
                    expanded = true
                }
            }
        }
        initPopup()
    }

    private fun getSelectionTextAccordingly(): String {
        return if (!autoSelectFirst) {
            if (showHint) hint else ""
        } else {
            if (itemsList.isEmpty()) {
                if (showHint) hint else ""
            } else itemsList[0]
        }
    }

    private fun initPopup() {
        popupBinding = LayoutPopupViewBinding.inflate(
            LayoutInflater.from(context),
            null,
            false
        )
        popupBinding?.adapter = adapter.apply { addData(itemsList) }
    }

    private fun onListChanged() {
        adapter.addData(itemsList)
        rootBinding?.textView?.text = getSelectionTextAccordingly()
    }

    private fun showPopup() {
        popup = PopupWindow(
            popupBinding?.root,
            rootBinding?.root?.width ?: 0,
            WRAP_CONTENT,
            true
        ).apply {
            elevation = 0f
            isOutsideTouchable = false
            setOnDismissListener {
                rootBinding?.expanded = false
            }
            showAsDropDown(rootBinding?.root)
        }
    }

    /*
     * Adapter Listener
     */
    override fun onItemClick(position: Int, item: Any) {
        rootBinding?.textView?.text = item.toString()
        popup?.dismiss()
    }

    /*
     * Getters / Setters for binding
     */
    var mItemsList: List<String>
        get() = itemsList
        set(value) {
            itemsList = value
            onListChanged()
            invalidate()
        }

    val mSelected: String
        get() {
            val value = rootBinding?.textView?.text.toString()
            return if (value.isEmpty() || value.equals(hint, true)) ""
            else value
        }

    companion object {
        private const val DEFAULT_SELECTION_HINT = ""
        private const val DEFAULT_SHOW_SELECTION_HINT = false
        private const val DEFAULT_AUTO_SELECT_FIRST = false
    }
}