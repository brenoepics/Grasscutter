package emu.grasscutter.game.dungeons;

import lombok.Getter;

import java.util.List;

@Getter
public class DungeonDropEntry {
    private List<Integer> counts;
    private List<Integer> items;
    private List<Integer> probabilities;
    private List<Integer> itemProbabilities;
    private boolean mpDouble;

    public void setCounts(List<Integer> counts) {
        this.counts = counts;
    }

    public void setItems(List<Integer> items) {
        this.items = items;
    }

    public void setProbabilities(List<Integer> probabilities) {
        this.probabilities = probabilities;
    }

    public void setItemProbabilities(List<Integer> itemProbabilities) {
        this.itemProbabilities = itemProbabilities;
    }

    public void setMpDouble(boolean mpDouble) {
        this.mpDouble = mpDouble;
    }
}
