package com.freehand.filemanger.fragments.left_menu

import com.freehand.base_component.core.fragment.BaseFragmentBinding
import com.freehand.filemanger.viewmodels.left_menu.LeftMenuVM

/**
 * Created by minhpham on 5/2/19.
 * Purpose: .
 * Copyright © 2019 Pham Duy Minh. All rights reserved.
 */
class FrgLeftMenu : BaseFragmentBinding<LeftMenuVM>() {
    override fun onCreateViewModel(): LeftMenuVM {
        return LeftMenuVM()
    }
}