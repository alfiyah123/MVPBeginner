package com.example.rahmadewi.mvpbeginner.Base;

import com.example.rahmadewi.mvpbeginner.View.Main.MainView;

/**
 * Created by Rahmadewi on 7/27/2017.
 */
public interface BasePresenter<T extends BaseView> {

    void onAttach(T view);

    void onDetach();
}
