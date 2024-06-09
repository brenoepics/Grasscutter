package emu.grasscutter.data.common;

import lombok.Getter;

import java.util.List;

@Getter
public class OpenCondData {
    private String condType;
    private List<Integer> paramList;

    public void setCondType(String cType) {
        condType = cType;
    }

    public void setParamList(List<Integer> pList) {
        paramList = pList;
    }
}
