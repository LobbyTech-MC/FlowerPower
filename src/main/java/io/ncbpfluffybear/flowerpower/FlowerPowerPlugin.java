package io.ncbpfluffybear.flowerpower;

import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import io.github.thebusybiscuit.slimefun4.libraries.dough.updater.GitHubBuildsUpdater;
import io.ncbpfluffybear.flowerpower.setup.FlowerPowerItemSetup;
import io.ncbpfluffybear.flowerpower.setup.ResearchSetup;
import net.guizhanss.guizhanlibplugin.updater.GuizhanUpdater;
import org.bstats.bukkit.Metrics;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import utils.Constants;
import listeners.Events;
import utils.GlowEnchant;
import utils.Utils;

import javax.annotation.Nonnull;
import java.lang.reflect.Field;
import java.util.logging.Level;

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

        // bStats Metrics
        final Metrics metrics = new Metrics(this, 12349);

        // Read something from your config.yml
        Config cfg = new Config(this);

        if (cfg.getBoolean("options.auto-update") && getDescription().getVersion().startsWith("Build")) {
            GuizhanUpdater.start(this, getFile(), "SlimefunGuguProject", "FlowerPower", "master");
        }

        try {
            if (!Enchantment.isAcceptingRegistrations()) {
                Field accepting = Enchantment.class.getDeclaredField("acceptingNew");
                accepting.setAccessible(true);
                accepting.set(null, true);
            }
        } catch (IllegalAccessException | NoSuchFieldException ignored) {
            getLogger().warning("无法注册新的附魔。");
        }

        registerGlow();

        // Register events
        Utils.registerEvents(new Events());

        // Register all items
        FlowerPowerItemSetup.setup(getInstance());

        // Register all researches
        ResearchSetup.setup();
    }

    private void registerGlow() {
        Enchantment glowEnchant = new GlowEnchant(Constants.GLOW_ENCHANT, new String[] {
                "GLISTENING_POPPY", "GLISTENING_DANDELION", "GLISTENING_OXEYE_DAISY", "GLISTENING_ALLIUM",
                "OVERGROWTH_SEED", "INFINITY_BANDAGE", "RECALL_CHARM"
        });

        // Prevent double-registration errors
        if (Enchantment.getByKey(glowEnchant.getKey()) == null) {
            Enchantment.registerEnchantment(glowEnchant);
        }
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
