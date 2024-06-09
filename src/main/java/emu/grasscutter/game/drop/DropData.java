package emu.grasscutter.game.drop;

import lombok.Getter;

@Getter
@Deprecated
public class DropData {
    private int minWeight;
    private int maxWeight;
    private int itemId;
    private int minCount;
    private int maxCount;
    private boolean share = false;
    private boolean give = false;

    public void setGive(boolean give) {
        this.give = give;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public void setIsShare(boolean share) {
        this.share = share;
    }
}
