package com.dazzcell.dazzcelllib

import android.view.View

/**
 * Created by yangzhiwen on 17/7/31.
 */
class CellGroup(name: String, view: View) : Cell(name, view) {

    var childCell = mutableMapOf<String, Cell>()

    fun addCell(name: String, cell: Cell) {
        cell.parentCell = this
        childCell[name] = cell
    }

    fun removeCell(name: String) {
        val cell = childCell.remove(name)
        cell?.parentCell = null
    }

    fun dispatchStatusToChildCell(status: String, params: Any) {
        childCell.iterator().forEach { it -> it.value.onCellStatusReceive(status, params) }
    }

    fun postCellStatus(status: String) {

    }

}