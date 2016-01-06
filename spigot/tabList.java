/**
 * @param head set to null to reset
 * @param foot set to null to reset
 */
public static void tabList(Player p, String head, String foot) {
	if (head == null) head = "";
	if (foot == null) foot = "";
	PlayerConnection pcon = ((CraftPlayer) p).getHandle().playerConnection;
	IChatBaseComponent h = ChatSerializer.a("{\"text\": \"" + head.replace("%p", p.getName()).replace("&", "§") + "\"}");
	IChatBaseComponent f = ChatSerializer.a("{\"text\": \"" + foot.replace("%p", p.getName()).replace("&", "§") + "\"}");
	PacketPlayOutPlayerListHeaderFooter pack = new PacketPlayOutPlayerListHeaderFooter(h);
	Field fi;
	try {
		fi = pack.getClass().getDeclaredField("b");
		fi.setAccessible(true);
		fi.set(pack, f);
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		pcon.sendPacket(pack);
	}
	
}