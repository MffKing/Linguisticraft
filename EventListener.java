package com.mff.Linguisticraft;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.MaterialData;
import org.bukkit.plugin.java.JavaPlugin;

public class MainClass extends JavaPlugin 
{
	FileConfiguration config = getConfig();
	
	public void onEnable()
	{
		Bukkit.getPluginManager().registerEvents(new EventListener(), this);
		EventListener._main = this;
		
		CraftSaddle();
		CraftIronHorseArmor();
		CraftGoldHorseArmor();
		CraftDiamondHorseArmor();
		CraftElytra();
		CraftNameTag();
		CraftGrass();
		CraftMycelium();
		
		getLogger().info("[Linguisticraft] Plugin is ready !");
	}
	
	void CraftSaddle()
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
	
	void CraftIronHorseArmor()
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
	
	void CraftGoldHorseArmor()
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
	
	void CraftDiamondHorseArmor()
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
	
	void CraftElytra()
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
	
	void CraftNameTag()
	{
		ItemStack tag = new ItemStack(Material.NAME_TAG, 1);
		ItemMeta tagMeta = tag.getItemMeta();
		tagMeta.setDisplayName("Crafted Name Tag");
		tag.setItemMeta(tagMeta);
		
		ShapedRecipe tagRecipe = new ShapedRecipe(tag);
		tagRecipe.shape( "  ~",
						 " # ",
						 "#S ");
		tagRecipe.shape( "~  ",
				 		 " # ",
				 		 " S#");
		tagRecipe.setIngredient('~', Material.STRING);
		tagRecipe.setIngredient('#', Material.PAPER);
		tagRecipe.setIngredient('S', Material.SIGN);
		Bukkit.getServer().addRecipe(tagRecipe);
	}
	
	@SuppressWarnings("deprecation")
	void CraftGrass()
	{
		ShapelessRecipe grassRecipe = new ShapelessRecipe(new ItemStack(Material.GRASS, 1));
		grassRecipe.addIngredient(Material.DIRT);
		grassRecipe.addIngredient(new MaterialData(Material.LONG_GRASS, (byte) 1));
		Bukkit.getServer().addRecipe(grassRecipe);
	}
	
	void CraftMycelium()
	{
		ShapedRecipe myceliumRecipe = new ShapedRecipe(new ItemStack(Material.MYCEL, 1));
		
		myceliumRecipe.shape( "BRB",
							  "RGR",
							  "BRB");
		myceliumRecipe.setIngredient('B', Material.BROWN_MUSHROOM);
		myceliumRecipe.setIngredient('R', Material.RED_MUSHROOM);
		myceliumRecipe.setIngredient('G', Material.GRASS);
		Bukkit.getServer().addRecipe(myceliumRecipe);
		
		myceliumRecipe.shape( "RBR",
	 			 			  "BGB",
	 			 			  "RBR");
		myceliumRecipe.setIngredient('B', Material.BROWN_MUSHROOM);
		myceliumRecipe.setIngredient('R', Material.RED_MUSHROOM);
		myceliumRecipe.setIngredient('G', Material.GRASS);
		Bukkit.getServer().addRecipe(myceliumRecipe);
	}
	
	
	
}
