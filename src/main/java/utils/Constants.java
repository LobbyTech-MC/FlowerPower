package utils;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

import org.bukkit.Bukkit;
import org.bukkit.Material;

/**
 * Stores plugin constants
 * @author NCBPFluffyBear
 */
public class Constants {

    public Constants() {}

    public static final String SERVER_VERSION = Bukkit.getBukkitVersion();

    public static final Set<Material> flowers = new LinkedHashSet<>(Arrays.asList(
            Material.POPPY, Material.DANDELION, Material.OXEYE_DAISY, Material.ALLIUM));

}
