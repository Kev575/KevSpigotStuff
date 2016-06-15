package kev575.api;

import org.bukkit.*;

/**
 * @author Kev575
 */
public class BucketAPI {
	private BucketAPI() {}
	
	private String joinMessage = "null", quitMessage = "null";
	
	public static void register(Plugin plugin) {
		Bukkit.getPluginManager().registerEvents(new Listener() {
			@EventHandler
			public void onJoin(PlayerJoinEvent e) {
				if (!joinMessage.equalsIgnoreCase("null"))
					e.setJoinMessage(joinMessage);
			}
			@EventHandler
			public void onQuit(PlayerQuitEvent e) {
				if (!quitMessage.equalsIgnoreCase("null"))
					e.setQuitMessage(quitMessage);
			}
		}, plugin);
	}
	
	/**
	 * @author Kev575
	 */
	public static void setJoinMessage(String str) {
		if (str == null)
			str = "null";
		joinMessage = str;
	}
	
	/**
	 * @author Kev575
	 */
	public static void setQuitMessage(String str) {
		if (str == null)
			str = "null";
		quitMessage = str;
	}
	
}
