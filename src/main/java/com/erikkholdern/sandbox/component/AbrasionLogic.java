package com.erikkholdern.sandbox.component;

import net.minecraft.entity.player.PlayerEntity;

public final class AbrasionLogic {
    public static AbrasionComponent get(PlayerEntity player){
        return ModComponents.ABRASION.get(player);
    }
}
