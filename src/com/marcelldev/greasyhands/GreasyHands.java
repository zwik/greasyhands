package com.marcelldev.greasyhands;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class GreasyHands extends JavaPlugin {
	private final EndermanBlockListener endermanBlockListener = new EndermanBlockListener(this);

	@Override
	public void onEnable() {
		// Register our events.
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(endermanBlockListener, this);

		getLogger().info("Greasy Hands is now enabled!");
	}

	@Override
	public void onDisable() {
		getLogger().info("Greasy Hands is now disabled!");
	}
}
