package com.Parvulster.Colored.Proxy;

import com.Parvulster.Colored.InGameStuff.Blocks;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerRenders() {
		Blocks.registerRenders();
	}
}
