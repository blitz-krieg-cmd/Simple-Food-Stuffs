package me.blitzkriegcmd.simplefoodstuffs.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class FriedEgg extends Item {

    private static final Food food = (new Food.Builder()).hunger(3).saturation(0.4F).build();

    public FriedEgg() {
        super(new Properties().food(food).group(ItemGroup.FOOD));
    }
}
