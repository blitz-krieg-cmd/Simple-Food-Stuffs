package me.blitzkriegcmd.simplefoodstuffs.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class SteakEggSandwich extends Item {

    private static final Food food = (new Food.Builder()).hunger(9).saturation(0.7F).build();

    public SteakEggSandwich() {
        super(new Properties().food(food).group(ItemGroup.FOOD));
    }
}
