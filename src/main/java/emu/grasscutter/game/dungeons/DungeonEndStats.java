package emu.grasscutter.game.dungeons;

import emu.grasscutter.game.dungeons.dungeon_results.BaseDungeonResult;
import lombok.Getter;

public class DungeonEndStats {
    @Getter private final int killedMonsters;
    @Getter private final int timeTaken;
    @Getter private final int openChestCount;
    @Getter private final BaseDungeonResult.DungeonEndReason dungeonResult;

    public DungeonEndStats(
            int killedMonsters,
            int timeTaken,
            int openChestCount,
            BaseDungeonResult.DungeonEndReason dungeonResult) {
        this.killedMonsters = killedMonsters;
        this.timeTaken = timeTaken;
        this.dungeonResult = dungeonResult;
        this.openChestCount = openChestCount;
    }
}
