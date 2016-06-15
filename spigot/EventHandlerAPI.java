package kev575.api;

import org.bukkit.*;

/**
 * @author Kev575
 */
public class BucketAPI {
	private BucketAPI() {}
	
	private String joinMessage, quitMessage;
	
	public static void register(Plugin plugin) {
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	/**
	 * @author Kev575
	 */
	public static void setJoinMessage(String str) {
		joinMessage = str;
	}
	
	/**
	 * @author Kev575
	 */
	public static void setQuitMessage(String str) {
		quitMessage = str;
	}
	
}
