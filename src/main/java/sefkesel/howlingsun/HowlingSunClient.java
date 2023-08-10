package sefkesel.howlingsun;

import net.fabricmc.api.ClientModInitializer;
import sefkesel.howlingsun.event.KeyInputHandler;
import sefkesel.howlingsun.networking.ModPackets;

public class HowlingSunClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
		KeyInputHandler.register();
		ModPackets.registerS2CPackets();
	}
}