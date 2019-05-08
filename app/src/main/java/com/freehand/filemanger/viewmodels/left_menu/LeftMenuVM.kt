package com.freehand.filemanger.viewmodels.left_menu

import com.freehand.base_component.core.view_model.BaseViewModel
import com.freehand.filemanger.BR
import com.freehand.filemanger.R

/**
 * Created by minhpham on 5/2/19.
 * Purpose: .
 * Copyright © 2019 Pham Duy Minh. All rights reserved.
 */
class LeftMenuVM : BaseViewModel() {
    override fun defineVariableID(): Int {
        return BR.vm
    }

    override fun defineLayoutDefault(): Int {
        return R.layout.frg_left_menu
    }
}