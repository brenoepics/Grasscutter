package emu.grasscutter.data.excels;

import emu.grasscutter.data.*;
import emu.grasscutter.data.ResourceType.LoadPriority;
import emu.grasscutter.data.common.OpenCondData;
import java.util.List;
import lombok.Getter;

@ResourceType(
        name = {
            "FetterInfoExcelConfigData.json",
            "FettersExcelConfigData.json",
            "FetterStoryExcelConfigData.json",
            "PhotographExpressionExcelConfigData.json",
            "PhotographPosenameExcelConfigData.json"
        },
        loadPriority = LoadPriority.HIGHEST)
public class FetterData extends GameResource {
    @Getter private int avatarId;
    private int fetterId;
    private List<OpenCondData> openCond;

    @Override
    public int getId() {
        return fetterId;
    }

    public List<OpenCondData> getOpenConds() {
        return openCond;
    }

    @Override
    public void onLoad() {}
}
