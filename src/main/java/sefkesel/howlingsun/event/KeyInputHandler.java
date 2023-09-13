package sefkesel.howlingsun.event;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.text.Text;
import org.lwjgl.glfw.GLFW;
import sefkesel.howlingsun.Gui.LibGui.ModMenu;
import sefkesel.howlingsun.Gui.LibGui.ModScreen;

public class KeyInputHandler {
    public static final String CATEGORY_KEY = "key.category.howlingsun";
    public static final String MENU_KEY = "key.category.howlingsun.menu";

    public static KeyBinding openMenu;
    public static void registerKeyInputs(){ // Que sucede segun la tecla presionada
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if(openMenu.wasPressed()){
                assert client.player != null;
                client.player.sendMessage(Text.literal("Cacota, espero que funcione"));
                MinecraftClient.getInstance().setScreen(new ModScreen(new ModMenu()));
                // ClientPlayNetworking.send(ModPackets.MENU_ID, PacketByteBufs.create());
            }
        });
    }
    public static void register() { // Registro de cada tecla
        openMenu = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                MENU_KEY, InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_M, CATEGORY_KEY
        ));

        registerKeyInputs();
    }
}
