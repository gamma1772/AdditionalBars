package com.codenamerevy.additionalbars.init;

import com.codenamerevy.additionalbars.AdditionalBars;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings("all")
public class ItemInit
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AdditionalBars.MODID);

    public static final RegistryObject<Item> GOLD_BARS                         = ITEMS.register("gold_bars",                          () -> new BlockItem(BlockInit.GOLD_BARS.get(),                            new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> ACACIA_BARS                       = ITEMS.register("acacia_bars",                        () -> new BlockItem(BlockInit.ACACIA_BARS.get(),                          new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> BIRCH_BARS                        = ITEMS.register("birch_bars",                         () -> new BlockItem(BlockInit.BIRCH_BARS.get(),                           new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> JUNGLE_BARS                       = ITEMS.register("jungle_bars",                        () -> new BlockItem(BlockInit.JUNGLE_BARS.get(),                          new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> OAK_BARS                          = ITEMS.register("oak_bars",                           () -> new BlockItem(BlockInit.OAK_BARS.get(),                             new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> DARK_OAK_BARS                     = ITEMS.register("dark_oak_bars",                      () -> new BlockItem(BlockInit.DARK_OAK_BARS.get(),                        new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> SPRUCE_BARS                       = ITEMS.register("spruce_bars",                        () -> new BlockItem(BlockInit.SPRUCE_BARS.get(),                          new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> CRIMSON_BARS                      = ITEMS.register("crimson_bars",                       () -> new BlockItem(BlockInit.CRIMSON_BARS.get(),                         new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> WARPED_BARS                       = ITEMS.register("warped_bars",                        () -> new BlockItem(BlockInit.WARPED_BARS.get(),                          new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));

    public static final RegistryObject<Item> CROSSED_IRON_BARS                 = ITEMS.register("crossed_iron_bars",                  () -> new BlockItem(BlockInit.CROSSED_IRON_BARS.get(),                    new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> CROSSED_GOLD_BARS                 = ITEMS.register("crossed_gold_bars",                  () -> new BlockItem(BlockInit.CROSSED_GOLD_BARS.get(),                    new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> CROSSED_ACACIA_BARS               = ITEMS.register("crossed_acacia_bars",                () -> new BlockItem(BlockInit.CROSSED_ACACIA_BARS.get(),                  new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> CROSSED_BIRCH_BARS                = ITEMS.register("crossed_birch_bars",                 () -> new BlockItem(BlockInit.CROSSED_BIRCH_BARS.get(),                   new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> CROSSED_JUNGLE_BARS               = ITEMS.register("crossed_jungle_bars",                () -> new BlockItem(BlockInit.CROSSED_JUNGLE_BARS.get(),                  new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> CROSSED_OAK_BARS                  = ITEMS.register("crossed_oak_bars",                   () -> new BlockItem(BlockInit.CROSSED_OAK_BARS.get(),                     new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> CROSSED_DARK_OAK_BARS             = ITEMS.register("crossed_dark_oak_bars",              () -> new BlockItem(BlockInit.CROSSED_DARK_OAK_BARS.get(),                new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> CROSSED_SPRUCE_BARS               = ITEMS.register("crossed_spruce_bars",                () -> new BlockItem(BlockInit.CROSSED_SPRUCE_BARS.get(),                  new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> CROSSED_CRIMSON_BARS              = ITEMS.register("crossed_crimson_bars",               () -> new BlockItem(BlockInit.CROSSED_CRIMSON_BARS.get(),                 new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> CROSSED_WARPED_BARS               = ITEMS.register("crossed_warped_bars",                () -> new BlockItem(BlockInit.CROSSED_WARPED_BARS.get(),                  new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));

    public static final RegistryObject<Item> HORIZONTAL_IRON_BARS              = ITEMS.register("horizontal_iron_bars",               () -> new BlockItem(BlockInit.HORIZONTAL_IRON_BARS.get(),                 new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_GOLD_BARS              = ITEMS.register("horizontal_gold_bars",               () -> new BlockItem(BlockInit.HORIZONTAL_GOLD_BARS.get(),                 new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_ACACIA_BARS            = ITEMS.register("horizontal_acacia_bars",             () -> new BlockItem(BlockInit.HORIZONTAL_ACACIA_BARS.get(),               new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_BIRCH_BARS             = ITEMS.register("horizontal_birch_bars",              () -> new BlockItem(BlockInit.HORIZONTAL_BIRCH_BARS.get(),                new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_JUNGLE_BARS            = ITEMS.register("horizontal_jungle_bars",             () -> new BlockItem(BlockInit.HORIZONTAL_JUNGLE_BARS.get(),               new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_OAK_BARS               = ITEMS.register("horizontal_oak_bars",                () -> new BlockItem(BlockInit.HORIZONTAL_OAK_BARS.get(),                  new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_DARK_OAK_BARS          = ITEMS.register("horizontal_dark_oak_bars",           () -> new BlockItem(BlockInit.HORIZONTAL_DARK_OAK_BARS.get(),             new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_SPRUCE_BARS            = ITEMS.register("horizontal_spruce_bars",             () -> new BlockItem(BlockInit.HORIZONTAL_SPRUCE_BARS.get(),               new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_CRIMSON_BARS           = ITEMS.register("horizontal_crimson_bars",            () -> new BlockItem(BlockInit.HORIZONTAL_CRIMSON_BARS.get(),              new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_WARPED_BARS            = ITEMS.register("horizontal_warped_bars",             () -> new BlockItem(BlockInit.HORIZONTAL_WARPED_BARS.get(),               new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));

    public static final RegistryObject<Item> HORIZONTAL_CROSSED_IRON_BARS      = ITEMS.register("horizontal_crossed_iron_bars",       () -> new BlockItem(BlockInit.HORIZONTAL_CROSSED_IRON_BARS.get(),         new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_CROSSED_GOLD_BARS      = ITEMS.register("horizontal_crossed_gold_bars",       () -> new BlockItem(BlockInit.HORIZONTAL_CROSSED_GOLD_BARS.get(),         new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_CROSSED_ACACIA_BARS    = ITEMS.register("horizontal_crossed_acacia_bars",     () -> new BlockItem(BlockInit.HORIZONTAL_CROSSED_ACACIA_BARS.get(),       new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_CROSSED_BIRCH_BARS     = ITEMS.register("horizontal_crossed_birch_bars",      () -> new BlockItem(BlockInit.HORIZONTAL_CROSSED_BIRCH_BARS.get(),        new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_CROSSED_JUNGLE_BARS    = ITEMS.register("horizontal_crossed_jungle_bars",     () -> new BlockItem(BlockInit.HORIZONTAL_CROSSED_JUNGLE_BARS.get(),       new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_CROSSED_OAK_BARS       = ITEMS.register("horizontal_crossed_oak_bars",        () -> new BlockItem(BlockInit.HORIZONTAL_CROSSED_OAK_BARS.get(),          new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_CROSSED_DARK_OAK_BARS  = ITEMS.register("horizontal_crossed_dark_oak_bars",   () -> new BlockItem(BlockInit.HORIZONTAL_CROSSED_DARK_OAK_BARS.get(),     new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_CROSSED_SPRUCE_BARS    = ITEMS.register("horizontal_crossed_spruce_bars",     () -> new BlockItem(BlockInit.HORIZONTAL_CROSSED_SPRUCE_BARS.get(),       new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_CROSSED_CRIMSON_BARS   = ITEMS.register("horizontal_crossed_crimson_bars",    () -> new BlockItem(BlockInit.HORIZONTAL_CROSSED_CRIMSON_BARS.get(),      new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_CROSSED_WARPED_BARS    = ITEMS.register("horizontal_crossed_warped_bars",     () -> new BlockItem(BlockInit.HORIZONTAL_CROSSED_WARPED_BARS.get(),       new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));

    //Biomes o' Plenty
    public static final RegistryObject<Item> FIR_BARS                          = ITEMS.register("fir_bars",                           () -> new BlockItem(BlockInit.FIR_BARS.get(),                             new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> REDWOOD_BARS                      = ITEMS.register("redwood_bars",                       () -> new BlockItem(BlockInit.REDWOOD_BARS.get(),                         new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> CHERRY_BARS                       = ITEMS.register("cherry_bars",                        () -> new BlockItem(BlockInit.CHERRY_BARS.get(),                          new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> MAHOGANY_BARS                     = ITEMS.register("mahogany_bars",                      () -> new BlockItem(BlockInit.MAHOGANY_BARS.get(),                        new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> JACARANDA_BARS                    = ITEMS.register("jacaranda_bars",                     () -> new BlockItem(BlockInit.JACARANDA_BARS.get(),                       new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> PALM_BARS                         = ITEMS.register("palm_bars",                          () -> new BlockItem(BlockInit.PALM_BARS.get(),                            new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> WILLOW_BARS                       = ITEMS.register("willow_bars",                        () -> new BlockItem(BlockInit.WILLOW_BARS.get(),                          new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> DEAD_BARS                         = ITEMS.register("dead_bars",                          () -> new BlockItem(BlockInit.DEAD_BARS.get(),                            new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> MAGIC_BARS                        = ITEMS.register("magic_bars",                         () -> new BlockItem(BlockInit.MAGIC_BARS.get(),                           new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> UMBRAN_BARS                       = ITEMS.register("umbran_bars",                        () -> new BlockItem(BlockInit.UMBRAN_BARS.get(),                          new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HELLBARK_BARS                     = ITEMS.register("hellbark_bars",                      () -> new BlockItem(BlockInit.HELLBARK_BARS.get(),                        new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));

    public static final RegistryObject<Item> CROSSED_FIR_BARS                  = ITEMS.register("crossed_fir_bars",                   () -> new BlockItem(BlockInit.CROSSED_FIR_BARS.get(),                     new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> CROSSED_REDWOOD_BARS              = ITEMS.register("crossed_redwood_bars",               () -> new BlockItem(BlockInit.CROSSED_REDWOOD_BARS.get(),                 new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> CROSSED_CHERRY_BARS               = ITEMS.register("crossed_cherry_bars",                () -> new BlockItem(BlockInit.CROSSED_CHERRY_BARS.get(),                  new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> CROSSED_MAHOGANY_BARS             = ITEMS.register("crossed_mahogany_bars",              () -> new BlockItem(BlockInit.CROSSED_MAHOGANY_BARS.get(),                new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> CROSSED_JACARANDA_BARS            = ITEMS.register("crossed_jacaranda_bars",             () -> new BlockItem(BlockInit.CROSSED_JACARANDA_BARS.get(),               new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> CROSSED_PALM_BARS                 = ITEMS.register("crossed_palm_bars",                  () -> new BlockItem(BlockInit.CROSSED_PALM_BARS.get(),                    new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> CROSSED_WILLOW_BARS               = ITEMS.register("crossed_willow_bars",                () -> new BlockItem(BlockInit.CROSSED_WILLOW_BARS.get(),                  new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> CROSSED_DEAD_BARS                 = ITEMS.register("crossed_dead_bars",                  () -> new BlockItem(BlockInit.CROSSED_DEAD_BARS.get(),                    new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> CROSSED_MAGIC_BARS                = ITEMS.register("crossed_magic_bars",                 () -> new BlockItem(BlockInit.CROSSED_MAGIC_BARS.get(),                   new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> CROSSED_UMBRAN_BARS               = ITEMS.register("crossed_umbran_bars",                () -> new BlockItem(BlockInit.CROSSED_UMBRAN_BARS.get(),                  new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> CROSSED_HELLBARK_BARS             = ITEMS.register("crossed_hellbark_bars",              () -> new BlockItem(BlockInit.CROSSED_HELLBARK_BARS.get(),                new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));

    public static final RegistryObject<Item> HORIZONTAL_FIR_BARS               = ITEMS.register("horizontal_fir_bars",                () -> new BlockItem(BlockInit.HORIZONTAL_FIR_BARS.get(),                  new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_REDWOOD_BARS           = ITEMS.register("horizontal_redwood_bars",            () -> new BlockItem(BlockInit.HORIZONTAL_REDWOOD_BARS.get(),              new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_CHERRY_BARS            = ITEMS.register("horizontal_cherry_bars",             () -> new BlockItem(BlockInit.HORIZONTAL_CHERRY_BARS.get(),               new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_MAHOGANY_BARS          = ITEMS.register("horizontal_mahogany_bars",           () -> new BlockItem(BlockInit.HORIZONTAL_MAHOGANY_BARS.get(),             new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_JACARANDA_BARS         = ITEMS.register("horizontal_jacaranda_bars",          () -> new BlockItem(BlockInit.HORIZONTAL_JACARANDA_BARS.get(),            new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_PALM_BARS              = ITEMS.register("horizontal_palm_bars",               () -> new BlockItem(BlockInit.HORIZONTAL_PALM_BARS.get(),                 new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_WILLOW_BARS            = ITEMS.register("horizontal_willow_bars",             () -> new BlockItem(BlockInit.HORIZONTAL_WILLOW_BARS.get(),               new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_DEAD_BARS              = ITEMS.register("horizontal_dead_bars",               () -> new BlockItem(BlockInit.HORIZONTAL_DEAD_BARS.get(),                 new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_MAGIC_BARS             = ITEMS.register("horizontal_magic_bars",              () -> new BlockItem(BlockInit.HORIZONTAL_MAGIC_BARS.get(),                new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_UMBRAN_BARS            = ITEMS.register("horizontal_umbran_bars",             () -> new BlockItem(BlockInit.HORIZONTAL_UMBRAN_BARS.get(),               new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_HELLBARK_BARS          = ITEMS.register("horizontal_hellbark_bars",           () -> new BlockItem(BlockInit.HORIZONTAL_HELLBARK_BARS.get(),             new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));

    public static final RegistryObject<Item> HORIZONTAL_CROSSED_FIR_BARS       = ITEMS.register("horizontal_crossed_fir_bars",        () -> new BlockItem(BlockInit.HORIZONTAL_CROSSED_FIR_BARS.get(),          new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_CROSSED_REDWOOD_BARS   = ITEMS.register("horizontal_crossed_redwood_bars",    () -> new BlockItem(BlockInit.HORIZONTAL_CROSSED_REDWOOD_BARS.get(),      new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_CROSSED_CHERRY_BARS    = ITEMS.register("horizontal_crossed_cherry_bars",     () -> new BlockItem(BlockInit.HORIZONTAL_CROSSED_CHERRY_BARS.get(),       new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_CROSSED_MAHOGANY_BARS  = ITEMS.register("horizontal_crossed_mahogany_bars",   () -> new BlockItem(BlockInit.HORIZONTAL_CROSSED_MAHOGANY_BARS.get(),     new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_CROSSED_JACARANDA_BARS = ITEMS.register("horizontal_crossed_jacaranda_bars",  () -> new BlockItem(BlockInit.HORIZONTAL_CROSSED_JACARANDA_BARS.get(),    new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_CROSSED_PALM_BARS      = ITEMS.register("horizontal_crossed_palm_bars",       () -> new BlockItem(BlockInit.HORIZONTAL_CROSSED_PALM_BARS.get(),         new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_CROSSED_WILLOW_BARS    = ITEMS.register("horizontal_crossed_willow_bars",     () -> new BlockItem(BlockInit.HORIZONTAL_CROSSED_WILLOW_BARS.get(),       new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_CROSSED_DEAD_BARS      = ITEMS.register("horizontal_crossed_dead_bars",       () -> new BlockItem(BlockInit.HORIZONTAL_CROSSED_DEAD_BARS.get(),         new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_CROSSED_MAGIC_BARS     = ITEMS.register("horizontal_crossed_magic_bars",      () -> new BlockItem(BlockInit.HORIZONTAL_CROSSED_MAGIC_BARS.get(),        new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_CROSSED_UMBRAN_BARS    = ITEMS.register("horizontal_crossed_umbran_bars",     () -> new BlockItem(BlockInit.HORIZONTAL_CROSSED_UMBRAN_BARS.get(),       new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_CROSSED_HELLBARK_BARS  = ITEMS.register("horizontal_crossed_hellbark_bars",   () -> new BlockItem(BlockInit.HORIZONTAL_CROSSED_HELLBARK_BARS.get(),     new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));

}
