package com.craig.craigmod.items;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Rarity;

import com.craig.craigmod.CraigMod;
import com.craig.craigmod.itemgroups.ItemGroups;


public class Items {
    public static Item TEST_ITEM
        = register(new Item(new Item.Settings()
            .maxCount(16)
            .fireproof()
            .rarity(Rarity.RARE)), "test_item");

    public static Item register(Item item, String id) {
        Identifier itemIdentifier = Identifier.of(CraigMod.MOD_ID, id);
        return Registry.register(Registries.ITEM, itemIdentifier, item);
    }

    public static void init() {
        CraigMod.LOGGER.info("Init CraigMod Items");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.CRAIGMOD_ITEMGROUP_KEY)
            .register((itemGroup) -> itemGroup.add(Items.TEST_ITEM));

        FuelRegistry.INSTANCE.add(Items.TEST_ITEM, 200);
    }
}
