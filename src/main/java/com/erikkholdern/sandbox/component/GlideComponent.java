package com.erikkholdern.sandbox.component;

import net.minecraft.nbt.NbtCompound;

public interface GlideComponent {
    boolean isGliding();
    void setGliding(boolean gliding);
    void readFromNbt(NbtCompound tag);
    void writeToNbt(NbtCompound tag);
}
