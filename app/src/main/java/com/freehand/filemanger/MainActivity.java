package com.freehand.filemanger;

import android.support.v4.widget.DrawerLayout;

import com.freehand.base_component.core.activity.BaseDrawerActivity;
import com.freehand.filemanger.fragments.home.FrgHome;
import com.freehand.filemanger.fragments.left_menu.FrgLeftMenu;

public class MainActivity extends BaseDrawerActivity {

    @Override
    protected int getFragmentContainerResId() {
        return R.id.rl_main_container;
    }

    @Override
    protected int defineLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected DrawerLayout getDrawer() {
        return findViewById(R.id.draw_layout);
    }

    @Override
    protected int defineLeftMenuContainId() {
        return R.id.fl_left_menu;
    }

    @Override
    protected void initView() {
        super.initView();
        //TODO add left menu here
        replaceLeftMenu(new FrgLeftMenu());
        pushFrg(new FrgHome(),true);
    }
}
