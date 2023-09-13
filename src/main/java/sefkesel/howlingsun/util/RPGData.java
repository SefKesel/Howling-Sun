package sefkesel.howlingsun.util;

import net.minecraft.nbt.NbtCompound;

public class RPGData {
    public static int addHowlingXP(IEntityDataSaver player, int amount){
        NbtCompound nbt = player.getPersistentData();
        int howlingxp = nbt.getInt("howlingxp");
        howlingxp += amount;
        nbt.putInt("howlingxp",howlingxp);
        return howlingxp;
    }
    public static int removeHowlingXP(IEntityDataSaver player, int amount){
        NbtCompound nbt = player.getPersistentData();
        int howlingxp = nbt.getInt("howlingxp");
        if(howlingxp - amount <= 0) {
            howlingxp = 0;
        } else {
            howlingxp -= amount;
        }
        nbt.putInt("howlingxp",howlingxp);
        return howlingxp;
    }
}
