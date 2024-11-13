
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package org.legomountain14.reinforcement.init;

import org.legomountain14.reinforcement.block.ReinforcedTintedGlassBlock;
import org.legomountain14.reinforcement.block.ReinforcedStoneBricksBlock;
import org.legomountain14.reinforcement.block.ReinforcedGlowstoneBlock;
import org.legomountain14.reinforcement.block.ReinforcedGlassBlock;
import org.legomountain14.reinforcement.block.ReinforcedConcretePowderBlock;
import org.legomountain14.reinforcement.block.ReinforcedConcreteBlock;
import org.legomountain14.reinforcement.ReinforcementMod;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

public class ReinforcementModBlocks {
	public static Block REINFORCED_CONCRETE_POWDER;
	public static Block REINFORCED_STONE_BRICKS;
	public static Block REINFORCED_CONCRETE;
	public static Block REINFORCED_GLASS;
	public static Block REINFORCED_TINTED_GLASS;
	public static Block REINFORCED_GLOWSTONE;

	public static void load() {
		REINFORCED_CONCRETE_POWDER = register("reinforced_concrete_powder", new ReinforcedConcretePowderBlock());
		REINFORCED_STONE_BRICKS = register("reinforced_stone_bricks", new ReinforcedStoneBricksBlock());
		REINFORCED_CONCRETE = register("reinforced_concrete", new ReinforcedConcreteBlock());
		REINFORCED_GLASS = register("reinforced_glass", new ReinforcedGlassBlock());
		REINFORCED_TINTED_GLASS = register("reinforced_tinted_glass", new ReinforcedTintedGlassBlock());
		REINFORCED_GLOWSTONE = register("reinforced_glowstone", new ReinforcedGlowstoneBlock());
	}

	public static void clientLoad() {
		ReinforcedConcretePowderBlock.clientInit();
		ReinforcedStoneBricksBlock.clientInit();
		ReinforcedConcreteBlock.clientInit();
		ReinforcedGlassBlock.clientInit();
		ReinforcedTintedGlassBlock.clientInit();
		ReinforcedGlowstoneBlock.clientInit();
	}

	private static Block register(String registryName, Block block) {
		return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(ReinforcementMod.MODID, registryName), block);
	}
}
