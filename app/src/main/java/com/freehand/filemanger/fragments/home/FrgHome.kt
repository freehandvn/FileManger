package com.freehand.filemanger.fragments.home

import com.freehand.base_component.core.fragment.BaseFragmentBinding
import com.freehand.filemanger.viewmodels.home.HomeVM

class FrgHome : BaseFragmentBinding<HomeVM>() {
    override fun onCreateViewModel(): HomeVM {
        return HomeVM()
    }
}