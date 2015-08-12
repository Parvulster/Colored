package com.Parvulster.Colored.InGameStuff;

import com.Parvulster.Colored.Colored;
import com.Parvulster.Colored.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Blocks {
	public static Block rainbow_block;
	public static Block red_block;
	public static Block orange_block;
	public static Block yellow_block;
	public static Block green_block;
	public static Block blue_block;
	public static Block purple_block;
	public static Block white_block;
	public static Block black_block;
	public static void init() {
		rainbow_block = new BlockClass(Material.cloth).setUnlocalizedName("rainbow_block").setCreativeTab(Colored.tabColored);
		red_block = new BlockClass(Material.cloth).setUnlocalizedName("red_block").setCreativeTab(Colored.tabColored);
		orange_block = new BlockClass(Material.cloth).setUnlocalizedName("orange_block").setCreativeTab(Colored.tabColored);
		yellow_block = new BlockClass(Material.cloth).setUnlocalizedName("yellow_block").setCreativeTab(Colored.tabColored);
		green_block = new BlockClass(Material.cloth).setUnlocalizedName("green_block").setCreativeTab(Colored.tabColored);
		blue_block = new BlockClass(Material.cloth).setUnlocalizedName("blue_block").setCreativeTab(Colored.tabColored);
		purple_block = new BlockClass(Material.cloth).setUnlocalizedName("purple_block").setCreativeTab(Colored.tabColored);
		white_block = new BlockClass(Material.cloth).setUnlocalizedName("white_block").setCreativeTab(Colored.tabColored);
		black_block = new BlockClass(Material.cloth).setUnlocalizedName("black_block").setCreativeTab(Colored.tabColored);
	}
	public static void register() {
		GameRegistry.registerBlock(rainbow_block, rainbow_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(red_block, red_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(orange_block, orange_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(yellow_block, yellow_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(green_block, green_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blue_block, blue_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(purple_block, purple_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(white_block, white_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(black_block, black_block.getUnlocalizedName().substring(5));
	}
	public static void registerRenders() {
		registerRender(rainbow_block);
		registerRender(red_block);
		registerRender(orange_block);
		registerRender(yellow_block);
		registerRender(green_block);
		registerRender(blue_block);
		registerRender(purple_block);
		registerRender(white_block);
		registerRender(black_block);
	}
	public static void registerRender(Block block) {
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName()));
	}
}