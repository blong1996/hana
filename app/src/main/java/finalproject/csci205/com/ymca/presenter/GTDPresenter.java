package finalproject.csci205.com.ymca.presenter;

import android.support.v4.app.Fragment;

import finalproject.csci205.com.ymca.view.modulues.GTD;

/**
 * Created by ceh024 on 11/6/16.
 */

public class GTDPresenter implements GTDPresenterInterface, Presenter {


    private GTD view;


    @Override
    public void setView(Fragment f) {
        this.view = (GTD) f;
    }
}
