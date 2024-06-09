package emu.grasscutter.game.combine;

import lombok.Getter;

import java.util.List;

@Getter
public class ReliquaryDecomposeEntry {
    private int configId;
    private List<Integer> items;

    public void setConfigId(int configId) {
        this.configId = configId;
    }

    public void setItems(List<Integer> items) {
        this.items = items;
    }
}
