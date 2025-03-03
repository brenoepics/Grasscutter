package emu.grasscutter.data.common;

import emu.grasscutter.game.props.ItemUseOp;
import lombok.Getter;

public class ItemUseData {
    private ItemUseOp useOp;
    @Getter private String[] useParam;

    public ItemUseOp getUseOp() {
        if (useOp == null) {
            useOp = ItemUseOp.ITEM_USE_NONE;
        }
        return useOp;
    }
}
