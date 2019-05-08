package com.freehand.filemanger.viewmodels.home

import com.freehand.base_component.core.view_model.BaseViewModel
import com.freehand.filemanger.BR
import com.freehand.filemanger.R

class HomeVM : BaseViewModel() {
    override fun defineVariableID(): Int {
        return BR.vm
    }

    override fun defineLayoutDefault(): Int {
        return R.layout.frg_home
    }
}