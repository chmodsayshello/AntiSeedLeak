package chmodsayshello.antiseedleak;

import org.bukkit.plugin.java.JavaPlugin;
import chmodsayshello.antiseedleak.Listeners.Chat;

public final class AntiSeedLeak extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new Chat(), this);
        getLogger().info("Plugin started up...");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Plugin shut down...");
    }
}
