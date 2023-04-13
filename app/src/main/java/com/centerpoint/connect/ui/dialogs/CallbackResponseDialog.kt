package com.centerpoint.connect.ui.dialogs

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.Gravity
import android.view.View
import androidx.fragment.app.FragmentManager
import com.centerpoint.connect.R
import com.centerpoint.connect.base.BaseDialogFragment
import com.centerpoint.connect.base.BaseViewModel
import com.centerpoint.connect.constants.CALLBACK_DURATION
import com.centerpoint.connect.databinding.DialogCallbackResponseBinding
import com.centerpoint.connect.models.helper.ResponseCallback

class CallbackResponseDialog(
    private var callback: ResponseCallback? = null
) : BaseDialogFragment<DialogCallbackResponseBinding>() {
    override fun getViewModel(): BaseViewModel? = null
    override fun getLayoutId(): Int = R.layout.dialog_callback_response
    override fun cancelable(): Boolean = false
    override fun wrapWidth(): Boolean = false
    override fun dimAmount(): Float = 0.0f
    override fun gravity(): Int = Gravity.TOP
    override fun sizePercentage(): Double = 1.0
    override fun getTheme(): Int = R.style.FullScreenDialogTheme

    private val handler: Handler by lazy { Handler(Looper.getMainLooper()) }

    override fun show(manager: FragmentManager, tag: String?) {
        handler.postDelayed({
            dismiss()
        }, CALLBACK_DURATION)
        super.show(manager, tag)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.data = callback
    }
}