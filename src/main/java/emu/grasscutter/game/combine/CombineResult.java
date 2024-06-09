package emu.grasscutter.game.combine;

import emu.grasscutter.data.common.ItemParamData;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class CombineResult {
    private List<ItemParamData> material;
    private List<ItemParamData> result;
    private List<ItemParamData> extra;
    private List<ItemParamData> back;

}
