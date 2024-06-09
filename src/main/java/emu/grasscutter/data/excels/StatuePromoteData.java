package emu.grasscutter.data.excels;

import emu.grasscutter.data.*;
import emu.grasscutter.data.common.ItemParamData;
import lombok.*;

@Getter
@ResourceType(name = "StatuePromoteExcelConfigData.json")
public class StatuePromoteData extends GameResource {
    @Setter private int level;
    @Setter private int cityId;
    @Setter private ItemParamData[] costItems;
    @Setter private int[] rewardIdList;
    @Setter private int stamina;

    @Override
    public int getId() {
        return (cityId << 8) + level;
    }
}
