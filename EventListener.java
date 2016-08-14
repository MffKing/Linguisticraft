package com.mff.Linguisticraft;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class EventListener implements Listener
{
	public static MainClass _main;
	
	@EventHandler
	public void onRightClick(PlayerInteractEvent e)
	{
		Player p = e.getPlayer();
		Block block = e.getClickedBlock();
		if(e.getAction() == Action.RIGHT_CLICK_BLOCK && isCarryingShovel(p, true) && block.getType() == Material.DIRT)
		{
			block.setType(Material.GRASS_PATH);
			p.playSound(p.getLocation(), Sound.ITEM_SHOVEL_FLATTEN, 1, 1);
			if(isCarryingShovel(p, false))//DANS LA MAIN PRINCIPALE
			{
				 p.getInventory().getItemInMainHand().setDurability((short) (p.getInventory().getItemInMainHand().getDurability() + 1));
			}
			else //DANS L'AUTRE MAIN
			{
				p.getInventory().getItemInOffHand().setDurability((short) (p.getInventory().getItemInOffHand().getDurability() + 1));;
			}
		}
	}
		
	boolean isCarryingShovel(Player p, boolean checkOffHand)
	{
		org.bukkit.Material[] spades = new org.bukkit.Material[5];
		
		spades[0] = Material.WOOD_SPADE;
		spades[1] = Material.STONE_SPADE;
		spades[2] = Material.GOLD_SPADE;
		spades[3] = Material.IRON_SPADE;
		spades[4] = Material.DIAMOND_SPADE;
		
		for(int i = 0; i < spades.length; i++)
		{
			if(p.getInventory().getItemInMainHand().getType() == spades[i] || (p.getInventory().getItemInOffHand().getType() == spades[i] && checkOffHand))
			{
				return true;
			}
		}
		
		return false;
	}

}
