package io.ncbpfluffybear.flowerpower;

import java.util.logging.Level;

import javax.annotation.Nonnull;

import org.bstats.bukkit.Metrics;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.ncbpfluffybear.flowerpower.setup.FlowerPowerItemSetup;
import io.ncbpfluffybear.flowerpower.setup.ResearchSetup;
import listeners.Events;
import utils.Utils;

/**
 * The main class of the FlowerPower addon
 *
 * @author NCBPFluffyBear
 */
public class FlowerPowerPlugin extends JavaPlugin implements SlimefunAddon {

    private static FlowerPowerPlugin instance;

    @Override
    public void onEnable() {

        instance = this;

        if (!getServer().getPluginManager().isPluginEnabled("GuizhanLibPlugin")) {
            getLogger().log(Level.SEVERE, "本插件需要 鬼斩前置库插件(GuizhanLibPlugin) 才能运行!");
            getLogger().log(Level.SEVERE, "从此处下载: https://50L.cc/gzlib");
            getServer().getPluginManager().disablePlugin(this);
            return;
        }

        new Metrics(this, 12349);

        // Read something from your config.yml
        /*
        Config cfg = new Config(this);

        if (cfg.getBoolean("options.auto-update") && getDescription().getVersion().startsWith("DEV - ")) {
            new BlobBuildUpdater(this, getFile(), "FlowerPower", "Dev").start();
        }
        */

        // Register events
        Utils.registerEvents(new Events());

        // Register all items
        FlowerPowerItemSetup.setup(getInstance());

        // Register all researches
        ResearchSetup.setup();
    }

    @Override
    public void onDisable() {
        // Logic for disabling the plugin...
    }

    @Override
    public String getBugTrackerURL() {
        return "https://github.com/SlimefunGuguProject/FlowerPower/issues";
    }

    @Nonnull
    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }

    public static FlowerPowerPlugin getInstance() {
        return instance;
    }

}
