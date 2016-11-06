package com.Parvulster.Colored;

import com.Parvulster.Colored.InGameStuff.Blocks;
import com.Parvulster.Colored.Proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class Colored {
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	public static final ColoredTab tabColored = new ColoredTab("tabColored");
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Blocks.init();
		Blocks.register();
	}
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.registerRenders();
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
