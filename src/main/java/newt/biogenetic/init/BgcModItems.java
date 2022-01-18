
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package newt.biogenetic.init;

import newt.biogenetic.item.ReinforcedIronItem;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.Item;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BgcModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item REINFORCED_IRON = register(new ReinforcedIronItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
