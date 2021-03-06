package com.sa.baseproject.utils

import android.widget.Toast
import com.sa.baseproject.BaseApp

/**
 * Purpose  - Class summary
 * @author  - amit.prajapati
 * Created  - 28/12/17
 * Modified - 28/12/17
 */
object ToastUtils {
    fun shortToast(stringCode: Int = 0, stringText: String? = null) {
        if (stringCode != 0) {
            Toast.makeText(BaseApp.Companion.instance!!, BaseApp.Companion.instance!!.getText(stringCode), Toast.LENGTH_SHORT).show()
        } else if (stringText != null) {
            Toast.makeText(BaseApp.Companion.instance!!, stringText, Toast.LENGTH_SHORT).show()
        }
    }

    fun longToast(stringCode: Int = 0, stringText: String? = null) {
        if (stringCode != 0) {
            Toast.makeText(BaseApp.Companion.instance!!, BaseApp.Companion.instance!!.getText(stringCode), Toast.LENGTH_LONG).show()
        } else if (stringText != null) {
            Toast.makeText(BaseApp.Companion.instance!!, stringText, Toast.LENGTH_LONG).show()
        }
    }

}