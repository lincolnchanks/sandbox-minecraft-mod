package com.erikkholdern.sandbox.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;

public class RegenerationGranterItem extends Item {
    public RegenerationGranterItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        // Written/assisted by ChatGPT
        if (user.getWorld().isClient()){
            return ActionResult.SUCCESS;
        }
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 300, 1));
        return ActionResult.SUCCESS;

        // When this item is used on an entity, grant it the Regeneration 2 effect for 15 seconds.
        // If the entity already has the Regeneration effect, set its level to 2 (if it isn't
        // greater than 2 already) and extend its duration by 15 seconds.
//        if (!entity.hasStatusEffect(StatusEffects.REGENERATION)){
//            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 400, 1));
//        }


        // Later the level and durations will depend on the player's levels in Progression.
        // This code will also hopefully be moved to an interface or something later on.
        // For now, this is just a proof of concept to make sure I can actually add an effect
        // to another entity.
    }
}
