
package org.legomountain14.reinforcement.block;

import org.legomountain14.reinforcement.init.ReinforcementModBlocks;

import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import java.util.List;
import java.util.Collections;

public class ReinforcedStoneBricksBlock extends Block {
	public static BlockBehaviour.Properties PROPERTIES = BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()
			.sound(new SoundType(1.0f, 1.0f, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.stone.break")), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.stone.step")),
					BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.stone.place")), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.stone.hit")),
					BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.stone.break"))))
			.strength(30f, 1200f).requiresCorrectToolForDrops();

	public ReinforcedStoneBricksBlock() {
		super(PROPERTIES);
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@Environment(EnvType.CLIENT)
	public static void clientInit() {
		BlockRenderLayerMap.INSTANCE.putBlock(ReinforcementModBlocks.REINFORCED_STONE_BRICKS, RenderType.solid());
	}
}
