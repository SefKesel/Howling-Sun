package sefkesel.howlingsun.networking;

import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.util.Identifier;
import sefkesel.howlingsun.HowlingSun;
import sefkesel.howlingsun.networking.packet.MenuC2SPacket;

public class ModPackets {
    public static final Identifier MENU_ID = new Identifier(HowlingSun.MOD_ID,"menu_id");

    public static void registerC2SPackets(){ // Registrar los paquetes del cliente al servidor
        // ServerPlayNetworking.registerGlobalReceiver(MENU_ID, MenuC2SPacket::receive);
    }
    public static void registerS2CPackets(){ // Registrar los paquetes del servidor al cliente

    }
}
