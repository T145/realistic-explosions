package T145.boom.config;

import T145.boom.RealisticExplosions;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = RealisticExplosions.MODID)
@Config(modid = RealisticExplosions.MODID, category = "", name = "T145/" + RealisticExplosions.NAME)
@Config.LangKey(RealisticExplosions.MODID)
public class ModConfig {

	@Config.LangKey(RealisticExplosions.MODID + ".config.general")
	public static final General general = new General();

	public static class General {

		@Config.Comment("Sends you an in-game notification if an update is available")
		public boolean checkForUpdates = true;

		@Config.Comment("Whether or not explosions spawn particles as usual")
		public boolean spawnParticles;
	}
}