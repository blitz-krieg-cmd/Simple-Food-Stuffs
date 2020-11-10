package me.kriegcmd.simplefoodstuffs.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class Brownie extends Item {

    private static final Food food = (new Food.Builder()).hunger(3).saturation(1.7F).build();

    public Brownie() {
        super(new Properties().food(food).group(ItemGroup.FOOD));
    }
}
