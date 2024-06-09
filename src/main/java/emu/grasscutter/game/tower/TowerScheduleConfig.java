package emu.grasscutter.game.tower;

import lombok.Getter;

import java.util.Date;

@Getter
public class TowerScheduleConfig {
    private int scheduleId;

    private Date scheduleStartTime;
    private Date nextScheduleChangeTime;

    public void setScheduleId(int scheduleId) {
        this.scheduleId = scheduleId;
    }

    public void setScheduleStartTime(Date scheduleStartTime) {
        this.scheduleStartTime = scheduleStartTime;
    }

    public void setNextScheduleChangeTime(Date nextScheduleChangeTime) {
        this.nextScheduleChangeTime = nextScheduleChangeTime;
    }
}
