
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftabletotemofundying.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.craftabletotemofundying.item.ItemTotemBaseItem;
import net.mcreator.craftabletotemofundying.CraftableTotemOfUndyingMod;

public class CraftableTotemOfUndyingModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CraftableTotemOfUndyingMod.MODID);
	public static final RegistryObject<Item> ITEM_TOTEM_BASE = REGISTRY.register("item_totem_base", () -> new ItemTotemBaseItem());
}
