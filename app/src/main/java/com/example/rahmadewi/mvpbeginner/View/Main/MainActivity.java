package com.example.rahmadewi.mvpbeginner.View.Main;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.rahmadewi.mvpbeginner.Models.Data;
import com.example.rahmadewi.mvpbeginner.Presenter.MainPresenter;
import com.example.rahmadewi.mvpbeginner.R;
import com.example.rahmadewi.mvpbeginner.View.Result.ResultFragment;

public class MainActivity extends AppCompatActivity implements MainView{

    MainPresenter presenter;

    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initPresenter();
        onAttachView();
    }

    @Override
    public void onShowFragment(Data data) {
        final Bundle bundle = new Bundle();
        bundle.putString("data",data.getText());

        final String tag = ResultFragment.class.getSimpleName();
        final Fragment fragment = ResultFragment.newInstance();
        fragment.setArguments(bundle);

        final FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fl_main, fragment, tag);
        fragmentTransaction.commit();

    }

    @Override
    public void onAttachView() {
        presenter.onAttach(this);
        addButtonListener();
    }

    @Override
    public void onDetachView() {
        presenter.onDetach();
    }

    private void initPresenter() {
        presenter = new MainPresenter();
    }

    private void addButtonListener() {
        final Button button = (Button) findViewById(R.id.btn_main);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                button.setVisibility(View.GONE);
                presenter.onShowFragment();
            }
        });
    }
}


