package es.jotero.spiphone;

import org.bukkit.Server;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.JavaPluginLoader;

public class SpiPhone extends JavaPlugin {

    /**
     * SpiPhone constructor for testing purposes
     * @param server Spigot Server instance
     */
    public SpiPhone (final Server server) {
        super(
                new JavaPluginLoader(server),
                new PluginDescriptionFile("SpiPhone", "", "es.jotero.spiphone.SpiPhone"),
                null,
                null
        );
    }

    @Override
    public void onEnable() {

    }

    /**
     * Method for Event Listener registering
     * @param pluginManager PluginManager instance
     */
    private void registerListeners(PluginManager pluginManager) {

    }





}
