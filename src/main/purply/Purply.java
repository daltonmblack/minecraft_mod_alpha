package purply;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid=Purply.MODID, version=Purply.VERSION)
public class Purply {
	
	public static final String MODID = "purpleblock";
    public static final String VERSION = "1.0";
    
    @EventHandler
	public void init(FMLInitializationEvent event) {
    		System.out.println("HALLO WORLDY! Get ready to be purpled!");
    }
}