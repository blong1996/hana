package finalproject.csci205.com.ymca.presenter;

import android.support.v4.app.Fragment;

import finalproject.csci205.com.ymca.view.modulues.Pomodoro;

/**
 * Created by ceh024 on 11/6/16.
 */

public class PomodoroPresenter implements Presenter {

    private Pomodoro view;

    @Override
    public void setView(Fragment f) {
        this.view = (Pomodoro) f;
    }
}
