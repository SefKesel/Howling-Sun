package sefkesel.networking.packet;

import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import sefkesel.sounds.ModSounds;

public class HowlC2SPacket {
    public static void receive(MinecraftServer server, ServerPlayerEntity player, ServerPlayNetworkHandler handler, PacketByteBuf buf, PacketSender responseSender) {
        // Everything here happens ONLY on the Server!
        ServerWorld world = player.getServerWorld();

        // Play the howling sound
        if (player.isAlive()){
        world.playSound(null, player.getBlockPos(), ModSounds.HOWLING, SoundCategory.PLAYERS,
                1F, 1F);
        }
    }
}
