package sefkesel;

import net.fabricmc.api.ClientModInitializer;
import sefkesel.events.KeyEventHandler;
import sefkesel.networking.ModMessages;

public class HowlingSunClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // This entrypoint is suitable for setting up client-specific logic, such as rendering.
        KeyEventHandler.register();
        ModMessages.registerS2CPackets();
    }
}