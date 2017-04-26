package it.slay.mkInertiaDamper.proxy;

import it.slay.mkInertiaDamper.handlers.InertiaDamperEventHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {

    }

    public void init(FMLInitializationEvent event) {

    }

    public void postInit(FMLPostInitializationEvent event) {
        registerEventListeners(event.getSide());
    }

    public void registerEventListeners(Side s) {
        MinecraftForge.EVENT_BUS.register(new InertiaDamperEventHandler());
    }
}