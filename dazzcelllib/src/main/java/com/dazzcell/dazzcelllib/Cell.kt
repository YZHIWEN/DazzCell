package com.dazzcell.dazzcelllib

import android.os.Bundle
import android.view.View

/**
 * Created by yangzhiwen on 17/7/31.
 */
open class Cell(name: String, view: View) {

    var parentCell: Cell? = null

    open fun onCreate(params: Bundle) {}

    open fun onStart() {}

    open fun onResume() {}

    open fun onPause() {}

    open fun onStop() {}

    open fun onDestroy() {}

    open fun onSaveInstanceState(params: Bundle) {}

    open fun onCellStatusReceive(status: String) {}

    fun postToParentCellStatus(status: String) {
        parentCell?.onCellStatusReceive(status)
    }
}