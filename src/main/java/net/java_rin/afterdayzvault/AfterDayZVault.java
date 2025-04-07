package net.java_rin.afterdayzvault;

import net.java_rin.afterdayzvault.proxy.IProxy;
import net.java_rin.afterdayzvault.util.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = Tags.MOD_ID, name = Tags.MOD_NAME, version = Tags.VERSION)
public class AfterDayZVault {

    @Mod.Instance(Tags.MOD_ID)
    public static AfterDayZVault instance;

    public static final Logger LOGGER = LogManager.getLogger(Tags.MOD_NAME);

    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
    public static IProxy proxy;

    /**
     * <a href="https://cleanroommc.com/wiki/forge-mod-development/event#overview">
     *     Take a look at how many FMLStateEvents you can listen to via the @Mod.EventHandler annotation here
     * </a>
     */
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        LOGGER.info("§e", Tags.MOD_NAME, "§6HAS BEEN INITIALIZED!!!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) { }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) { }

}
