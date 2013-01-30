package com.marcelldev.greasyhands;

import org.bukkit.entity.Enderman;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityChangeBlockEvent;

public class EndermanBlockListener implements Listener {
	private final GreasyHands plugin;
	
	public EndermanBlockListener(GreasyHands instance)
	{
		plugin = instance;
	}
	
	@EventHandler
	public void onEntityChangeBlockEvent(EntityChangeBlockEvent event) {
		if(event.getEntity() instanceof Enderman)
		{
			// I've disabled the logging so your console won't get spammed.
			//plugin.getLogger().info("Another Enderman just got powned!");
			event.setCancelled(true);
		}
	}
}
