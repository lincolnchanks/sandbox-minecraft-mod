package com.erikkholdern.sandbox.component;

import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.RegistryWrapper;

public class AbrasionComponentImpl implements AbrasionComponent {
    private double lastX;
    private double lastZ;

    public AbrasionComponentImpl(){

    }

    @Override
    public double getLastX() {
        return lastX;
    }

    @Override
    public void setLastX(double lastX) {
        this.lastX = lastX;
    }

    @Override
    public double getLastZ() {
        return lastZ;
    }

    @Override
    public void setLastZ(double lastZ) {
        this.lastZ = lastZ;
    }

    @Override
    public void readFromNbt(NbtCompound nbtCompound, RegistryWrapper.WrapperLookup wrapperLookup) {
        lastX = nbtCompound.getDouble("LastX");
        lastZ = nbtCompound.getDouble("LastZ");
    }

    @Override
    public void writeToNbt(NbtCompound nbtCompound, RegistryWrapper.WrapperLookup wrapperLookup) {
        nbtCompound.putDouble("LastX", lastX);
        nbtCompound.putDouble("LastZ", lastZ);
    }
}
