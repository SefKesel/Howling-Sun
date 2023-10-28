package sefkesel;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import sefkesel.entities.ModEntities;
import sefkesel.entities.client.HowlerModel;
import sefkesel.entities.client.HowlerRenderer;
import sefkesel.entities.client.ModModelLayers;
import sefkesel.events.KeyEventHandler;
import sefkesel.networking.ModMessages;

public class HowlingSunClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // This entrypoint is suitable for setting up client-specific logic, such as rendering.
        KeyEventHandler.register();
        ModMessages.registerS2CPackets();

        EntityRendererRegistry.register(ModEntities.HOWLER, HowlerRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.HOWLER, HowlerModel::getTexturedModelData);
    }
}