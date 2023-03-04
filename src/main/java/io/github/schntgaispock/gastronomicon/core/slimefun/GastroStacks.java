package io.github.schntgaispock.gastronomicon.core.slimefun;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;

import io.github.schntgaispock.gastronomicon.core.items.food.FoodEffect;
import io.github.schntgaispock.gastronomicon.core.items.stacks.FoodItemStack;
import io.github.schntgaispock.gastronomicon.core.items.stacks.GastroTheme;
import io.github.schntgaispock.gastronomicon.core.items.stacks.ThemedItemStack;
import io.github.schntgaispock.gastronomicon.core.listeners.WildHarvestListener;
import io.github.schntgaispock.gastronomicon.util.item.HeadTextures;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import lombok.experimental.UtilityClass;
import net.md_5.bungee.api.ChatColor;

@UtilityClass
@SuppressWarnings("deprecation")
public class GastroStacks {

    // ---- Utility ----

    public static final ItemStack WATER_BOTTLE = new ItemStack(Material.POTION);
    static {
        final PotionMeta meta = (PotionMeta) WATER_BOTTLE.getItemMeta();
        final PotionData data = new PotionData(PotionType.WATER);
        meta.setBasePotionData(data);
        WATER_BOTTLE.setItemMeta(meta);
    }

    // ---- Guide Only Items ----

    public static final ItemStack GUIDE_ITEM_TOOLS = new CustomItemStack(
        Material.IRON_HOE,
        GastroTheme.TOOL.getColor() + "Tools"
    );

    public static final ItemStack GUIDE_ITEM_MANUAL_WORKSTATIONS = new CustomItemStack(
        Material.CRAFTING_TABLE,
        GastroTheme.MECHANICAL.getColor() + "Basic Machines"
    );

    public static final ItemStack GUIDE_ITEM_RAW_INGREDIENTS = new CustomItemStack(
        Material.SUGAR,
        GastroTheme.INGREDIENT.getColor() + "Raw Ingredients"
    );

    public static final ItemStack GUIDE_ITEM_FOOD = new CustomItemStack(
        Material.COOKED_BEEF,
        GastroTheme.REGULAR_FOOD.getColor() + "Food"
    );

    public static final ItemStack GUIDE_ITEM_MAIN = new CustomItemStack(
        Material.COOKED_BEEF,
        GastroTheme.PERFECT_FOOD.getColor() + "Gastronomicon"
    );

    public static final ItemStack GUIDE_RECIPE_BREAK = new CustomItemStack(
        Material.BARREL,
        "&bBreaking Blocks",
        "&7This item is obtained by",
        "&7breaking the displayed",
        "&7blocks."
    );

    public static final ItemStack GUIDE_RECIPE_HARVEST = new CustomItemStack(
        Material.BARREL,
        "&bHarvesting Crops",
        "&7This item is obtained by",
        "&7harvesting the displayed",
        "&7crops."
    );

    public static final ItemStack GUIDE_RECIPE_KILL = new CustomItemStack(
        Material.BARREL,
        "&bKilling Mobs",
        "&7This item is obtained by",
        "&7killing the displayed",
        "&7mobs."
    );

    public static final ItemStack GUIDE_RECIPE_TRAP = new CustomItemStack(
        Material.BARREL,
        "&bTrapping",
        "&7This item is obtained by",
        "&7catching it in the displayed",
        "&7trap."
    );

    public static final ItemStack GUIDE_RECIPE_CULINARY_WORKBENCH = new CustomItemStack(
        Material.CRAFTING_TABLE,
        "&bCulinary Workbench",
        "&7Craft this item as shown in a",
        "&7Culinary Workbench with the tool(s)",
        "&7listed below."
    );

    public static final ItemStack GUIDE_RECIPE_MULTI_STOVE = new CustomItemStack(
        Material.BLAST_FURNACE,
        "&bMulti-Stove",
        "&7Craft this item as shown in a",
        "&7Multi-Stove with the tool(s)",
        "&7listed below."
    );

    public static final ItemStack GUIDE_RECIPE_REFRIDGERATOR = new CustomItemStack(
        Material.IRON_BLOCK,
        "&bRefridgerator",
        "&7Craft this item as shown in a",
        "&7Refridgerator with the tool(s)",
        "&7listed below."
    );

    public static final ItemStack GUIDE_RECIPE_MILL = new CustomItemStack(
        Material.CAULDRON,
        "&bMill",
        "&7Craft this item as shown in a",
        "&7Grain Mill with the tool(s)",
        "&7listed below."
    );

    public static final ItemStack GUIDE_RECIPE_DISTILLERY = new CustomItemStack(
        Material.BARREL,
        "&bDistillery",
        "&7Craft this item as shown in a",
        "&7Distillery with the tool(s)",
        "&7listed below."
    );

    public static final ItemStack GUIDE_TOOLS_REQUIRED = new CustomItemStack(
        Material.BLACK_STAINED_GLASS_PANE,
        ChatColor.of("#999999") + "Tools Required"
    );

    public static final ItemStack GUIDE_CONTAINER_REQUIRED = new CustomItemStack(
        Material.PURPLE_STAINED_GLASS_PANE,
        "&5Container Required"
    );

    public static final ItemStack GUIDE_NONE = new CustomItemStack(
        Material.BARRIER,
        "&cNone"
    );

    public static final ItemStack GUIDE_KILL_GOAT = new CustomItemStack(
        Material.GOAT_SPAWN_EGG,
        "&fGoat"
    );

    public static final ItemStack GUIDE_KILL_FROG = new CustomItemStack(
        Material.GOAT_SPAWN_EGG,
        "&fFrog"
    );

    public static final ItemStack GUIDE_KILL_SPIDER = new CustomItemStack(
        Material.GOAT_SPAWN_EGG,
        "&fSpider"
    );

    public static final ItemStack GUIDE_KILL_SALMON = new CustomItemStack(
        Material.SALMON_SPAWN_EGG,
        "&fSalmon"
    );

    public static final ItemStack GUIDE_KILL_GUARDIAN = new CustomItemStack(
        Material.GUARDIAN_SPAWN_EGG,
        "&fGuardian"
    );

    public static final ItemStack GUIDE_KILL_SQUID = new CustomItemStack(
        Material.SQUID_SPAWN_EGG,
        "&fSquid"
    );


    // ---- Tools ----

    // -- Workstation Tools --

    // Culinary Workbench

    public static final SlimefunItemStack CUTTING_BOARD = ThemedItemStack.of(
        GastroTheme.WTOOL,
        "GN_CUTTING_BOARD",
        Material.OAK_PRESSURE_PLATE,
        "Cutting Board"
    );

    public static final SlimefunItemStack MEAT_SCISSORS = ThemedItemStack.of(
        GastroTheme.WTOOL,
        "GN_MEAT_SCISSORS",
        Material.SHEARS,
        "Meat Scissors"
    );

    public static final SlimefunItemStack KITCHEN_KNIFE = ThemedItemStack.of(
        GastroTheme.WTOOL,
        "GN_KITCHEN_KNIFE",
        Material.IRON_SWORD,
        "Kitchen Knife"
    ).addFlags(ItemFlag.HIDE_ATTRIBUTES);

    public static final SlimefunItemStack ROLLING_PIN = ThemedItemStack.of(
        GastroTheme.WTOOL,
        "GN_ROLLING_PIN",
        Material.STICK,
        "Rolling Pin"
    );

    public static final SlimefunItemStack BLENDER = ThemedItemStack.of(
        GastroTheme.WTOOL,
        "GN_BLENDER",
        Material.BUCKET,
        "Blender"
    );

    public static final SlimefunItemStack MORTAR_AND_PESTLE = ThemedItemStack.of(
        GastroTheme.WTOOL,
        "GN_MORTAR_AND_PESTLE",
        Material.BOWL,
        "Mortar and Pestle"
    );

    public static final SlimefunItemStack PEELER = ThemedItemStack.of(
        GastroTheme.WTOOL,
        "GN_PEELER",
        Material.IRON_HOE,
        "Peeler"
    ).addFlags(ItemFlag.HIDE_ATTRIBUTES);

    // Enhanced Oven

    public static final SlimefunItemStack BAKING_TRAY = ThemedItemStack.of(
        GastroTheme.WTOOL,
        "GN_BAKING_TRAY",
        Material.LIGHT_GRAY_CARPET,
        "Baking Tray"
    );

    public static final SlimefunItemStack FRYING_PAN = ThemedItemStack.of(
        GastroTheme.WTOOL,
        "GN_FRYING_PAN",
        Material.GRAY_CARPET,
        "Frying Pan"
    );

    public static final SlimefunItemStack STEEL_POT = ThemedItemStack.of(
        GastroTheme.WTOOL,
        "GN_STEEL_POT",
        Material.CAULDRON,
        "Steel Pot"
    );

    // -- Traps --

    public static final SlimefunItemStack STEEL_WIRE = ThemedItemStack.of(
        GastroTheme.TRAP,
        "GN_STEEL_WIRE",
        Material.STRING,
        "Steel Wire"
    );

    public static final SlimefunItemStack STEEL_SPRING = ThemedItemStack.of(
        GastroTheme.TRAP,
        "GN_STEEL_SPRING",
        Material.STRING,
        "Steel Spring"
    );

    public static final SlimefunItemStack CRAB_TRAP = ThemedItemStack.of(
        GastroTheme.TRAP,
        "GN_CRAB_TRAP",
        Material.OAK_TRAPDOOR,
        "Crab Trap"
    );

    public static final SlimefunItemStack HUNTING_TRAP = ThemedItemStack.of(
        GastroTheme.TRAP,
        "GN_HUNTING_TRAP",
        Material.IRON_TRAPDOOR,
        "Hunting Trap"
    );

    public static final SlimefunItemStack FISHING_NET = ThemedItemStack.of(
        GastroTheme.TRAP,
        "GN_FISHING_NET",
        Material.COBWEB,
        "Fishing Net"
    );

    // -- Other --

    public static final SlimefunItemStack WOODEN_SICKLE = ThemedItemStack.of(
        GastroTheme.TOOL,
        "GN_WOODEN_SICKLE",
        Material.WOODEN_HOE,
        "Wooden Sickle"
    );

    public static final SlimefunItemStack STEEL_SICKLE = ThemedItemStack.of(
        GastroTheme.TOOL,
        "GN_STEEL_SICKLE",
        Material.IRON_HOE,
        "Steel Sickle"
    );

    public static final SlimefunItemStack REINFORCED_SICKLE = ThemedItemStack.of(
        GastroTheme.TOOL,
        "GN_REINFORCED_SICKLE",
        Material.NETHERITE_HOE,
        "Reinforced Sickle"
    );
 

    // ---- Basic Machines ----

    public static final SlimefunItemStack CULINARY_WORKBENCH = ThemedItemStack.of(
        GastroTheme.MECHANICAL,
        "GN_CULINARY_WORKBENCH",
        Material.CRAFTING_TABLE,
        "Culinary Workbench"
    );

    public static final SlimefunItemStack MULTI_STOVE = ThemedItemStack.of(
        GastroTheme.MECHANICAL,
        "GN_MULTI_STOVE",
        Material.BLAST_FURNACE,
        "Multi-Stove",
        LoreBuilder.powerBuffer(600),
        LoreBuilder.power(150, "/Craft")
    );

    public static final SlimefunItemStack REFRIDGERATOR = ThemedItemStack.of(
        GastroTheme.MECHANICAL,
        "GN_REFRIDGERATOR",
        Material.IRON_BLOCK,
        "Refridgerator",
        LoreBuilder.powerBuffer(600),
        LoreBuilder.power(150, "/Craft")
    );

    public static final SlimefunItemStack MILL = ThemedItemStack.of(
        GastroTheme.MECHANICAL,
        "GN_MILL",
        Material.CAULDRON,
        "Grain Mill"
    );

    public static final SlimefunItemStack DISTILLERY = ThemedItemStack.of(
        GastroTheme.MECHANICAL,
        "GN_DISTILLERY",
        Material.BARREL,
        "Distillery"
    );

    // ---- Raw Ingredients ----

    // -- Crops --

    public static final SlimefunItemStack RICE = ThemedItemStack.ingredient(
        "GN_RICE",
        Material.PUMPKIN_SEEDS,
        "Rice"
    );

    public static final SlimefunItemStack QUINOA = ThemedItemStack.ingredient(
        "GN_QUINOA",
        Material.PUMPKIN_SEEDS,
        "Quinoa"
    );

    public static final SlimefunItemStack OATS = ThemedItemStack.ingredient(
        "GN_OATS",
        Material.BEETROOT_SEEDS,
        "Oats"
    );

    public static final SlimefunItemStack SOYBEANS = ThemedItemStack.ingredient(
        "GN_SOYBEANS",
        Material.BEETROOT_SEEDS,
        "Soybeans"
    );

    public static final SlimefunItemStack BARLEY = ThemedItemStack.ingredient(
        "GN_BARLEY",
        Material.WHEAT,
        "Barley"
    );

    public static final SlimefunItemStack BARLEY_SEEDS = ThemedItemStack.ingredient(
        "GN_BARLEY_SEEDS",
        Material.WHEAT_SEEDS,
        "Barley Seeds"
    );

    public static final SlimefunItemStack RYE = ThemedItemStack.ingredient(
        "GN_RYE",
        Material.WHEAT,
        "Rye"
    );

    public static final SlimefunItemStack RYE_SEEDS = ThemedItemStack.ingredient(
        "GN_RYE_SEEDS",
        Material.PUMPKIN_SEEDS,
        "Rye Seeds"
    );

    public static final SlimefunItemStack SORGHUM = ThemedItemStack.ingredient(
        "GN_SORGHUM",
        Material.WHEAT,
        "Sorghum"
    );

    public static final SlimefunItemStack SORGHUM_SEEDS = ThemedItemStack.ingredient(
        "GN_SORGHUM_SEEDS",
        Material.BEETROOT_SEEDS,
        "Sorghum Seeds"
    );

    public static final SlimefunItemStack TURNIP = ThemedItemStack.ingredient(
        "GN_TURNIP",
        Material.BEETROOT,
        "Turnip"
    );

    public static final SlimefunItemStack TURNIP_SEEDS = ThemedItemStack.ingredient(
        "GN_TURNIP_SEEDS",
        Material.MELON_SEEDS,
        "Turnip Seeds"
    );

    public static final SlimefunItemStack SQUASH = ThemedItemStack.ingredient(
        "GN_SQUASH",
        Material.MELON,
        "Squash"
    );

    public static final SlimefunItemStack SQUASH_SEEDS = ThemedItemStack.ingredient(
        "GN_SQUASH_SEEDS",
        Material.PUMPKIN_SEEDS,
        "Squash Seeds"
    );

    public static final SlimefunItemStack CELERY = ThemedItemStack.ingredient(
        "GN_CELERY",
        Material.SUGAR_CANE,
        "Celery"
    );

    public static final SlimefunItemStack BOK_CHOY = ThemedItemStack.ingredient(
        "GN_BOK_CHOY",
        Material.MANGROVE_PROPAGULE,
        "Bok Choy"
    );

    public static final SlimefunItemStack SNOW_PEAS = ThemedItemStack.ingredient(
        "GN_SNOW_PEAS",
        Material.GREEN_DYE,
        "Snow Peas"
    );

    public static final SlimefunItemStack BROCCOLI = ThemedItemStack.ingredient(
        "GN_BROCCOLI",
        Material.OAK_SAPLING,
        "Broccoli"
    );

    public static final SlimefunItemStack WASABI_PLANT = ThemedItemStack.ingredient(
        "GN_WASABI_PLANT",
        Material.SMALL_DRIPLEAF,
        "Wasabi Plant"
    );

    public static final SlimefunItemStack LEMONGRASS = ThemedItemStack.ingredient(
        "GN_LEMONGRASS",
        Material.SUGAR_CANE,
        "Lemongrass"
    );

    public static final SlimefunItemStack CUCUMBER = ThemedItemStack.ingredient(
        "GN_CUCUMBER",
        Material.SEA_PICKLE,
        "Cucumber"
    );
    public static final SlimefunItemStack BASIL = ThemedItemStack.ingredient(
        "GN_BASIL",
        Material.KELP,
        "Basil"
    );

    public static final SlimefunItemStack SPINACH = ThemedItemStack.ingredient(
        "GN_SPINACH",
        Material.BIG_DRIPLEAF,
        "Spinach"
    );

    public static final SlimefunItemStack BRUSSLES_SPROUTS = ThemedItemStack.ingredient(
        "GN_BRUSSLES_SPROUTS",
        Material.SMALL_DRIPLEAF,
        "Brussles Sprouts"
    );

    public static final SlimefunItemStack MINT = ThemedItemStack.ingredient(
        "GN_MINT",
        Material.FERN,
        "Mint"
    );

    public static final SlimefunItemStack CHILI_PEPPER = ThemedItemStack.ingredient(
        "GN_CHILI_PEPPER",
        Material.RED_CANDLE,
        "Chili Pepper"
    );

    public static final SlimefunItemStack PARSLEY = ThemedItemStack.ingredient(
        "GN_PARSLEY",
        Material.SMALL_DRIPLEAF,
        "Parsley"
    );

    public static final SlimefunItemStack CASSAVA = ThemedItemStack.ingredient(
        "GN_CASSAVA",
        Material.CARROT,
        "Cassava"
    );

    public static final SlimefunItemStack LENTILS = ThemedItemStack.ingredient(
        "GN_LENTILS",
        Material.PUMPKIN_SEEDS,
        "Lentils"
    );

    public static final SlimefunItemStack PEANUTS = ThemedItemStack.ingredient(
        "GN_PEANUTS",
        Material.PUMPKIN_SEEDS,
        "Peanuts"
    );

    public static final SlimefunItemStack BEANS = ThemedItemStack.ingredient(
        "GN_BEANS",
        Material.BEETROOT_SEEDS,
        "Beans"
    );

    public static final SlimefunItemStack PEAS = ThemedItemStack.ingredient(
        "GN_PEAS",
        Material.WHEAT_SEEDS,
        "Peas"
    );

    public static final SlimefunItemStack ASPARAGUS = ThemedItemStack.ingredient(
        "GN_ASPARAGUS",
        Material.BAMBOO,
        "Asparagus"
    );

    public static final SlimefunItemStack CAULIFLOWER = ThemedItemStack.ingredient(
        "GN_CAULIFLOWER",
        Material.BIRCH_SAPLING,
        "Cauliflower"
    );

    // -- Grown from trees --

    public static final SlimefunItemStack LYCHEE = ThemedItemStack.ingredient(
        "GN_LYCHEE",
        Material.BEETROOT,
        "Lychee"
    );
    public static final SlimefunItemStack LYCHEE_SAPLING = ThemedItemStack.ingredient(
        "GN_LYCHEE_SAPLING",
        Material.OAK_SAPLING,
        "Lychee Sapling"
    );
    public static final SlimefunItemStack PERSIMMON = ThemedItemStack.ingredient(
        "GN_PERSIMMON",
        Material.ORANGE_DYE,
        "Persimmon"
    );
    public static final SlimefunItemStack PERSIMMON_SAPLING = ThemedItemStack.ingredient(
        "GN_PERSIMMON_SAPLING",
        Material.OAK_SAPLING,
        "Persimmon Sapling"
    );
    public static final SlimefunItemStack BANANA = ThemedItemStack.ingredient(
        "GN_BANANA",
        Material.YELLOW_DYE,
        "Banana"
    );
    public static final SlimefunItemStack BANANA_SAPLING = ThemedItemStack.ingredient(
        "GN_BANANA_SAPLING",
        Material.OAK_SAPLING,
        "Banana Sapling"
    );
    public static final SlimefunItemStack VANILLA_BEANS = ThemedItemStack.ingredient(
        "GN_VANILLA_BEANS",
        Material.COCOA_BEANS,
        "Vanilla Beans"
    );
    public static final SlimefunItemStack VANILLA_SAPLING = ThemedItemStack.ingredient(
        "GN_VANILLA_SAPLING",
        Material.OAK_SAPLING,
        "Vanilla Sapling"
    );

    // -- Harvested --

    public static final SlimefunItemStack FIDDLEHEADS = ThemedItemStack.ingredient(
        "GN_FIDDLEHEADS",
        Material.FERN,
        "Fiddleheads"
    );

    public static final SlimefunItemStack TRUFFLES = ThemedItemStack.ingredient(
        "GN_TRUFFLES",
        Material.BROWN_MUSHROOM,
        "Truffles"
    );

    public static final SlimefunItemStack ENOKI_MUSHROOMS = ThemedItemStack.ingredient(
        "GN_ENOKI_MUSHROOMS",
        Material.BROWN_MUSHROOM,
        "Enoki Mushrooms"
    );

    public static final SlimefunItemStack KING_OYSTER_MUSHROOM = ThemedItemStack.ingredient(
        "GN_KING_OYSTER_MUSHROOM",
        Material.BROWN_MUSHROOM,
        "King Oyster Mushroom"
    );

    public static final SlimefunItemStack BUTTON_MUSHROOM = ThemedItemStack.ingredient(
        "GN_BUTTON_MUSHROOM",
        Material.BROWN_MUSHROOM,
        "Button Mushroom"
    );

    public static final SlimefunItemStack CLAM = ThemedItemStack.ingredient(
        "GN_CLAM",
        Material.NAUTILUS_SHELL,
        "Clam"
    );

    // -- Dropped from mobs --

    public static final SlimefunItemStack RAW_CHEVON = ThemedItemStack.ingredient(
        "GN_RAW_CHEVON",
        Material.MUTTON,
        "Raw Chevon"
    );

    public static final SlimefunItemStack COOKED_CHEVON = ThemedItemStack.ingredient(
        "GN_COOKED_CHEVON",
        Material.COOKED_MUTTON,
        "Cooked Chevon"
    );

    public static final SlimefunItemStack FROG_LEG = ThemedItemStack.ingredient(
        "GN_FROG_LEG",
        Material.STICK,
        "Frog Leg"
    );

    public static final SlimefunItemStack GIANT_SPIDER_LEG = ThemedItemStack.ingredient(
        "GN_GIANT_SPIDER_LEG",
        Material.STICK,
        "Giant Spider Leg"
    );

    public static final SlimefunItemStack SALMON_ROE = ThemedItemStack.ingredient(
        "GN_SALMON_ROE",
        Material.BEETROOT_SEEDS,
        "Salmon Roe"
    );

    public static final SlimefunItemStack GUARDIAN_FIN = ThemedItemStack.ingredient(
        "GN_GUARDIAN_FIN",
        Material.PRISMARINE_SHARD,
        "Guardian Fin"
    );

    public static final SlimefunItemStack RAW_SQUID = ThemedItemStack.ingredient(
        "GN_RAW_SQUID",
        Material.PORKCHOP,
        "Raw Squid"
    );

    public static final SlimefunItemStack COOKED_SQUID = ThemedItemStack.ingredient(
        "GN_COOKED_SQUID",
        Material.COOKED_PORKCHOP,
        "Cooked Squid"
    );

    // -- From fishing --

    public static final SlimefunItemStack RAW_MACKEREL = ThemedItemStack.ingredient(
        "GN_RAW_MACKEREL",
        Material.COD,
        "Raw Mackerel"
    );
    public static final SlimefunItemStack COOKED_MACKEREL = ThemedItemStack.ingredient(
        "GN_COOKED_MACKEREL",
        Material.COOKED_COD,
        "Cooked Mackerel"
    );

    public static final SlimefunItemStack RAW_EEL = ThemedItemStack.ingredient(
        "GN_RAW_EEL",
        Material.SALMON,
        "Raw Eel"
    );
    public static final SlimefunItemStack COOKED_EEL = ThemedItemStack.ingredient(
        "GN_COOKED_EEL",
        Material.COOKED_SALMON,
        "Cooked Eel"
    );  

    public static final SlimefunItemStack RAW_TROUT = ThemedItemStack.ingredient(
        "GN_RAW_TROUT",
        Material.COD,
        "Raw Trout"
    );
    public static final SlimefunItemStack COOKED_TROUT = ThemedItemStack.ingredient(
        "GN_COOKED_TROUT",
        Material.COOKED_COD,
        "Cooked Trout"
    );
    
    public static final SlimefunItemStack RAW_BASS = ThemedItemStack.ingredient(
        "GN_RAW_BASS",
        Material.COD,
        "Raw Bass"
    );
    public static final SlimefunItemStack COOKED_BASS = ThemedItemStack.ingredient(
        "GN_COOKED_BASS",
        Material.COOKED_COD,
        "Cooked Bass"
    );

    public static final SlimefunItemStack RAW_CARP = ThemedItemStack.ingredient(
        "GN_RAW_CARP",
        Material.COD,
        "Raw Carp"
    );
    public static final SlimefunItemStack COOKED_CARP = ThemedItemStack.ingredient(
        "GN_COOKED_CARP",
        Material.COOKED_COD,
        "Cooked Carp"
    );
    
    public static final SlimefunItemStack RAW_PIKE = ThemedItemStack.ingredient(
        "GN_RAW_PIKE",
        Material.COD,
        "Raw Pike"
    );
    public static final SlimefunItemStack COOKED_PIKE = ThemedItemStack.ingredient(
        "GN_COOKED_PIKE",
        Material.COOKED_COD,
        "Cooked Pike"
    );
    
    public static final SlimefunItemStack RAW_TUNA = ThemedItemStack.ingredient(
        "GN_RAW_TUNA",
        Material.COD,
        "Raw Pike"
    );

    public static final SlimefunItemStack COOKED_TUNA = ThemedItemStack.ingredient(
        "GN_COOKED_TUNA",
        Material.COOKED_COD,
        "Cooked Tuna"
    );
    
    public static final SlimefunItemStack SHRIMP = ThemedItemStack.ingredient(
        "GN_SHRIMP",
        Material.COD,
        "Shrimp"
    );

    static {
        WildHarvestListener.registerDrops(
            Material.GRASS,
            RICE, QUINOA, OATS, SOYBEANS, BARLEY_SEEDS, RYE_SEEDS, SORGHUM_SEEDS, TURNIP_SEEDS, SQUASH_SEEDS,
            CELERY, BOK_CHOY, SNOW_PEAS, BROCCOLI, WASABI_PLANT, LEMONGRASS, CUCUMBER, BASIL, SPINACH,
            BRUSSLES_SPROUTS, MINT, CHILI_PEPPER, PARSLEY, CASSAVA, LENTILS, PEANUTS, BEANS, PEAS, ASPARAGUS,
            CAULIFLOWER, LYCHEE_SAPLING, PERSIMMON_SAPLING, BANANA_SAPLING, VANILLA_SAPLING
        );

        WildHarvestListener.registerDrops(
            Material.FERN,
            FIDDLEHEADS, CELERY, BOK_CHOY, SNOW_PEAS, BROCCOLI, WASABI_PLANT, LEMONGRASS, CUCUMBER, BASIL, SPINACH,
            BRUSSLES_SPROUTS, MINT, CHILI_PEPPER, PARSLEY, CASSAVA, LENTILS, PEANUTS, BEANS, PEAS, ASPARAGUS,
            CAULIFLOWER
        );

        WildHarvestListener.registerDrops(
            Material.PODZOL,
            TRUFFLES, ENOKI_MUSHROOMS, KING_OYSTER_MUSHROOM, BUTTON_MUSHROOM
        );

        WildHarvestListener.registerDrops(
            Material.MYCELIUM,
            TRUFFLES, ENOKI_MUSHROOMS, KING_OYSTER_MUSHROOM, BUTTON_MUSHROOM
        );

        WildHarvestListener.registerDrops(
            Material.SEAGRASS, CLAM);

        WildHarvestListener.registerDrops(EntityType.GOAT, RAW_CHEVON);
        WildHarvestListener.registerDrops(EntityType.FROG, FROG_LEG);
        WildHarvestListener.registerDrops(EntityType.SPIDER, GIANT_SPIDER_LEG);
        WildHarvestListener.registerDrops(EntityType.SALMON, SALMON_ROE);
        WildHarvestListener.registerDrops(EntityType.GUARDIAN, GUARDIAN_FIN);
        WildHarvestListener.registerDrops(EntityType.SQUID, RAW_SQUID);

        WildHarvestListener.registerFishingDrops(Material.COD, RAW_MACKEREL, RAW_EEL, RAW_TROUT, SHRIMP);
        WildHarvestListener.registerFishingDrops(Material.SALMON, RAW_BASS, RAW_CARP, RAW_PIKE, RAW_TUNA);
    }

    // -- From traps --

    public static final SlimefunItemStack CRAB = ThemedItemStack.ingredient(
        "GN_CRAB",
        Material.RED_DYE,
        "Crab"
    );
    
    public static final SlimefunItemStack RAW_TURKEY = ThemedItemStack.ingredient(
        "GN_RAW_TURKEY",
        Material.CHICKEN,
        "Raw Turkey"
    );
    public static final SlimefunItemStack COOKED_TURKEY = ThemedItemStack.ingredient(
        "GN_COOKED_TURKEY",
        Material.COOKED_CHICKEN,
        "Cooked Turkey"
    );

    // ---- Food ----

    // -- Ingredients --

    public static final SlimefunItemStack COOKED_RICE = ThemedItemStack.ingredient(
        "GN_COOKED_RICE",
        Material.SUGAR,
        "Cooked Rice"
    );

    public static final SlimefunItemStack BARLEY_FLOUR = ThemedItemStack.ingredient(
        "GN_BARLEY_FLOUR",
        Material.SUGAR,
        "Barley Flour"
    );

    public static final SlimefunItemStack DOUGH = ThemedItemStack.ingredient(
        "GN_DOUGH",
        Material.POTATO,
        "Dough"
    );

    public static final SlimefunItemStack TOAST = ThemedItemStack.ingredient(
        "GN_TOAST",
        Material.BREAD,
        "Toast"
    );

    public static final SlimefunItemStack PEANUT_BUTTER = ThemedItemStack.ingredient(
        "GN_PEANUT_BUTTER",
        Material.POTION,
        "Peanut Butter"
    );
    static {
        final PotionMeta meta = (PotionMeta) PEANUT_BUTTER.getItemMeta();
        meta.setBasePotionData(new PotionData(PotionType.THICK));
        meta.setColor(Color.fromRGB(0xbf7715));
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        PEANUT_BUTTER.setItemMeta(meta);
    }

    public static final SlimefunItemStack FRIED_EGG = ThemedItemStack.ingredient(
        "GN_FRIED_EGG",
        Material.EGG,
        "Fried Egg"
    );

    public static final SlimefunItemStack HARD_BOILED_EGG = ThemedItemStack.ingredient(
        "GN_HARD_BOILED_EGG",
        Material.EGG,
        "Hard-boiled Egg"
    );

    public static final SlimefunItemStack SCRAMBLED_EGGS = ThemedItemStack.ingredient(
        "GN_SCRAMBLED_EGGS",
        Material.YELLOW_DYE,
        "Scrambled Eggs"
    );

    public static final SlimefunItemStack CUSTARD = ThemedItemStack.ingredient(
        "GN_CUSTARD",
        Material.YELLOW_DYE,
        "Custard"
    );

    public static final SlimefunItemStack MARMALADE = ThemedItemStack.ingredient(
        "GN_MARMALADE",
        Material.HONEY_BOTTLE,
        "Marmalade"
    );

    public static final SlimefunItemStack PULLED_PORK = ThemedItemStack.ingredient(
        "GN_PULLED_PORK",
        Material.BROWN_DYE,
        "Pulled Pork"
    );

    public static final SlimefunItemStack GROUND_BEEF = ThemedItemStack.ingredient(
        "GN_GROUND_BEEF",
        Material.BROWN_DYE,
        "Ground Beef"
    );

    public static final SlimefunItemStack BAKED_BEANS = ThemedItemStack.ingredient(
        "GN_BAKED_BEANS",
        Material.BEETROOT_SEEDS,
        "Baked Beans"
    );

    public static final SlimefunItemStack SOY_SAUCE = ThemedItemStack.ingredient(
        "GN_SOY_SAUCE",
        Material.POTION, 
        "Soy Sauce"
    );
    static {
        final PotionMeta meta = (PotionMeta) SOY_SAUCE.getItemMeta();
        meta.setBasePotionData(new PotionData(PotionType.MUNDANE));
        meta.setColor(Color.fromRGB(0x1d0a03));
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        SOY_SAUCE.setItemMeta(meta);
    }

    // -- Cuisine --

    // Sandwiches

    public static final FoodItemStack PBJ_SANDWICH = FoodItemStack.of(
        "GN_PBJ_SANDWICH",
        HeadTextures.SANDWICH_RED_OCHRE,
        "PB&J Sandwich",
        8,
        1d,
        FoodEffect.chanceOf(FoodEffect.positivePotionEffect(PotionEffectType.INCREASE_DAMAGE, 90), 0.5)
    );

    public static final FoodItemStack MARMALADE_SANDWICH = FoodItemStack.of(
        "GN_MARMALADE_SANDWICH",
        HeadTextures.SANDWICH_ORANGE,
        "Marmalade Sandwich",
        8,
        1d,
        FoodEffect.positivePotionEffect(PotionEffectType.INCREASE_DAMAGE, 30)
    );

    public static final FoodItemStack BAKED_BEANS_AND_TOAST = FoodItemStack.of(
        "GN_BAKED_BEANS_AND_TOAST",
        HeadTextures.TOAST_ORANGE,
        "Baked Beans and Toast",
        8,
        1d,
        new FoodEffect[] {
            FoodEffect.chanceOf(FoodEffect.positivePotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 90), 0.5)
        }
    );

    public static final FoodItemStack TUNA_SANDWICH = FoodItemStack.of(
        "GN_TUNA_SANDWICH",
        HeadTextures.SANDWICH_RED_GREEN,
        "Tuna Sandwich",
        8,
        1d,
        FoodEffect.positivePotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 30)
    );

    public static final FoodItemStack BREAKFAST_SANDWICH = FoodItemStack.of(
        "GN_BREAKFAST_SANDWICH",
        HeadTextures.SANDWICH_ORANGE,
        "Breakfast Sandwich",
        8,
        1d,
        FoodEffect.chanceOf(FoodEffect.positivePotionEffect(PotionEffectType.REGENERATION, 90), 0.5)
    );

    public static final FoodItemStack HAM_SANDWICH = FoodItemStack.of(
        "GN_HAM_SANDWICH",
        HeadTextures.SANDWICH_ORANGE,
        "Ham Sandwich",
        8,
        1d,
        FoodEffect.positivePotionEffect(PotionEffectType.REGENERATION, 30)
    );

    public static final FoodItemStack CHICKEN_SANDWICH = FoodItemStack.of(
        "GN_CHICKEN_SANDWICH",
        HeadTextures.SANDWICH_RED_GREEN,
        "Chicken Salad Sandwich",
        8,
        1d,
        FoodEffect.chanceOf(FoodEffect.positivePotionEffect(PotionEffectType.SPEED, 90), 0.5)
    );

    public static final FoodItemStack EGG_SALAD_SANDWICH = FoodItemStack.of(
        "GN_EGG_SALAD_SANDWICH",
        HeadTextures.SANDWICH_WHITE_GREEN,
        "Egg Salad Sandwich",
        8,
        1d,
        FoodEffect.positivePotionEffect(PotionEffectType.SPEED, 30)
    );

    public static final FoodItemStack ROAST_BEEF_SANDWICH = FoodItemStack.of(
        "GN_ROAST_BEEF_SANDWICH",
        HeadTextures.SANDWICH_RED_GREEN,
        "Roast Beef Sandwich",
        8,
        1d,
        FoodEffect.chanceOf(FoodEffect.positivePotionEffect(PotionEffectType.ABSORPTION, 90), 0.5)
    );

    public static final FoodItemStack CLUB_SANDWICH = FoodItemStack.of(
        "GN_CLUB_SANDWICH",
        HeadTextures.SANDWICH_RED_GREEN,
        "Club Sandwich",
        8,
        1d,
        FoodEffect.positivePotionEffect(PotionEffectType.ABSORPTION, 30)
    );

    // Salads

    public static final FoodItemStack GREEK_SALAD = FoodItemStack.of(
        "GN_GREEK_SALAD",
        HeadTextures.SALAD,
        "Greek Salad",
        5,
        1d,
        new FoodEffect[] {
            FoodEffect.heal(2),
            FoodEffect.positivePotionEffect(PotionEffectType.ABSORPTION, 30)
        }
    );

    public static final FoodItemStack CAESAR_SALAD = FoodItemStack.of(
        "GN_CAESAR_SALAD",
        HeadTextures.SALAD,
        "Caesar Salad",
        5,
        1d,
        new FoodEffect[] {
            FoodEffect.heal(2),
            FoodEffect.positivePotionEffect(PotionEffectType.ABSORPTION, 30)
        }
    );

    // Fried

    public static final FoodItemStack PAN_SEARED_SALMON = FoodItemStack.of(
        "GN_PAN_SEARED_SALMON",
        Material.COOKED_SALMON,
        "Pan-seared Salmon",
        7,
        1d,
        FoodEffect.positivePotionEffect(PotionEffectType.ABSORPTION, 30)
    );

    public static final FoodItemStack FRIED_SHRIMP = FoodItemStack.of(
        "GN_FRIED_SHRIMP",
        Material.NAUTILUS_SHELL,
        "Fried Shrimp",
        3,
        1d,
        FoodEffect.positivePotionEffect(PotionEffectType.ABSORPTION, 30)
    );

    public static final FoodItemStack TEMPURA_SHRIMP = FoodItemStack.of(
        "GN_TEMPURA_SHRIMP",
        Material.NAUTILUS_SHELL,
        "Tempura Shrimp",
        4,
        1d,
        FoodEffect.positivePotionEffect(PotionEffectType.ABSORPTION, 30)
    );

    public static final FoodItemStack TEMPURA_BROCCOLI = FoodItemStack.of(
        "GN_TEMPURA_BROCCOLI",
        Material.BAKED_POTATO,
        "Tempura Broccoli",
        3,
        1d,
        FoodEffect.positivePotionEffect(PotionEffectType.ABSORPTION, 30)
    );

    // Pastas

    public static final FoodItemStack CHICKEN_PESTO_PASTA = FoodItemStack.of(
        "GN_CHICKEN_PESTO_PASTA",
        HeadTextures.PASTA_GREEN,
        "Chicken Pesto Pasta",
        8,
        1d,
        FoodEffect.removePotionEffect(PotionEffectType.WEAKNESS)
    );

    public static final FoodItemStack SQUID_INK_PASTA = FoodItemStack.of(
        "GN_SQUID_INK_PASTA",
        HeadTextures.PASTA_BLACK,
        "Squid Ink Pasta",
        6,
        1d
    );

    public static final FoodItemStack GLOWING_SQUID_INK_PASTA = FoodItemStack.of(
        "GN_GLOWING_SQUID_INK_PASTA",
        HeadTextures.PASTA_BLACK,
        "Glowing Squid Ink Pasta",
        6,
        1d,
        FoodEffect.positivePotionEffect(PotionEffectType.GLOWING, 120, 0)
    );

    public static final FoodItemStack CHICKEN_RAVIOLI = FoodItemStack.of(
        "GN_CHICKEN_RAVIOLI",
        HeadTextures.PASTA_RED,
        "Chicken Ravioli",
        10,
        1d,
        FoodEffect.removePotionEffect(PotionEffectType.WEAKNESS)
    );

    public static final FoodItemStack MUSHROOM_RAVIOLI = FoodItemStack.of(
        "GN_MUSHROOM_RAVIOLI",
        HeadTextures.PASTA_RED,
        "Mushroom Ravioli",
        8,
        1d,
        FoodEffect.removePotionEffect(PotionEffectType.WEAKNESS)
    );

    // Soups and Stews

    public static final FoodItemStack OATMEAL = FoodItemStack.of(
        "GN_OATMEAL",
        HeadTextures.PORRIDGE,
        "Porridge",
        6,
        1.75,
        new FoodEffect[] {
            FoodEffect.removePotionEffect(PotionEffectType.POISON),
            FoodEffect.removePotionEffect(PotionEffectType.HUNGER)
        }
    );

    public static final FoodItemStack BARLEY_PORRIDGE = FoodItemStack.of(
        "GN_BARLEY_PORRIDGE",
        HeadTextures.PORRIDGE,
        "Porridge",
        6,
        1.75,
        new FoodEffect[] {
            FoodEffect.removePotionEffect(PotionEffectType.POISON),
            FoodEffect.removePotionEffect(PotionEffectType.HUNGER)
        }
    );

    public static final FoodItemStack CONGEE = FoodItemStack.of(
        "GN_CONGEE",
        HeadTextures.PORRIDGE,
        "Porridge",
        6,
        1.75,
        new FoodEffect[] {
            FoodEffect.removePotionEffect(PotionEffectType.POISON),
            FoodEffect.removePotionEffect(PotionEffectType.HUNGER)
        }
    );

    public static final FoodItemStack CHICKEN_SOUP = FoodItemStack.of(
        "GN_CHICKEN_SOUP",
        HeadTextures.SOUP,
        "Chicken Soup",
        6,
        1.75,
        new FoodEffect[] {
            FoodEffect.removePotionEffect(PotionEffectType.POISON),
            FoodEffect.removePotionEffect(PotionEffectType.HUNGER)
        }
    );

    public static final FoodItemStack CHICKEN_NOODLE_SOUP = FoodItemStack.of(
        "GN_CHICKEN_NOODLE_SOUP",
        HeadTextures.SOUP,
        "Chicken Noodle Soup",
        8,
        1.75,
        new FoodEffect[] {
            FoodEffect.removePotionEffect(PotionEffectType.POISON),
            FoodEffect.removePotionEffect(PotionEffectType.WITHER),
            FoodEffect.removePotionEffect(PotionEffectType.HUNGER)
        }
    );

    public static final FoodItemStack SPLIT_PEA_SOUP = FoodItemStack.of(
        "GN_SPLIT_PEA_SOUP",
        HeadTextures.SOUP,
        "Split Pea Soup",
        6,
        1.75,
        FoodEffect.removePotionEffect(PotionEffectType.CONFUSION)
    );

    public static final FoodItemStack HAM_AND_SPLIT_PEA_SOUP = FoodItemStack.of(
        "GN_HAM_AND_SPLIT_PEA_SOUP",
        HeadTextures.SOUP,
        "Ham and Split Pea Soup",
        8,
        1.75,
        FoodEffect.removePotionEffect(PotionEffectType.CONFUSION)
    );

    public static final FoodItemStack LENTIL_SOUP = FoodItemStack.of(
        "GN_LENTIL_SOUP",
        HeadTextures.SOUP,
        "Lentil Soup",
        8,
        1.75,
        FoodEffect.positivePotionEffect(PotionEffectType.SATURATION, 5)
    );

    public static final FoodItemStack BEEF_AND_LENTIL_SOUP = FoodItemStack.of(
        "GN_BEEF_AND_LENTIL_SOUP",
        HeadTextures.SOUP,
        "Beef and Lentil Soup",
        10,
        1.75,
        FoodEffect.positivePotionEffect(PotionEffectType.SATURATION, 10, 1)
    );

    public static final FoodItemStack CARROT_SOUP = FoodItemStack.of(
        "GN_CARROT_SOUP",
        HeadTextures.SOUP,
        "Carrot Soup",
        8,
        1.75,
        FoodEffect.removePotionEffect(PotionEffectType.BLINDNESS)
    );

    public static final FoodItemStack MUSHROOM_BARLEY_SOUP = FoodItemStack.of(
        "GN_MUSHROOM_BARLEY_SOUP",
        HeadTextures.SOUP,
        "Mushroom Barley Soup",
        8,
        2d,
        FoodEffect.warm(70)
    );

    public static final FoodItemStack CHICKEN_BARLEY_SOUP = FoodItemStack.of(
        "GN_CHICKEN_BARLEY_SOUP",
        HeadTextures.SOUP,
        "Chicken Barley Soup",
        10,
        2d,
        FoodEffect.warm(70)
    );

    public static final FoodItemStack BEEF_BARLEY_SOUP = FoodItemStack.of(
        "GN_BEEF_BARLEY_SOUP",
        HeadTextures.SOUP,
        "Beef Barley Soup",
        12,
        2d,
        FoodEffect.warm(70)
    );

    public static final FoodItemStack CREAM_OF_MUSHROOM_SOUP = FoodItemStack.of(
        "GN_CREAM_OF_MUSHROOM_SOUP",
        HeadTextures.CREAM_SOUP,
        "Cream of Mushroom Soup",
        7,
        1.75,
        FoodEffect.heal(2)
    );

    public static final FoodItemStack CREAM_OF_BROCCOLI_SOUP = FoodItemStack.of(
        "GN_CREAM_OF_BROCCOLI_SOUP",
        HeadTextures.CREAM_SOUP,
        "Cream of Celery Soup",
        8,
        1.75,
        FoodEffect.heal(3)
    );

    public static final FoodItemStack CREAM_OF_ASPARAGUS_SOUP = FoodItemStack.of(
        "GN_CREAM_OF_ASPARAGUS_SOUP",
        HeadTextures.CREAM_SOUP,
        "Cream of Asparagus Soup",
        8,
        1.75,
        FoodEffect.heal(3)
    );

    public static final FoodItemStack CREAM_OF_CAULIFLOWER_SOUP = FoodItemStack.of(
        "GN_CREAM_OF_CAULIFLOWER_SOUP",
        HeadTextures.CREAM_SOUP,
        "Cream of Cauliflower Soup",
        8,
        1.75,
        FoodEffect.heal(3)
    );

    public static final FoodItemStack MISO_SOUP = FoodItemStack.of(
        "GN_MISO_SOUP",
        HeadTextures.MISO_SOUP,
        "Miso Soup",
        4,
        1.75,
        FoodEffect.warm(50)
    );

    public static final FoodItemStack BROCCOLI_CHOWDER = FoodItemStack.of(
        "GN_BROCCOLI_CHOWDER",
        HeadTextures.CHOWDER,
        "Broccoli Chowder",
        8,
        1.75
    );

    public static final FoodItemStack SALMON_CHOWDER = FoodItemStack.of(
        "GN_SALMON_CHOWDER",
        HeadTextures.CHOWDER,
        "Salmon Chowder",
        10,
        1.75
    );

    public static final FoodItemStack POTATO_CHOWDER = FoodItemStack.of(
        "GN_POTATO_CHOWDER",
        HeadTextures.CHOWDER,
        "Potato Chowder",
        8,
        1.75
    );

    public static final FoodItemStack CORN_CHOWDER = FoodItemStack.of(
        "GN_CORN_CHOWDER",
        HeadTextures.CHOWDER,
        "Corn Chowder",
        8,
        1.75
    );

    public static final FoodItemStack BEEF_STEW = FoodItemStack.of(
        "GN_BEEF_STEW",
        HeadTextures.STEW,
        "Beef Stew",
        10,
        1.75,
        FoodEffect.warm(140)
    );

    public static final FoodItemStack CLAM_STEW = FoodItemStack.of(
        "GN_CLAM_STEW",
        HeadTextures.STEW,
        "Clam Stew",
        6,
        1.75,
        FoodEffect.warm(50)
    );
    
    public static final FoodItemStack CRAB_HOTPOT = FoodItemStack.of(
        "GN_CRAB_HOTPOT",
        HeadTextures.STEW,
        "Crab Hotpot",
        12,
        1.75,
        FoodEffect.warm(140)
    );

    public static final FoodItemStack BBQ_STEAK = FoodItemStack.of(
        "GN_BBQ_STEAK",
        Material.COOKED_BEEF,
        "BBQ Steak",
        12,
        1.5
    );

    public static final FoodItemStack BBQ_PORK = FoodItemStack.of(
        "GN_BBQ_PORK",
        Material.COOKED_PORKCHOP,
        "BBQ Pork",
        12,
        1.5
    );

    public static final FoodItemStack BBQ_CHICKEN = FoodItemStack.of(
        "GN_BBQ_CHICKEN",
        Material.COOKED_CHICKEN,
        "BBQ Chicken",
        9,
        1.5
    );

    public static final FoodItemStack BBQ_MUTTON = FoodItemStack.of(
        "GN_BBQ_MUTTON",
        Material.COOKED_MUTTON,
        "BBQ Mutton",
        9,
        1.5
    );

    public static final FoodItemStack BUTTER_CHICKEN = FoodItemStack.of(
        "GN_BUTTER_CHICKEN",
        HeadTextures.STEW,
        "Butter Chicken",
        7,
        1.5,
        FoodEffect.positivePotionEffect(PotionEffectType.INCREASE_DAMAGE, 30)
    );

    public static final FoodItemStack SHRIMP_FRIED_RICE = FoodItemStack.of(
        "GN_SHRIMP_FRIED_RICE",
        HeadTextures.RICE_PINK,
        "Shrimp Fried Rice",
        6,
        1d
    );

    public static final FoodItemStack CURRY_RICE = FoodItemStack.of(
        "GN_CURRY_RICE",
        HeadTextures.RICE_BROWN,
        "Curry Rice",
        4,
        1d,
        FoodEffect.positivePotionEffect(PotionEffectType.INCREASE_DAMAGE, 30)
    );

    public static final FoodItemStack RICE_OMELETTE = FoodItemStack.of(
        "GN_RICE_OMELETTE",
        HeadTextures.RICE_YELLOW,
        "Rice Omelette",
        4,
        1d,
        FoodEffect.heal(2)
    );

    public static final FoodItemStack RICE_BALLS = FoodItemStack.of(
        "GN_RICE_BALLS",
        HeadTextures.RICE_BALLS,
        "Rice Balls",
        3,
        1d,
        FoodEffect.heal(2)
    );

    public static final FoodItemStack BEEF_UDON = FoodItemStack.of(
        "GN_BEEF_UDON",
        HeadTextures.UDON,
        "Beef Udon",
        10,
        1d,
        FoodEffect.heal(2)
    );

    public static final FoodItemStack CHICKEN_UDON = FoodItemStack.of(
        "GN_CHICKEN_UDON",
        HeadTextures.UDON,
        "Chicken Udon",
        10,
        1d,
        FoodEffect.heal(2)
    );

    public static final FoodItemStack VEGETABLE_UDON = FoodItemStack.of(
        "GN_VEGETABLE_UDON",
        HeadTextures.UDON,
        "Vegetable Udon",
        10,
        1d,
        FoodEffect.heal(2)
    );

    public static final FoodItemStack STIR_FRY_NOODLES = FoodItemStack.of(
        "GN_STIR_FRY_NOODLES",
        HeadTextures.NOODLES,
        "Stir-fry Noodles",
        8,
        1d
    );
}
