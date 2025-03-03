package emu.grasscutter.data;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.data.ResourceLoader.AvatarConfig;
import emu.grasscutter.data.excels.reliquary.*;
import emu.grasscutter.game.managers.blossom.BlossomConfig;
import emu.grasscutter.game.world.SpawnDataEntry;
import emu.grasscutter.utils.objects.WeightedList;
import it.unimi.dsi.fastutil.ints.*;
import java.util.*;
import lombok.*;

public class GameDepot {
    public static final int[] BLOCK_SIZE = new int[] {50, 500}; // Scales

    private static final Int2ObjectMap<WeightedList<ReliquaryMainPropData>> relicRandomMainPropDepot =
            new Int2ObjectOpenHashMap<>();
    private static final Int2ObjectMap<List<ReliquaryMainPropData>> relicMainPropDepot =
            new Int2ObjectOpenHashMap<>();
    private static final Int2ObjectMap<List<ReliquaryAffixData>> relicAffixDepot =
            new Int2ObjectOpenHashMap<>();

    @Getter @Setter private static Map<String, AvatarConfig> playerAbilities = new HashMap<>();

    @Getter
    private static final HashMap<SpawnDataEntry.GridBlockId, ArrayList<SpawnDataEntry>> spawnLists =
            new HashMap<>();

    @Getter @Setter private static BlossomConfig blossomConfig;

    public static void load() {
        for (ReliquaryMainPropData data : GameData.getReliquaryMainPropDataMap().values()) {
            if (data.getWeight() <= 0 || data.getPropDepotId() <= 0) {
                continue;
            }
            List<ReliquaryMainPropData> list =
                    relicMainPropDepot.computeIfAbsent(data.getPropDepotId(), k -> new ArrayList<>());
            list.add(data);
            WeightedList<ReliquaryMainPropData> weightedList =
                    relicRandomMainPropDepot.computeIfAbsent(
                            data.getPropDepotId(), k -> new WeightedList<>());
            weightedList.add(data.getWeight(), data);
        }
        for (ReliquaryAffixData data : GameData.getReliquaryAffixDataMap().values()) {
            if (data.getWeight() <= 0 || data.getDepotId() <= 0) {
                continue;
            }
            List<ReliquaryAffixData> list =
                    relicAffixDepot.computeIfAbsent(data.getDepotId(), k -> new ArrayList<>());
            list.add(data);
        }
        // Let the server owner know if theyre missing weights
        if (relicMainPropDepot.isEmpty() || relicAffixDepot.isEmpty()) {
            Grasscutter.getLogger()
                    .error(
                            "Relic properties are missing weights! Please check your ReliquaryMainPropExcelConfigData or ReliquaryAffixExcelConfigData files in your ExcelBinOutput folder.");
        }
    }

    public static ReliquaryMainPropData getRandomRelicMainProp(int depot) {
        WeightedList<ReliquaryMainPropData> depotList = relicRandomMainPropDepot.get(depot);
        if (depotList == null) {
            return null;
        }
        return depotList.next();
    }

    public static List<ReliquaryMainPropData> getRelicMainPropList(int depot) {
        return relicMainPropDepot.get(depot);
    }

    public static List<ReliquaryAffixData> getRelicAffixList(int depot) {
        return relicAffixDepot.get(depot);
    }

    public static void addSpawnListById(
            HashMap<SpawnDataEntry.GridBlockId, ArrayList<SpawnDataEntry>> data) {
        spawnLists.putAll(data);
    }
}
