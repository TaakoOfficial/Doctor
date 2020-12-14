package me.toonamisenpai.doctor;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		// Plugin startup logic
		this.getCommand("Doctor").setExecutor(new Heal());

	}

	@Override
	public void onDisable() {
		// Plugin shutdown logic
	}
}
