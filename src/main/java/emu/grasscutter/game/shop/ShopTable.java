package emu.grasscutter.game.shop;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Setter
@Getter
public class ShopTable {
    private int shopId;
    private List<ShopInfo> items = new ArrayList<>();

}
