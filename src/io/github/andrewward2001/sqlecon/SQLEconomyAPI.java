package io.github.andrewward2001.sqlecon;

import java.util.UUID;

import org.bukkit.OfflinePlayer;

public class SQLEconomyAPI {
	
	public SQLEconomyAPI() {
		System.out.println("[SQLEconomy] API is in use.");
	}
	
	public String currencyName() {
		return SQLEconomy.moneyUnit;
	}
	
	public boolean accountExists(String name) {
		return SQLEconomyActions.playerDataContainsPlayer(name);
	}
	
	public boolean accountExists(UUID uid) {
		return SQLEconomyActions.playerDataContainsPlayer(uid);
	}
	
	public int getBalance(String name) {
		return SQLEconomyActions.getMoney(name);
	}
	
	public int getBalance(UUID uid) {
		return SQLEconomyActions.getMoney(uid);
	}
	
	public boolean hasEnough(String name, double amount) {
		return SQLEconomyActions.hasEnough(name, (int) amount);
	}
	
	public boolean hasEnough(UUID uid, double amount) {
		return SQLEconomyActions.hasEnough(uid, (int) amount);
	}
	
	public boolean withdraw(String name, double amount) {
		return SQLEconomyActions.removeMoney(name, (int) amount, true);
	}
	
	public boolean withdraw(UUID uid, double amount) {
		return SQLEconomyActions.removeMoney(uid, (int) amount, true);
	}
	
	public boolean give(String name, double amount) {
		return SQLEconomyActions.giveMoney(name, (int) amount, true);
	}
	
	public boolean give(UUID uid, double amount) {
		return SQLEconomyActions.giveMoney(uid, (int) amount, true);
	}
	
	public boolean createAccount(OfflinePlayer player) {
		return SQLEconomyActions.createAccount(player);
	}
	
	public boolean createAccount(String player) {
		return SQLEconomyActions.createAccount(player);
	}

}
