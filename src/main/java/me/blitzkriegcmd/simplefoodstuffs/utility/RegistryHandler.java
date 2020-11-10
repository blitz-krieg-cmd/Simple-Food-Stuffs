package me.blitzkriegcmd.simplefoodstuffs.utility;

import me.blitzkriegcmd.simplefoodstuffs.Simplefoodstuffs;
import me.blitzkriegcmd.simplefoodstuffs.items.*;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Simplefoodstuffs.MOD_ID);
    //public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Simplefoodstuffs.MOD_ID);

    public static void init() {
        //BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
    public static final RegistryObject<Item> APPLE_PIE_ITEM = ITEMS.register("apple_pie", ApplePie::new);
    public static final RegistryObject<Item> FRIED_EGG_ITEM = ITEMS.register("fried_egg", FriedEgg::new);
    public static final RegistryObject<Item> SASHIMI_ITEM = ITEMS.register("sashimi", Sashimi::new);
    public static final RegistryObject<Item> CHOCOLATE_BAR_ITEM = ITEMS.register("chocolate_bar", ChocolateBar::new);
    public static final RegistryObject<Item> BROWNIE_ITEM = ITEMS.register("brownie", Brownie::new);
    public static final RegistryObject<Item> CHORUS_FRUIT_SMOOTHIE_ITEM = ITEMS.register("chorus_fruit_smoothie", ChorusFruitSmoothie::new);
    public static final RegistryObject<Item> STEAK_SANDWICH_ITEM = ITEMS.register("steak_sandwich", SteakSandwich::new);
    public static final RegistryObject<Item> STEAK_AND_EGG_SANDWICH_ITEM = ITEMS.register("steak_and_egg_sandwich", SteakEggSandwich::new);

    // Blocks
    //public static final RegistryObject<Block> RUBY_ORE_BLOCK = BLOCKS.register("ruby_ore_block", RubyOreBlock::new);
    //public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);

    // Block Items
    //public static final RegistryObject<Item> RUBY_ORE_ITEM = ITEMS.register("ruby_ore_item", () -> new BlockItemBase(RUBY_ORE_BLOCK.get()));
    //public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block_item",  () -> new BlockItemBase(RUBY_BLOCK.get()));

}
