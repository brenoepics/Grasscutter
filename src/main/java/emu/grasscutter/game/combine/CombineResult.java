package emu.grasscutter.game.combine;

import emu.grasscutter.data.common.ItemParamData;
import lombok.Getter;

import java.util.List;

@Getter
public class CombineResult {
    private List<ItemParamData> material;
    private List<ItemParamData> result;
    private List<ItemParamData> extra;
    private List<ItemParamData> back;

    public void setMaterial(List<ItemParamData> material) {
        this.material = material;
    }

    public void setResult(List<ItemParamData> result) {
        this.result = result;
    }

    public void setExtra(List<ItemParamData> extra) {
        this.extra = extra;
    }

    public void setBack(List<ItemParamData> back) {
        this.back = back;
    }
}
