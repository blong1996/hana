package finalproject.csci205.com.ymca.model.Pom;

import com.orm.SugarRecord;

/**
 * Created by ceh024 on 11/6/16.
 */

public class PomodoroSettings extends SugarRecord {
    private int sessionTime;
    private int normBreakTime;
    private int longBreak;
    private int numCyclesTillBreak;

    public PomodoroSettings(int sessionTime, int normBreakTime, int longBreak, int numCyclesTillBreak) {
        this.sessionTime = sessionTime;
        this.normBreakTime = normBreakTime;
        this.longBreak = longBreak;
        this.numCyclesTillBreak = numCyclesTillBreak;
    }

    public PomodoroSettings() {

    }

    public int getSessionTime() {
        return sessionTime;
    }

    public void setSessionTime(int sessionTime) {
        this.sessionTime = sessionTime;
    }

    public int getNormBreakTime() {
        return normBreakTime;
    }

    public void setNormBreakTime(int normBreakTime) {
        this.normBreakTime = normBreakTime;
    }

    public int getLongBreak() {
        return longBreak;
    }

    public void setLongBreak(int longBreak) {
        this.longBreak = longBreak;
    }

    public int getNumCyclesTillBreak() {
        return numCyclesTillBreak;
    }

    public void setNumCyclesTillBreak(int numCyclesTillBreak) {
        this.numCyclesTillBreak = numCyclesTillBreak;
    }
}
