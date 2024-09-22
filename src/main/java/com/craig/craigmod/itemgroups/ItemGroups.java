package com.craig.craigmod.itemgroups;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;

import com.craig.craigmod.CraigMod;
import com.craig.craigmod.items.Items;

import net.minecraft.registry.Registries;

import net.minecraft.item.ItemStack;

public class ItemGroups {
    public static final RegistryKey<ItemGroup> CRAIGMOD_ITEMGROUP_KEY =
        RegistryKey.of(Registries.ITEM_GROUP.getKey(),
        Identifier.of(CraigMod.MOD_ID, "craigmod_itemgroup")
        );

    public static final ItemGroup CRAIGMOD_ITEMGROUP = FabricItemGroup.builder()
        .icon(() -> new ItemStack(Items.TEST_ITEM))
        .displayName(Text.literal("CraigMod Items"))
        .build();
    
    public static void init() {
        
    }
}
