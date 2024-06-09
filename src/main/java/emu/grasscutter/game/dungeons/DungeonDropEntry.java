package emu.grasscutter.game.dungeons;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class DungeonDropEntry {
    private List<Integer> counts;
    private List<Integer> items;
    private List<Integer> probabilities;
    private List<Integer> itemProbabilities;
    private boolean mpDouble;

}
