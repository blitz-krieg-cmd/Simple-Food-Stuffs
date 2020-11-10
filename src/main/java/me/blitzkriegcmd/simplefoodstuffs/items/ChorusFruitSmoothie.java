package me.blitzkriegcmd.simplefoodstuffs.items;

import net.minecraft.item.*;

public class ChorusFruitSmoothie extends Item {

    private static final Food food = (new Food.Builder()).hunger(2).saturation(1F).build();

    public ChorusFruitSmoothie() {
        super(new Properties().food(food).group(ItemGroup.FOOD));

    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }


}
