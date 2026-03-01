package com.erikkholdern.sandbox.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.math.Vec3d;

public class AbrasionStatusEffect extends StatusEffect {
//    double lastTickHorizontalSpeed;

    protected AbrasionStatusEffect() {
        super(StatusEffectCategory.BENEFICIAL, 0x15e6e2);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override
    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
        // Get the entity's velocity vector and from it, calculate their horizontal speed.
        Vec3d v = entity.getVelocity();
        double currentHorizontalSpeed = Math.sqrt(v.x * v.x + v.z * v.z);

        // Removing this if-statement accidentally created an adhesion-like effect.
        // It also preserved all the velocity my player was given after force was exerted, such as with water.
        // This could be useful for Gravitation down the line!!
        if (currentHorizontalSpeed > 0.01 && entity.isOnGround()){
//            if (currentHorizontalSpeed < lastTickHorizontalSpeed){
                // If this is the case, then friction happened. Restore some of the lost speed.

//            }
//            double boost = 0.05;
//            double scale = (currentHorizontalSpeed + boost) / currentHorizontalSpeed;
//
//            double newX = v.x * scale;
//            double newZ = v.z * scale;

//            entity.setVelocity(newX, v.y, newZ);
            entity.velocityModified = true;

            Vec3d v1 = entity.getVelocity();
//            lastTickHorizontalSpeed = Math.sqrt(v1.x * v1.x + v1.z * v1.z);
        }

//        double glideFactor = 0.95;
//        double newX = v.x * glideFactor;
//        double newZ = v.z * glideFactor;
        return super.applyUpdateEffect(entity, amplifier);
    }
}
