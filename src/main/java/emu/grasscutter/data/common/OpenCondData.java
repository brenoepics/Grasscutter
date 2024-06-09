package emu.grasscutter.data.common;

import java.util.List;

public class OpenCondData {
    private String condType;
    private List<Integer> paramList;

    public String getCondType() {
        return condType;
    }

    public void setCondType(String cType) {
        condType = cType;
    }

    public List<Integer> getParamList() {
        return paramList;
    }

    public void setParamList(List<Integer> pList) {
        paramList = pList;
    }
}
