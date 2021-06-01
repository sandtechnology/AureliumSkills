package com.archyx.aureliumskills.skills;

public enum Source {

	// Farming
	WHEAT("farming.wheat"),
	POTATO("farming.potato"),
	CARROT("farming.carrot"),
	BEETROOT("farming.beetroot"),
	NETHER_WART("farming.nether_wart"),
	PUMPKIN("farming.pumpkin"),
	MELON("farming.melon"),
	SUGAR_CANE("farming.sugar_cane"),
	BAMBOO("farming.bamboo"),
	COCOA("farming.cocoa"),
	CACTUS("farming.cactus"),
	BROWN_MUSHROOM("farming.brown_mushroom"),
	RED_MUSHROOM("farming.red_mushroom"),
	KELP("farming.kelp"),
	SEA_PICKLE("farming.sea_pickle"),
	SWEET_BERRY_BUSH("farming.sweet_berry_bush"),
	// Foraging
	OAK_LOG("foraging.oak_log"),
	SPRUCE_LOG("foraging.spruce_log"),
	BIRCH_LOG("foraging.birch_log"),
	JUNGLE_LOG("foraging.jungle_log"),
	ACACIA_LOG("foraging.acacia_log"),
	DARK_OAK_LOG("foraging.dark_oak_log"),
	OAK_LEAVES("foraging.oak_leaves"),
	BIRCH_LEAVES("foraging.birch_leaves"),
	SPRUCE_LEAVES("foraging.spruce_leaves"),
	JUNGLE_LEAVES("foraging.jungle_leaves"),
	DARK_OAK_LEAVES("foraging.dark_oak_leaves"),
	ACACIA_LEAVES("foraging.acacia_leaves"),
	CRIMSON_STEM("foraging.crimson_stem"),
	WARPED_STEM("foraging.warped_stem"),
	NETHER_WART_BLOCK("foraging.nether_wart_block"),
	WARPED_WART_BLOCK("foraging.warped_wart_block"),
	// Mining
	STONE("mining.stone"),
	COBBLESTONE("mining.cobblestone"),
	GRANITE("mining.granite"),
	DIORITE("mining.diorite"),
	ANDESITE("mining.andesite"),
	COAL_ORE("mining.coal_ore"),
	IRON_ORE("mining.iron_ore"),
	QUARTZ_ORE("mining.quartz_ore"),
	REDSTONE_ORE("mining.redstone_ore"),
	GOLD_ORE("mining.gold_ore"),
	LAPIS_ORE("mining.lapis_ore"),
	DIAMOND_ORE("mining.diamond_ore"),
	EMERALD_ORE("mining.emerald_ore"),
	TERRACOTTA("mining.terracotta"),
	WHITE_TERRACOTTA("mining.white_terracotta"),
	ORANGE_TERRACOTTA("mining.orange_terracotta"),
	YELLOW_TERRACOTTA("mining.yellow_terracotta"),
	LIGHT_GRAY_TERRACOTTA("mining.light_gray_terracotta"),
	BROWN_TERRACOTTA("mining.brown_terracotta"),
	RED_TERRACOTTA("mining.red_terracotta"),
	NETHERRACK("mining.netherrack"),
	BLACKSTONE("mining.blackstone"),
	BASALT("mining.basalt"),
	MAGMA_BLOCK("mining.magma_block"),
	NETHER_GOLD_ORE("mining.nether_gold_ore"),
	ANCIENT_DEBRIS("mining.ancient_debris"),
	END_STONE("mining.end_stone"),
	OBSIDIAN("mining.obsidian"),
	// Fishing
    COD("fishing.cod"),
    SALMON("fishing.salmon"),
    TROPICAL_FISH("fishing.tropical_fish"),
    PUFFERFISH("fishing.pufferfish"),
    TREASURE("fishing.treasure"),
    JUNK("fishing.junk"),
    FISHING_RARE("fishing.rare"),
    FISHING_EPIC("fishing.epic"),
	// Excavation
    DIRT("excavation.dirt"),
    GRASS_BLOCK("excavation.grass_block"),
    SAND("excavation.sand"),
    GRAVEL("excavation.gravel"),
    MYCELIUM("excavation.mycelium"),
    CLAY("excavation.clay"),
    SOUL_SAND("excavation.soul_sand"),
	COARSE_DIRT("excavation.coarse_dirt"),
	PODZOL("excavation.podzol"),
	SOUL_SOIL("excavation.soul_soil"),
	RED_SAND("excavation.red_sand"),
	// Archery
	ARCHERY_PLAYER("archery.player"),
	ARCHERY_BAT("archery.bat"),
	ARCHERY_CAT("archery.cat"),
	ARCHERY_CHICKEN("archery.chicken"),
	ARCHERY_COD("archery.cod"),
	ARCHERY_COW("archery.cow"),
	ARCHERY_DONKEY("archery.donkey"),
	ARCHERY_FOX("archery.fox"),
	ARCHERY_GIANT("archery.giant"),
	ARCHERY_HORSE("archery.horse"),
	ARCHERY_MUSHROOM_COW("archery.mooshroom"),
	ARCHERY_MULE("archery.mule"),
	ARCHERY_OCELOT("archery.ocelot"),
	ARCHERY_PARROT("archery.parrot"),
	ARCHERY_PIG("archery.pig"),
	ARCHERY_RABBIT("archery.rabbit"),
	ARCHERY_SALMON("archery.salmon"),
	ARCHERY_SHEEP("archery.sheep"),
	ARCHERY_SKELETON_HORSE("archery.skeleton_horse"),
	ARCHERY_SNOWMAN("archery.snow_golem"),
	ARCHERY_SQUID("archery.squid"),
	ARCHERY_STRIDER("archery.strider"),
	ARCHERY_TROPICAL_FISH("archery.tropical_fish"),
	ARCHERY_TURTLE("archery.turtle"),
	ARCHERY_VILLAGER("archery.villager"),
	ARCHERY_WANDERING_TRADER("archery.wandering_trader"),
	ARCHERY_BEE("archery.bee"),
	ARCHERY_CAVE_SPIDER("archery.cave_spider"),
	ARCHERY_DOLPHIN("archery.dolphin"),
	ARCHERY_ENDERMAN("archery.enderman"),
	ARCHERY_IRON_GOLEM("archery.iron_golem"),
	ARCHERY_LLAMA("archery.llama"),
	ARCHERY_PIGLIN("archery.piglin"),
	ARCHERY_PANDA("archery.panda"),
	ARCHERY_POLAR_BEAR("archery.polar_bear"),
	ARCHERY_PUFFERFISH("archery.pufferfish"),
	ARCHERY_SPIDER("archery.spider"),
	ARCHERY_WOLF("archery.wolf"),
	ARCHERY_ZOMBIFIED_PIGLIN("archery.zombified_piglin"),
	ARCHERY_BLAZE("archery.blaze"),
	ARCHERY_CREEPER("archery.creeper"),
	ARCHERY_DROWNED("archery.drowned"),
	ARCHERY_ELDER_GUARDIAN("archery.elder_guardian"),
	ARCHERY_ENDERMITE("archery.endermite"),
	ARCHERY_EVOKER("archery.evoker"),
	ARCHERY_GHAST("archery.ghast"),
	ARCHERY_GUARDIAN("archery.guardian"),
	ARCHERY_HOGLIN("archery.hoglin"),
	ARCHERY_HUSK("archery.husk"),
	ARCHERY_ILLUSIONER("archery.illusioner"),
	ARCHERY_MAGMA_CUBE("archery.magma_cube"),
	ARCHERY_PHANTOM("archery.phantom"),
	ARCHERY_PIGLIN_BRUTE("archery.piglin_brute"),
	ARCHERY_PILLAGER("archery.pillager"),
	ARCHERY_RAVAGER("archery.ravager"),
	ARCHERY_SHULKER("archery.shulker"),
	ARCHERY_SILVERFISH("archery.silverfish"),
	ARCHERY_SKELETON("archery.skeleton"),
	ARCHERY_SLIME("archery.slime"),
	ARCHERY_STRAY("archery.stray"),
	ARCHERY_VEX("archery.vex"),
	ARCHERY_VINDICATOR("archery.vindicator"),
	ARCHERY_WITCH("archery.witch"),
	ARCHERY_WITHER_SKELETON("archery.wither_skeleton"),
	ARCHERY_ZOGLIN("archery.zoglin"),
	ARCHERY_ZOMBIE("archery.zombie"),
	ARCHERY_ZOMBIE_VILLAGER("archery.zombie_villager"),
	ARCHERY_ENDER_DRAGON("archery.ender_dragon"),
	ARCHERY_WITHER("archery.wither"),
	// Defense
    MOB_DAMAGE("defense.mob_damage"),
    PLAYER_DAMAGE("defense.player_damage"),
	// Fighting
	FIGHTING_PLAYER("fighting.player"),
	FIGHTING_BAT("fighting.bat"),
	FIGHTING_CAT("fighting.cat"),
	FIGHTING_CHICKEN("fighting.chicken"),
	FIGHTING_COD("fighting.cod"),
	FIGHTING_COW("fighting.cow"),
	FIGHTING_DONKEY("fighting.donkey"),
	FIGHTING_FOX("fighting.fox"),
	FIGHTING_GIANT("fighting.giant"),
	FIGHTING_HORSE("fighting.horse"),
	FIGHTING_MUSHROOM_COW("fighting.mooshroom"),
	FIGHTING_MULE("fighting.mule"),
	FIGHTING_OCELOT("fighting.ocelot"),
	FIGHTING_PARROT("fighting.parrot"),
	FIGHTING_PIG("fighting.pig"),
	FIGHTING_RABBIT("fighting.rabbit"),
	FIGHTING_SALMON("fighting.salmon"),
	FIGHTING_SHEEP("fighting.sheep"),
	FIGHTING_SKELETON_HORSE("fighting.skeleton_horse"),
	FIGHTING_SNOWMAN("fighting.snow_golem"),
	FIGHTING_SQUID("fighting.squid"),
	FIGHTING_STRIDER("fighting.strider"),
	FIGHTING_TROPICAL_FISH("fighting.tropical_fish"),
	FIGHTING_TURTLE("fighting.turtle"),
	FIGHTING_VILLAGER("fighting.villager"),
	FIGHTING_WANDERING_TRADER("fighting.wandering_trader"),
	FIGHTING_BEE("fighting.bee"),
	FIGHTING_CAVE_SPIDER("fighting.cave_spider"),
	FIGHTING_DOLPHIN("fighting.dolphin"),
	FIGHTING_ENDERMAN("fighting.enderman"),
	FIGHTING_IRON_GOLEM("fighting.iron_golem"),
	FIGHTING_LLAMA("fighting.llama"),
	FIGHTING_PIGLIN("fighting.piglin"),
	FIGHTING_PANDA("fighting.panda"),
	FIGHTING_POLAR_BEAR("fighting.polar_bear"),
	FIGHTING_PUFFERFISH("fighting.pufferfish"),
	FIGHTING_SPIDER("fighting.spider"),
	FIGHTING_WOLF("fighting.wolf"),
	FIGHTING_ZOMBIFIED_PIGLIN("fighting.zombified_piglin"),
	FIGHTING_BLAZE("fighting.blaze"),
	FIGHTING_CREEPER("fighting.creeper"),
	FIGHTING_DROWNED("fighting.drowned"),
	FIGHTING_ELDER_GUARDIAN("fighting.elder_guardian"),
	FIGHTING_ENDERMITE("fighting.endermite"),
	FIGHTING_EVOKER("fighting.evoker"),
	FIGHTING_GHAST("fighting.ghast"),
	FIGHTING_GUARDIAN("fighting.guardian"),
	FIGHTING_HOGLIN("fighting.hoglin"),
	FIGHTING_HUSK("fighting.husk"),
	FIGHTING_ILLUSIONER("fighting.illusioner"),
	FIGHTING_MAGMA_CUBE("fighting.magma_cube"),
	FIGHTING_PHANTOM("fighting.phantom"),
	FIGHTING_PIGLIN_BRUTE("fighting.piglin_brute"),
	FIGHTING_PILLAGER("fighting.pillager"),
	FIGHTING_RAVAGER("fighting.ravager"),
	FIGHTING_SHULKER("fighting.shulker"),
	FIGHTING_SILVERFISH("fighting.silverfish"),
	FIGHTING_SKELETON("fighting.skeleton"),
	FIGHTING_SLIME("fighting.slime"),
	FIGHTING_STRAY("fighting.stray"),
	FIGHTING_VEX("fighting.vex"),
	FIGHTING_VINDICATOR("fighting.vindicator"),
	FIGHTING_WITCH("fighting.witch"),
	FIGHTING_WITHER_SKELETON("fighting.wither_skeleton"),
	FIGHTING_ZOGLIN("fighting.zoglin"),
	FIGHTING_ZOMBIE("fighting.zombie"),
	FIGHTING_ZOMBIE_VILLAGER("fighting.zombie_villager"),
	FIGHTING_ENDER_DRAGON("fighting.ender_dragon"),
	FIGHTING_WITHER("fighting.wither"),
	// Endurance
    WALK_PER_METER("endurance.walk_per_meter"),
    SPRINT_PER_METER("endurance.sprint_per_meter"),
    SWIM_PER_METER("endurance.swim_per_meter"),
	// Agility
    JUMP_PER_100("agility.jump_per_100"),
    FALL_DAMAGE("agility.fall_damage"),
	// Alchemy
	AWKWARD("alchemy.awkward"),
	REGULAR("alchemy.regular"),
	EXTENDED("alchemy.extended"),
	UPGRADED("alchemy.upgraded"),
	SPLASH("alchemy.splash"),
	LINGERING("alchemy.lingering"),
	// Enchanting
	WEAPON_PER_LEVEL("enchanting.weapon_per_level"),
	ARMOR_PER_LEVEL("enchanting.armor_per_level"),
	TOOL_PER_LEVEL("enchanting.tool_per_level"),
	BOOK_PER_LEVEL("enchanting.book_per_level"),
	// Sorcery
	MANA_ABILITY_USE("sorcery.mana_ability_use"),
	// Healing
	DRINK_REGULAR("healing.drink_regular"),
	DRINK_EXTENDED("healing.drink_extended"),
	DRINK_UPGRADED("healing.drink_upgraded"),
	SPLASH_REGULAR("healing.splash_regular"),
	SPLASH_EXTENDED("healing.splash_extended"),
	SPLASH_UPGRADED("healing.splash_upgraded"),
	LINGERING_REGULAR("healing.lingering_regular"),
	LINGERING_EXTENDED("healing.lingering_extended"),
	LINGERING_UPGRADED("healing.lingering_upgraded"),
	GOLDEN_APPLE("healing.golden_apple"),
	ENCHANTED_GOLDEN_APPLE("healing.enchanted_golden_apple"),
	// Forging
	COMBINE_BOOKS_PER_LEVEL("forging.combine_books_per_level"),
	COMBINE_WEAPON_PER_LEVEL("forging.combine_weapon_per_level"),
	COMBINE_ARMOR_PER_LEVEL("forging.combine_armor_per_level"),
	COMBINE_TOOL_PER_LEVEL("forging.combine_tool_per_level"),
	GRINDSTONE_PER_LEVEL("forging.grindstone_per_level");
	
	private final String path;
	
	Source(String path) {
		this.path = path;
	}
	
	public String getPath() {
		return path;
	}
	
}
