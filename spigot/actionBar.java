/**
 * @param message set to null to reset
 */
public static void actionBar(Player p, String message) {
	if (message == null) message = "";
	PlayerConnection pcon = ((CraftPlayer) p).getHandle().playerConnection;
	IChatBaseComponent c = ChatSerializer.a("{\"text\": \"" + message.replace("%p", p.getName()).replace("&", "§") + "\"}");
	PacketPlayOutChat pouc = new PacketPlayOutChat(c, (byte) 2);
	pcon.sendPacket(pouc);
}