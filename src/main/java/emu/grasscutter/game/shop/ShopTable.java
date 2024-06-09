package emu.grasscutter.game.shop;

import lombok.Getter;

import java.util.*;

@Getter
public class ShopTable {
    private int shopId;
    private List<ShopInfo> items = new ArrayList<>();

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public void setItems(List<ShopInfo> items) {
        this.items = items;
    }
}
