/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package org.legomountain14.reinforcement.init;

import org.legomountain14.reinforcement.ReinforcementMod;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.client.renderer.item.ClampedItemPropertyFunction;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class ReinforcementModItems {
	public static Item REINFORCED_CONCRETE_POWDER;
	public static Item REINFORCED_STONE_BRICKS;
	public static Item REINFORCED_CONCRETE;
	public static Item REINFORCED_GLASS;
	public static Item REINFORCED_TINTED_GLASS;
	public static Item REINFORCED_GLOWSTONE;

	public static void load() {
		REINFORCED_CONCRETE_POWDER = register("reinforced_concrete_powder", new BlockItem(ReinforcementModBlocks.REINFORCED_CONCRETE_POWDER, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ReinforcementModTabs.TAB_REINFORCED_BLOCKS).register(content -> content.accept(REINFORCED_CONCRETE_POWDER));
		REINFORCED_STONE_BRICKS = register("reinforced_stone_bricks", new BlockItem(ReinforcementModBlocks.REINFORCED_STONE_BRICKS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ReinforcementModTabs.TAB_REINFORCED_BLOCKS).register(content -> content.accept(REINFORCED_STONE_BRICKS));
		REINFORCED_CONCRETE = register("reinforced_concrete", new BlockItem(ReinforcementModBlocks.REINFORCED_CONCRETE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ReinforcementModTabs.TAB_REINFORCED_BLOCKS).register(content -> content.accept(REINFORCED_CONCRETE));
		REINFORCED_GLASS = register("reinforced_glass", new BlockItem(ReinforcementModBlocks.REINFORCED_GLASS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ReinforcementModTabs.TAB_REINFORCED_BLOCKS).register(content -> content.accept(REINFORCED_GLASS));
		REINFORCED_TINTED_GLASS = register("reinforced_tinted_glass", new BlockItem(ReinforcementModBlocks.REINFORCED_TINTED_GLASS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ReinforcementModTabs.TAB_REINFORCED_BLOCKS).register(content -> content.accept(REINFORCED_TINTED_GLASS));
		REINFORCED_GLOWSTONE = register("reinforced_glowstone", new BlockItem(ReinforcementModBlocks.REINFORCED_GLOWSTONE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ReinforcementModTabs.TAB_REINFORCED_BLOCKS).register(content -> content.accept(REINFORCED_GLOWSTONE));
	}

	public static void clientLoad() {
	}

	private static Item register(String registryName, Item item) {
		return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ReinforcementMod.MODID, registryName), item);
	}

	private static void registerBlockingProperty(Item item) {
		ItemProperties.register(item, new ResourceLocation("blocking"), (ClampedItemPropertyFunction) ItemProperties.getProperty(Items.SHIELD, new ResourceLocation("blocking")));
	}
}
