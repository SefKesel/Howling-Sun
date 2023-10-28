package sefkesel.networking.packet;

import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.entity.PlayerEntityRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.packet.s2c.play.SetCameraEntityS2CPacket;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;
import sefkesel.entities.ModEntities;
import sefkesel.entities.custom.HowlerEntity;
import sefkesel.sounds.ModSounds;
public class HowlC2SPacket {
    public static void receive(MinecraftServer server, ServerPlayerEntity player, ServerPlayNetworkHandler handler, PacketByteBuf buf, PacketSender responseSender) {
        // Everything here happens ONLY on the Server!
        ServerWorld world = player.getServerWorld();

        System.out.println("Entrando al HowlC2SPacket");

        // Play the howling sound
        player.playSound(ModSounds.HOWLING, 1F,1F);

        // Transform

        /*

        System.out.println("Spawneando al how");

        how.updatePositionAndAngles(player.getX(),player.getY(),player.getZ(),player.getYaw(),player.getPitch());
        SetCameraEntityS2CPacket l = new SetCameraEntityS2CPacket(how);
        System.out.println("Seteando camera en el how");

        world.removePlayer(player, Entity.RemovalReason.DISCARDED);
        System.out.println("removiendo player");

        System.out.println("Saliendo del HowlC2SPacket");

         */
    }
}
