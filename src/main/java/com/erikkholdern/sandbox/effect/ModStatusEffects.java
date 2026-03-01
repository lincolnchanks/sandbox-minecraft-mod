package com.erikkholdern.sandbox.effect;

import com.erikkholdern.sandbox.Sandbox;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModStatusEffects {
    public static final RegistryEntry<StatusEffect> ABRASION = registerStatusEffect("abrasion",
            new AbrasionStatusEffect());

    private static RegistryEntry<StatusEffect> registerStatusEffect(String name, StatusEffect statusEffect){
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(Sandbox.MOD_ID, "abrasion"),
                statusEffect);
    }

    public static void registerModStatusEffects(){
        Sandbox.LOGGER.info("Registering Mod Status Effects for " + Sandbox.MOD_ID);
    }

//    static {
//        ABRASION = Registry.registerReference(Registries.STATUS_EFFECT,
//                Identifier.of(Sandbox.MOD_ID, "abrasion"), new AbrasionStatusEffect());
//    }
}
