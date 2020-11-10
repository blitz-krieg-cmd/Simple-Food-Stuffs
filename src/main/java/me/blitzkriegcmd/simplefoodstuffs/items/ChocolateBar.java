package me.blitzkriegcmd.simplefoodstuffs.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ChocolateBar extends Item {

    private static final Food food = (new Food.Builder()).hunger(2).saturation(1.5F).build();

    public ChocolateBar() {
        super(new Properties().food(food).group(ItemGroup.FOOD));
    }
}
