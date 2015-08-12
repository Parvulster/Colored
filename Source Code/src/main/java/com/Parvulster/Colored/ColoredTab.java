package com.Parvulster.Colored;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ColoredTab extends CreativeTabs {
	public ColoredTab(String label) {
		super(label);
	}
	@Override
	public Item getTabIconItem() {
		return null;
	}
}