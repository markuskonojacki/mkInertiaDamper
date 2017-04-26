package it.slay.mkInertiaDamper;

import it.slay.mkInertiaDamper.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = InertiaDamper.MODID, version = InertiaDamper.VERSION, name = InertiaDamper.NAME)
public class InertiaDamper {
    public static final String NAME = "mkInertiaDamper";
    public static final String MODID = "mkinertiadamper";
    public static final String VERSION = "${mod_version}";

    public static final boolean debug = false;

    @SidedProxy(clientSide = "it.slay.mkInertiaDamper.proxy.ClientProxy", serverSide = "it.slay.mkInertiaDamper.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static InertiaDamper instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
