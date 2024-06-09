package emu.grasscutter.game.dungeons;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class DungeonDrop {
    private int dungeonId;
    private List<DungeonDropEntry> drops;

}
