package com.erikkholdern.sandbox.component;

import com.erikkholdern.sandbox.Sandbox;
import net.minecraft.util.Identifier;
import org.ladysnake.cca.api.v3.component.ComponentKey;
import org.ladysnake.cca.api.v3.component.ComponentRegistry;

public class ModComponents {
    public static final ComponentKey<GlideComponentImpl> GLIDE =
            ComponentRegistry.getOrCreate(Identifier.of(Sandbox.MOD_ID, "glide"),
                    GlideComponentImpl.class);
}
