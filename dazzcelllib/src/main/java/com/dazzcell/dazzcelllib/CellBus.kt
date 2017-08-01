package com.dazzcell.dazzcelllib

/**
 * Created by yangzhiwen on 17/8/1.
 */
class CellBus(var rootCell: Cell) {

    fun dispatch(cellName: String, status: String, params: Any) {

    }

    fun dispatch(status: String, params: Any) {
        rootCell.onCellStatusReceive(status, params)
    }
}