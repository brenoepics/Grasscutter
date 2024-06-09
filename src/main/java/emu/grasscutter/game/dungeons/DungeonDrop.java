package emu.grasscutter.game.dungeons;

import lombok.Getter;

import java.util.List;

@Getter
public class DungeonDrop {
    private int dungeonId;
    private List<DungeonDropEntry> drops;

    public void setDungeonId(int dungeonId) {
        this.dungeonId = dungeonId;
    }

    public void setDrops(List<DungeonDropEntry> drops) {
        this.drops = drops;
    }
}
