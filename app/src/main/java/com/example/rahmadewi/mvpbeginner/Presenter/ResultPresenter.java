package com.example.rahmadewi.mvpbeginner.Presenter;

import com.example.rahmadewi.mvpbeginner.Base.BasePresenter;
import com.example.rahmadewi.mvpbeginner.View.Result.ResultView;

/**
 * Created by Rahmadewi on 7/27/2017.
 */
public class ResultPresenter implements BasePresenter<ResultView>{

    private ResultView mView;

    @Override
    public void onAttach(ResultView view) {
        mView = view;
    }

    @Override
    public void onDetach() {
        mView = null;
    }

    public void showResult(final String text){
        mView.onShowResult(text);
    }
}
