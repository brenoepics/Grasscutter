package emu.grasscutter.server.event.dispatch;

import emu.grasscutter.server.event.types.ServerEvent;
import lombok.Getter;

@Getter
public final class QueryCurrentRegionEvent extends ServerEvent {
    private String regionInfo;

    public QueryCurrentRegionEvent(String regionInfo) {
        super(Type.DISPATCH);

        this.regionInfo = regionInfo;
    }

    public void setRegionInfo(String regionInfo) {
        this.regionInfo = regionInfo;
    }
}
