package emu.grasscutter.game.tower;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class TowerScheduleConfig {
    private int scheduleId;

    private Date scheduleStartTime;
    private Date nextScheduleChangeTime;

}
