package emu.grasscutter.game.shop;

import dev.morphia.annotations.Entity;
import lombok.Getter;

@Getter
@Entity
public class ShopLimit {
    private int shopGoodId;
    private int hasBought;
    private int hasBoughtInPeriod = 0;
    private int nextRefreshTime = 0;

    public void setShopGoodId(int shopGoodId) {
        this.shopGoodId = shopGoodId;
    }

    public void setHasBought(int hasBought) {
        this.hasBought = hasBought;
    }

    public void setNextRefreshTime(int nextRefreshTime) {
        this.nextRefreshTime = nextRefreshTime;
    }

    public void setHasBoughtInPeriod(int hasBoughtInPeriod) {
        this.hasBoughtInPeriod = hasBoughtInPeriod;
    }
}
