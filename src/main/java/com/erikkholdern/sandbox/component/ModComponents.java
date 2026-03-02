package com.erikkholdern.sandbox.component;

import com.erikkholdern.sandbox.Sandbox;
import net.minecraft.util.Identifier;
import org.ladysnake.cca.api.v3.component.ComponentKey;
import org.ladysnake.cca.api.v3.component.ComponentRegistry;

public class ModComponents {
    public static final ComponentKey<AbrasionComponent> ABRASION =
            ComponentRegistry.getOrCreate(
                    Identifier.of(Sandbox.MOD_ID, "abrasion"),
                    AbrasionComponent.class
            );

//    public static void init(){
//        ABRASION = ComponentRegistry.getOrCreate(
//                Identifier.of(Sandbox.MOD_ID, "abrasion"),
//                AbrasionComponent.class
//        );
//    }

//    public static final ComponentKey<AbrasionComponent> ABRASION =
//            ComponentRegistry.getOrCreate(
//                    Identifier.of(Sandbox.MOD_ID, "abrasion"),
//                    AbrasionComponent.class
//            );
//
//    private ModComponents(){
//
//    }




//            ComponentRegistry.getOrCreate(new Identifier(Sandbox.MOD_ID, "abrasion"),
//                    AbrasionComponentImpl.class);


//            GLIDE =
//            ComponentRegistry.getOrCreate(Identifier.of(Sandbox.MOD_ID, "glide"),
//                    AbrasionComponentImpl.class);
}
