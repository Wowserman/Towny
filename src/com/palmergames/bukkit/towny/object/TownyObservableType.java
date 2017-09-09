package com.palmergames.bukkit.towny.object;

/**
 * @author dumptruckman
 */
public enum TownyObservableType {
	// TownyObject
	OBJECT_NAME,

	// TownyUniverse
	NEW_DAY,
	TOGGLE_REPEATING_TIMER,
	TOGGLE_MOB_REMOVAL,
	TOGGLE_DAILY_TIMER,
	TOGGLE_HEALTH_REGEN,
	TOGGLE_TOWNY_INFORMATION_TASK,
	TOGGLE_TELEPORT_WARMUP,
	TOGGLE_DRAW_SMOKE_TIMER,
	PLAYER_LOGIN,
	PLAYER_LOGOUT,
	NEW_RESIDENT,
	NEW_TOWN,
	NEW_NATION,
	NEW_WORLD,
	RENAME_RESIDENT,
	RENAME_TOWN,
	RENAME_NATION,
	TOWN_ADD_RESIDENT,
	TOWN_REMOVE_RESIDENT,
	COLLECTED_NATION_TAX,
	COLLECTED_TONW_TAX,
	WAR_START,
	WAR_END,
	WAR_CLEARED,
	WAR_SET,
	REMOVE_NATION,
	REMOVE_TOWN,
	REMOVE_RESIDENT,
	REMOVE_TOWN_BLOCK,
	UPKEEP_NATION,
	UPKEEP_TOWN,
	TELEPORT_REQUEST,
}