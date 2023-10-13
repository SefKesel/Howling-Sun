package sefkesel.sounds;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import sefkesel.HowlingSun;

public class ModSounds {
    public static final SoundEvent HOWLING = registerSoundEvent("howling");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(HowlingSun.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        HowlingSun.LOGGER.info("Registering Sounds for " + HowlingSun.MOD_ID);
    }
}
