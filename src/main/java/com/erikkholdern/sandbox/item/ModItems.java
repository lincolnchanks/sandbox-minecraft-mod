package com.erikkholdern.sandbox.item;

import com.erikkholdern.sandbox.Sandbox;
import com.erikkholdern.sandbox.item.custom.AbrasionGranterItem;
import com.erikkholdern.sandbox.item.custom.RegenerationGranterItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    // HOW-TO Add an Item:
    // 1. Create a new instance variable of that Item, supplied by registerItem().
    // 2. Add it to the desired ItemGroup in registerModItems().
    // 3. Add translation to en_us.json
    // 4. Add model file(s)
    // 5. Add texture file(s)

    // Each item in our Mod is represented as a final instance
    // variable/constant of the ModItems class. They are each
    // of type Item or perhaps <S extends Item>

    // This Item is the returned value from registerItem().
    public static final Item PINK_GARNET = registerItem("pink_garnet",
            new Item(new Item.Settings()));
    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet",
            new Item(new Item.Settings()));

    public static final Item REGENERATION_GRANTER = registerItem("regeneration_granter",
            new RegenerationGranterItem(new Item.Settings().maxCount(1)));
    public static final Item ABRASION_GRANTER = registerItem("abrasion_granter",
            new AbrasionGranterItem(new Item.Settings().maxCount(1)));


    // Helper Method
    private static Item registerItem(String name, Item item){
        // This method registers whichever Item we pass to it to the Items registry.

        // This line registers "item" to the registry "Registries.ITEM" under the
        // identifier "MOD_ID:name" (returned by Identifier.of()).
        return Registry.register(Registries.ITEM, Identifier.of(Sandbox.MOD_ID, name), item);
    }

    public static void registerModItems(){
        // Prints to the log that we're registering items.
        Sandbox.LOGGER.info("Registering Mod Items for " + Sandbox.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PINK_GARNET); // We could do this with a for loop!
            entries.add(RAW_PINK_GARNET);
            entries.add(REGENERATION_GRANTER);
            entries.add(ABRASION_GRANTER);
        });
    }
}
