package com.erikkholdern.sandbox.component;

import org.ladysnake.cca.api.v3.entity.EntityComponentFactoryRegistry;
import org.ladysnake.cca.api.v3.entity.EntityComponentInitializer;
import org.ladysnake.cca.api.v3.entity.RespawnCopyStrategy;

public class ModEntityComponents implements EntityComponentInitializer {
    @Override
    public void registerEntityComponentFactories(EntityComponentFactoryRegistry entityComponentFactoryRegistry) {
//        entityComponentFactoryRegistry.registerForPlayers(
//                ModComponents.GLIDE,
//                playerEntity -> new GlideComponentImpl(),
//                RespawnCopyStrategy.ALWAYS_COPY
//        );
    }
}
