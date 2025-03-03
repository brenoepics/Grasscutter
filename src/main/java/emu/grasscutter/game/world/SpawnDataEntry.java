package emu.grasscutter.game.world;

import emu.grasscutter.data.GameDepot;
import java.util.*;
import lombok.*;

@Getter
public class SpawnDataEntry {
    @Setter private transient SpawnGroupEntry group;
    private int monsterId;
    private int gadgetId;
    private int configId;
    private int level;
    private int poseId;
    private int gatherItemId;
    private int gadgetState;
    private Position pos;
    private Position rot;

    public GridBlockId getBlockId() {
        int scale = GridBlockId.getScale(gadgetId);
        return new GridBlockId(
                group.sceneId,
                scale,
                (int) (pos.getX() / GameDepot.BLOCK_SIZE[scale]),
                (int) (pos.getZ() / GameDepot.BLOCK_SIZE[scale]));
    }

    @Getter
    public static class SpawnGroupEntry {
        private int sceneId;
        private int groupId;
        private int blockId;
        @Setter private List<SpawnDataEntry> spawns;
    }

    @Getter
    public static class GridBlockId {
        private final int sceneId;
        private final int scale;
        private final int x;
        private final int z;

        public GridBlockId(int sceneId, int scale, int x, int z) {
            this.sceneId = sceneId;
            this.scale = scale;
            this.x = x;
            this.z = z;
        }

        public static GridBlockId[] getAdjacentGridBlockIds(int sceneId, Position pos) {
            GridBlockId[] results = new GridBlockId[5 * 5 * GameDepot.BLOCK_SIZE.length];
            int t = 0;
            for (int scale = 0; scale < GameDepot.BLOCK_SIZE.length; scale++) {
                int x = ((int) (pos.getX() / GameDepot.BLOCK_SIZE[scale]));
                int z = ((int) (pos.getZ() / GameDepot.BLOCK_SIZE[scale]));
                for (int i = x - 2; i < x + 3; i++) {
                    for (int j = z - 2; j < z + 3; j++) {
                        results[t++] = new GridBlockId(sceneId, scale, i, j);
                    }
                }
            }
            return results;
        }

        public static int getScale(int gadgetId) {
            return 0; // you should implement here,this is index of GameDepot.BLOCK_SIZE
        }

        @Override
        public String toString() {
            return "SpawnDataEntryScaledPoint{"
                    + "sceneId="
                    + sceneId
                    + ", scale="
                    + scale
                    + ", x="
                    + x
                    + ", z="
                    + z
                    + '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            GridBlockId that = (GridBlockId) o;
            return sceneId == that.sceneId && scale == that.scale && x == that.x && z == that.z;
        }

        @Override
        public int hashCode() {
            return Objects.hash(sceneId, scale, x, z);
        }
    }
}
