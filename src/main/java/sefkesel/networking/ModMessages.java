package sefkesel.networking;

import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.util.Identifier;
import sefkesel.HowlingSun;
import sefkesel.networking.packet.HowlC2SPacket;

public class ModMessages {
    public static final Identifier HOWL_ID = new Identifier(HowlingSun.MOD_ID, "howl");

    public static void registerC2SPackets() {
        HowlingSun.LOGGER.info("Registering C2S Packets for " + HowlingSun.MOD_ID);
        ServerPlayNetworking.registerGlobalReceiver(HOWL_ID, HowlC2SPacket::receive);
    }

    public static void registerS2CPackets() {
        HowlingSun.LOGGER.info("Registering S2C Packets for " + HowlingSun.MOD_ID);

    }
}
