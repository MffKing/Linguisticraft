package com.mff.Linguisticraft;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class MainClass extends JavaPlugin 
{
	FileConfiguration config = getConfig();
	
	public void onEnable()
	{
		Bukkit.getPluginManager().registerEvents(new EventListener(), this);
		EventListener._main = this;
		
		CraftedSaddle();
		CraftedIronHorseArmor();
		CraftedGoldHorseArmor();
		CraftedDiamondHorseArmor();
		CraftedElytra();
		
		getLogger().info("[Linguisticraft] Plugin is ready !");
	}
	
	void CraftedSaddle()
	{
		ItemStack saddle = new ItemStack(Material.SADDLE, 1);
		ItemMeta saddleMeta = saddle.getItemMeta();
		saddleMeta.setDisplayName(ChatColor.GRAY + "Crafted saddle");
		saddle.setItemMeta(saddleMeta);
		
		ShapedRecipe saddleRecipe = new ShapedRecipe(saddle);
		saddleRecipe.shape( "LLL",
							"L L",
							"I I");
		saddleRecipe.setIngredient('L', Material.LEATHER);
		saddleRecipe.setIngredient('I', Material.IRON_INGOT);
		Bukkit.getServer().addRecipe(saddleRecipe);
	
	}
	
	void CraftedIronHorseArmor()
	{
		ItemStack ironHorseArmor = new ItemStack(Material.IRON_BARDING, 1);
		ItemMeta ironHorseArmorMeta = ironHorseArmor.getItemMeta();
		ironHorseArmorMeta.setDisplayName(ChatColor.GRAY + "Crafted Iron Horse Armor");
		ironHorseArmor.setItemMeta(ironHorseArmorMeta);
		
		ShapedRecipe ironHorseArmorRecipe = new ShapedRecipe(ironHorseArmor);
		ironHorseArmorRecipe.shape( "  I",
									"ISI",
									"III");
		ironHorseArmorRecipe.shape( "I  ",
									"ISI",
									"III");
		ironHorseArmorRecipe.setIngredient('I', Material.IRON_INGOT);
		ironHorseArmorRecipe.setIngredient('S', Material.SADDLE);
		Bukkit.getServer().addRecipe(ironHorseArmorRecipe);
	}
	
	void CraftedGoldHorseArmor()
	{
		ItemStack goldHorseArmor = new ItemStack(Material.GOLD_BARDING, 1);
		ItemMeta goldHorseArmorMeta = goldHorseArmor.getItemMeta();
		goldHorseArmorMeta.setDisplayName(ChatColor.GOLD + "Crafted Gold Horse Armor");
		goldHorseArmor.setItemMeta(goldHorseArmorMeta);
		
		ShapedRecipe goldHorseArmorRecipe = new ShapedRecipe(goldHorseArmor);
		goldHorseArmorRecipe.shape( "  G",
									"GSG",
									"GGG");
		goldHorseArmorRecipe.shape( "G  ",
									"GSG",
									"GGG");
		goldHorseArmorRecipe.setIngredient('G', Material.GOLD_INGOT);
		goldHorseArmorRecipe.setIngredient('S', Material.SADDLE);
		Bukkit.getServer().addRecipe(goldHorseArmorRecipe);
	}
	
	void CraftedDiamondHorseArmor()
	{
		ItemStack diamondHorseArmor = new ItemStack(Material.DIAMOND_BARDING, 1);
		ItemMeta diamondHorseArmorMeta = diamondHorseArmor.getItemMeta();
		diamondHorseArmorMeta.setDisplayName(ChatColor.DARK_AQUA + "Crafted Diamond Horse Armor");
		diamondHorseArmor.setItemMeta(diamondHorseArmorMeta);
		
		ShapedRecipe diamondHorseArmorRecipe = new ShapedRecipe(diamondHorseArmor);
		diamondHorseArmorRecipe.shape(  "  D",
										"DSD",
										"DDD");
		diamondHorseArmorRecipe.shape(  "D  ",
										"DSD",
										"DDD");
		diamondHorseArmorRecipe.setIngredient('D', Material.DIAMOND);
		diamondHorseArmorRecipe.setIngredient('S', Material.SADDLE);
		Bukkit.getServer().addRecipe(diamondHorseArmorRecipe);
	}
	
	void CraftedElytra()
	{
		ItemStack elytra = new ItemStack(Material.ELYTRA, 1);
		ItemMeta elytraMeta = elytra.getItemMeta();
		elytraMeta.setDisplayName(ChatColor.WHITE + "Crafted Elytra");
		elytra.setItemMeta(elytraMeta);
		
		ShapedRecipe elytraRecipe = new ShapedRecipe(elytra);
		elytraRecipe.shape( " L ",
							"LDL",
							"FEF");
		elytraRecipe.setIngredient('L', Material.LEATHER);
		elytraRecipe.setIngredient('F', Material.FEATHER);
		elytraRecipe.setIngredient('D', Material.DIAMOND);
		elytraRecipe.setIngredient('E', Material.ENDER_PEARL);
		Bukkit.getServer().addRecipe(elytraRecipe);
	}
	
	
	
	
}
