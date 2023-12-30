package io.ncbpfluffybear.flowerpower;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import io.ncbpfluffybear.flowerpower.items.InfinityApple;
import io.ncbpfluffybear.flowerpower.items.InfinityBandage;
import io.ncbpfluffybear.flowerpower.items.RecallCharm;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import utils.Constants;
import utils.ItemTags;

/**
 * SlimefunItemStack registration
 * @author NCBPFluffyBear
 */
public class FlowerPowerItems {

    public static final ItemGroup FLOWERPOWER_CATEGORY = new ItemGroup(new NamespacedKey(FlowerPowerPlugin.getInstance(),
            "flowerpower_category"), new CustomItemStack(Material.ALLIUM, "&5Flower Power")
    );
    // Multiblocks
    public static final SlimefunItemStack MAGIC_BASIN = new SlimefunItemStack("MAGIC_BASIN",
            Material.CAULDRON,
            "&b魔法坩埚",
            "",
            "&7&o用于制作魔法物品的基础坩埚",
            "",
            "&7手持魔法权杖&e右键点击&7以激活",
            ItemTags.MULTIBLOCK
    );
    // Blocks
    public static final SlimefunItemStack EXPERIENCE_CAULDRON = new SlimefunItemStack("EXPERIENCE_CAULDRON",
            Material.CAULDRON,
            "&a经验之釜",
            "",
            "&7&o可以存储经验的方块",
            "&7&o用于制作魔法坩埚",
            "",
            "&e右键点击&7存储经验",
            "&e潜行+右键点击&7取出经验",
            ItemTags.MULTIBLOCK
    );
    // Glistening Flowers
    public static final SlimefunItemStack GLISTENING_POPPY = new SlimefunItemStack("GLISTENING_POPPY",
            Material.POPPY,
            "&a闪耀玫瑰",
            "",
            "&7&o一束发光的玫瑰",
            "",
            ItemTags.CRAFTING_ITEM
    );
    public static final SlimefunItemStack GLISTENING_DANDELION = new SlimefunItemStack("GLISTENING_DANDELION",
            Material.DANDELION,
            "&a闪耀的蒲公英",
            "",
            "&7&o一束发光的蒲公英",
            "",
            ItemTags.CRAFTING_ITEM
    );
    public static final SlimefunItemStack GLISTENING_OXEYE_DAISY = new SlimefunItemStack("GLISTENING_OXEYE_DAISY",
            Material.OXEYE_DAISY,
            "&a闪耀的滨菊",
            "",
            "&7&o一束发光的滨菊",
            "",
            ItemTags.CRAFTING_ITEM
    );
    public static final SlimefunItemStack GLISTENING_ALLIUM = new SlimefunItemStack("GLISTENING_ALLIUM",
            Material.ALLIUM,
            "&a闪耀的绒球葱",
            "",
            "&7&o一束发光的绒球葱",
            "",
            ItemTags.CRAFTING_ITEM
    );
    // Items
    public static final SlimefunItemStack MAGICAL_WAND = new SlimefunItemStack("MAGICAL_WAND",
            Material.BLAZE_ROD,
            "&5魔法权杖",
            "",
            "&e右键点击&7魔法坩埚以使用",
            "",
            ItemTags.TOOL
    );
    public static final SlimefunItemStack MAGIC_CREAM = new SlimefunItemStack("MAGIC_CREAM",
            Material.MAGMA_CREAM,
            "&6&l魔法膏",
            "",
            "&7&o一颗有魔力的粘液球",
            "",
            ItemTags.CRAFTING_ITEM
    );
    public static final SlimefunItemStack OVERGROWTH_SEED = new SlimefunItemStack("OVERGROWTH_SEED",
            Material.WHEAT_SEEDS,
            "&3魔法花种",
            "",
            "",
            "&e右键点击&7合适的花朵",
            "&7以获得多份花朵",
            "",
            ItemTags.MAGICAL_ITEM
    );
    // Flower Crystals
    public static final SlimefunItemStack RED_CRYSTAL = new SlimefunItemStack("RED_CRYSTAL",
            Material.RED_GLAZED_TERRACOTTA,
            "&c红水晶",
            "",
            "&7&o看上去闪闪发光的...",
            "",
            ItemTags.CRAFTING_ITEM
    );
    public static final SlimefunItemStack YELLOW_CRYSTAL = new SlimefunItemStack("YELLOW_CRYSTAL",
            Material.YELLOW_GLAZED_TERRACOTTA,
            "&e黄水晶",
            "",
            "&7&o看上去闪闪发光的...",
            "",
            ItemTags.CRAFTING_ITEM
    );
    public static final SlimefunItemStack WHITE_CRYSTAL = new SlimefunItemStack("WHITE_CRYSTAL",
            Material.WHITE_GLAZED_TERRACOTTA,
            "&f白水晶",
            "",
            "&7&o看上去闪闪发光的...",
            "",
            ItemTags.CRAFTING_ITEM
    );
    public static final SlimefunItemStack PURPLE_CRYSTAL = new SlimefunItemStack("PURPLE_CRYSTAL",
            Material.PURPLE_GLAZED_TERRACOTTA,
            "&5紫水晶",
            "",
            "&7&o看上去闪闪发光的...",
            "",
            ItemTags.CRAFTING_ITEM
    );
    public static final SlimefunItemStack MOVEMENT_SPEED_CHARM = new SlimefunItemStack("MOVEMENT_SPEED_CHARM",
            Material.SUGAR,
            "&a移动速度符咒",
            "",
            "&e右键点击&c查看该符咒",
            "&7&o副手手持时让你跑得更快",
            "",
            ItemTags.MAGICAL_ITEM
    );
    public static final SlimefunItemStack ATTACK_SPEED_CHARM = new SlimefunItemStack("ATTACK_SPEED_CHARM",
            Material.SUGAR,
            "&a攻击速度符咒",
            "",
            "&e右键点击&c查看该符咒",
            "&7&o副手手持时让你攻击得更频繁",
            "",
            ItemTags.MAGICAL_ITEM
    );
    public static final SlimefunItemStack FLY_SPEED_CHARM = new SlimefunItemStack("FLY_SPEED_CHARM",
            Material.SUGAR,
            "&a飞行速度符咒",
            "",
            "&e右键点击&c查看该符咒",
            "&7&o副手手持时让你飞得更快",
            "",
            ItemTags.MAGICAL_ITEM
    );
    public static final SlimefunItemStack DAMAGE_CHARM = new SlimefunItemStack("DAMAGE_CHARM",
            Material.SUGAR,
            "&a伤害符咒",
            "",
            "&e右键点击&c查看该符咒",
            "&7&o副手手持时让你造成更多伤害",
            "",
            ItemTags.MAGICAL_ITEM
    );
    public static final SlimefunItemStack HEALTH_CHARM = new SlimefunItemStack("HEALTH_CHARM",
            Material.SUGAR,
            "&a生命符咒",
            "",
            "&e右键点击&c查看该符咒",
            "&7&o副手手持时让你获得更多生命值",
            "",
            ItemTags.MAGICAL_ITEM
    );
    public static final SlimefunItemStack KNOCKBACK_RESISTANCE_CHARM = new SlimefunItemStack("KNOCKBACK_RESISTANCE_CHARM",
            Material.SUGAR,
            "&7击退抗性符咒",
            "",
            "&e右键点击&c查看该符咒",
            "&7&o副手手持时让你受到更少的击退",
            "",
            ItemTags.MAGICAL_ITEM
    );
    public static final SlimefunItemStack EXPERIENCE_TOME = new SlimefunItemStack("EXPERIENCE_TOME",
            Material.ENCHANTED_BOOK,
            "&e经验之书 &a(0 / 1000000)",
            "",
            "&7&o可存储大量经验",
            "",
            "&e右键点击&7存入经验",
            "&e潜行+右键点击&7取出经验",
            "&e左键点击&7进行批量操作",
            "",
            ItemTags.MAGICAL_ITEM
    );
    public static final SlimefunItemStack INFINITY_APPLE = new SlimefunItemStack("INFINITY_APPLE",
            new CustomItemStack(SlimefunUtils.getCustomHead("99a79d7e5d1ba739ab4471643e744ef781f7c1d4ea52efc99168d6cb5732326")),
            "&e无尽苹果",
            "",
            "&7&o可将经验值转化为饥饿值",
            "",
            "&e右键点击&7食用",
            "",
            "&a花费：" + InfinityApple.EXP_PER_CONSUME + " 经验值 / " + InfinityApple.FOOD_PER_CONSUME + " 饥饿值",
            ItemTags.MAGICAL_ITEM
    );
    public static final SlimefunItemStack INFINITY_BANDAGE = new SlimefunItemStack("INFINITY_BANDAGE",
            Material.PAPER,
            "&c无尽绷带",
            "",
            "&7&o将经验值转化为生命值",
            "",
            "&e右键点击&7进行治疗",
            "",
            "&a花费：" + InfinityBandage.EXP_PER_CONSUME + " 经验值 / " + InfinityBandage.HEALTH_PER_CONSUME + " 生命值",
            ItemTags.MAGICAL_ITEM
    );
    public static final SlimefunItemStack RECALL_CHARM = new SlimefunItemStack("RECALL_CHARM",
            Material.ENDER_EYE,
            "&5召回符咒",
            "",
            "&7&o可消耗经验并传送到",
            "&7&o标记的位置...",
            "",
            "&e潜行+右键点击&7绑定位置",
            "&e右键点击&7传送",
            "",
            "&3绑定位置：无",
            "",
            "&a花费" + RecallCharm.TELEPORT_COST + " 经验值 / 传送",
            ItemTags.MAGICAL_ITEM
    );


    private static final Enchantment glowEnchant = Enchantment.getByKey(Constants.GLOW_ENCHANT);

    static {
        GLISTENING_POPPY.addEnchantment(glowEnchant, 1);
        GLISTENING_DANDELION.addEnchantment(glowEnchant, 1);
        GLISTENING_OXEYE_DAISY.addEnchantment(glowEnchant, 1);
        GLISTENING_ALLIUM.addEnchantment(glowEnchant, 1);

        OVERGROWTH_SEED.addEnchantment(glowEnchant, 1);
        INFINITY_BANDAGE.addEnchantment(glowEnchant, 1);
        RECALL_CHARM.addEnchantment(glowEnchant, 1);
    }


    private FlowerPowerItems() {
    }

}
