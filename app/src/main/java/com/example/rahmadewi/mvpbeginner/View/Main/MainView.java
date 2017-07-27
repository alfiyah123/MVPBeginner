package com.example.rahmadewi.mvpbeginner.View.Main;

import com.example.rahmadewi.mvpbeginner.Base.BaseView;
import com.example.rahmadewi.mvpbeginner.Models.Data;

/**
 * Created by Rahmadewi on 7/27/2017.
 */
public interface MainView extends BaseView{
    void onShowFragment(Data data);
}