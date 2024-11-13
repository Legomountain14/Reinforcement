
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package org.legomountain14.reinforcement.init;

import org.legomountain14.reinforcement.ReinforcementMod;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

public class ReinforcementModTabs {
	public static ResourceKey<CreativeModeTab> TAB_REINFORCED_BLOCKS = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(ReinforcementMod.MODID, "reinforced_blocks"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_REINFORCED_BLOCKS,
				FabricItemGroup.builder().title(Component.translatable("item_group." + ReinforcementMod.MODID + ".reinforced_blocks")).icon(() -> new ItemStack(ReinforcementModBlocks.REINFORCED_STONE_BRICKS)).build());
	}
}
