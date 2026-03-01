package com.erikkholdern.sandbox.component;

import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.RegistryWrapper;
import org.ladysnake.cca.api.v3.component.Component;
import org.ladysnake.cca.api.v3.entity.RespawnableComponent;

public class GlideComponentImpl implements GlideComponent, Component {
    private boolean gliding = false;

    @Override
    public boolean isGliding() {
        return gliding;
    }

    @Override
    public void setGliding(boolean gliding) {
        this.gliding = gliding;
    }

    @Override
    public void readFromNbt(NbtCompound tag) {
        gliding = tag.getBoolean("Gliding");
    }

    @Override
    public void writeToNbt(NbtCompound tag) {
        tag.putBoolean("Gliding", gliding);
    }

    @Override
    public void readFromNbt(NbtCompound nbtCompound, RegistryWrapper.WrapperLookup wrapperLookup) {

    }

    @Override
    public void writeToNbt(NbtCompound nbtCompound, RegistryWrapper.WrapperLookup wrapperLookup) {

    }
}
