package me.blitzkriegcmd.simplefoodstuffs.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ApplePie extends Item {

    private static final Food food = (new Food.Builder()).hunger(8).saturation(0.4F).build();

    public ApplePie() {
        super(new Item.Properties().food(food).group(ItemGroup.FOOD));
    }
}
