package emu.grasscutter.server.event.dispatch;

import emu.grasscutter.server.event.types.ServerEvent;
import lombok.Getter;

@Getter
public final class QueryAllRegionsEvent extends ServerEvent {
    private String regionList;

    public QueryAllRegionsEvent(String regionList) {
        super(Type.DISPATCH);

        this.regionList = regionList;
    }

    public void setRegionList(String regionList) {
        this.regionList = regionList;
    }
}
