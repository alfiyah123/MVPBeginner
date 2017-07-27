package com.example.rahmadewi.mvpbeginner.Presenter;

import com.example.rahmadewi.mvpbeginner.Base.BasePresenter;
import com.example.rahmadewi.mvpbeginner.Models.Data;
import com.example.rahmadewi.mvpbeginner.View.Main.MainView;

/**
 * Created by Rahmadewi on 7/27/2017.
 */
public class MainPresenter implements BasePresenter<MainView>{
    private MainView mView;

    @Override
    public void onAttach(MainView view) {
        mView = view;
    }

    @Override
    public void onDetach() {
        mView = null;
    }

    public void onShowFragment(){
        final Data data = new Data();
        data.setText("Hello from data");

        mView.onShowFragment(data);
    }
}
