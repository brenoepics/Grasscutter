package emu.grasscutter.game.managers.forging;

import dev.morphia.annotations.Entity;
import lombok.Getter;

@Entity
public class ActiveForgeData {
    @Getter
    private int forgeId;
    @Getter
    private int avatarId;
    @Getter
    private int count;

    @Getter
    private int startTime;
    @Getter
    private int forgeTime;

    private int lastUnfinishedCount;
    @Getter
    private boolean changed;

    public int getFinishedCount(int currentTime) {
        int timeDelta = currentTime - this.startTime;
        int finishedCount = timeDelta / this.forgeTime;

        return Math.min(finishedCount, this.count);
    }

    public int getUnfinishedCount(int currentTime) {
        return this.count - this.getFinishedCount(currentTime);
    }

    public int getNextFinishTimestamp(int currentTime) {
        return (currentTime >= this.getTotalFinishTimestamp())
                ? this.getTotalFinishTimestamp()
                : (this.getFinishedCount(currentTime) * this.forgeTime + this.forgeTime + this.startTime);
    }

    public int getTotalFinishTimestamp() {
        return this.startTime + this.forgeTime * this.count;
    }

    public void setForgeId(int value) {
        this.forgeId = value;
    }

    public void setAvatarId(int value) {
        this.avatarId = value;
    }

    public void setCount(int value) {
        this.count = value;
    }

    public void setStartTime(int value) {
        this.startTime = value;
    }

    public void setForgeTime(int value) {
        this.forgeTime = value;
    }

    public void setChanged(boolean value) {
        this.changed = value;
    }

    public boolean updateChanged(int currentTime) {
        int currentUnfinished = this.getUnfinishedCount(currentTime);

        if (currentUnfinished != this.lastUnfinishedCount) {
            this.changed = true;
            this.lastUnfinishedCount = currentUnfinished;
        }

        return this.changed;
    }
}
