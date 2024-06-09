package emu.grasscutter.game.inventory;

import lombok.Getter;

@Getter
public class ItemDef {
    private int itemId;
    private int count;

    public ItemDef(int itemId, int count) {
        this.itemId = itemId;
        this.count = count;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
