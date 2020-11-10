package me.blitzkriegcmd.simplefoodstuffs.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class SteakSandwich extends Item {

    private static final Food food = (new Food.Builder()).hunger(5).saturation(0.7F).build();

    public SteakSandwich() {
        super(new Properties().food(food).group(ItemGroup.FOOD));
    }
}
