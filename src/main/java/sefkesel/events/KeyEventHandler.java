package sefkesel.events;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import org.lwjgl.glfw.GLFW;
import sefkesel.networking.ModMessages;
import sefkesel.sounds.ModSounds;

@Environment(EnvType.CLIENT)
public class KeyEventHandler {
    public static final String CATEGORY_KEY = "key.category.howlingsun";
    public static final String MENU_KEY = "key.category.howlingsun.menu";
    public static final String TRANSFORM_KEY = "key.category.howlingsun.transform";

    public static KeyBinding openMenu;
    public static KeyBinding transform;
    public static void registerKeyInputs(){ // Que sucede segun la tecla presionada
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if(openMenu.wasPressed()){
                client.player.sendMessage(Text.literal("Cacota, espero que funcione"));
                // MinecraftClient.getInstance().setScreen(new ModScreen(new ModMenu()));
                // ClientPlayNetworking.send(ModPackets.MENU_ID, PacketByteBufs.create());
            }
            if(transform.wasPressed()){
                ClientPlayNetworking.send(ModMessages.HOWL_ID, PacketByteBufs.create());
            }
        });
    }
    public static void register() { // Registro de cada tecla
        openMenu = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                MENU_KEY, InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_M, CATEGORY_KEY
        ));
        transform = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                TRANSFORM_KEY, InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_R, CATEGORY_KEY
        ));

        registerKeyInputs();
    }
}
