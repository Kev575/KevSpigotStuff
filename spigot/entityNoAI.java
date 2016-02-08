//Found at https://www.spigotmc.org/threads/check-if-entity-has-noai-tag.121831/
public boolean hasAI(org.bukkit.entity.Entity ent) {
	net.minecraft.server.v1_8_R3.Entity entity = ((net.minecraft.server.v1_8_R3.Entity)((CraftEntity)ent).getHandle());
	return entity.getNBTTag() != null && !entity.getNBTTag().isEmpty() && entity.getNBTTag().hasKey("NoAI");
}
public void doStuff(Entity entity) {
	boolean ai = hasAI(entity);
	if (ai) {
		// By happy xD
	} else {
		// Crryyyy xD
	}
}
