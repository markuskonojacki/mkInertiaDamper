package it.slay.mkInertiaDamper.handlers;

import it.slay.mkInertiaDamper.InertiaDamper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class InertiaDamperEventHandler {
    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent event) {
        EntityPlayer player = event.player;

        // based on: https://github.com/brandon3055/Draconic-Evolution/blob/a3a19e32b486291084ac00e4e1dd10ef868d998a/src/main/java/com/brandon3055/draconicevolution/handlers/CustomArmorHandler.java#L269
        if (!player.onGround && player.capabilities.isFlying && player.moveForward == 0 && player.moveStrafing == 0 && (player.motionX != 0 || player.motionZ != 0)) {
            if (InertiaDamper.debug) {
                System.out.println("X: " + player.motionX + " - Z: " + player.motionZ);
            }

            player.motionX *= 0.5;
            player.motionZ *= 0.5;
        }
    }
}