package com.example.cubedcraft.commands;

import static com.mojang.brigadier.Command.SINGLE_SUCCESS;
import static meteordevelopment.meteorclient.MeteorClient.mc;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import meteordevelopment.meteorclient.commands.Command;
import net.minecraft.command.CommandSource;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;

/**
 * Chicken command.
 */
public class ChickenCommand extends Command {
    public ChickenCommand() {
        super("chicken", "Send the amount of rendered chickens.");
    }

    @Override
    public void build(LiteralArgumentBuilder<CommandSource> builder) {
        builder.executes(context -> {
            int count = 0;
            for (Entity entity : mc.world.getEntities()) {
                if (entity.getType() == EntityType.CHICKEN) {
                    count++;
                }
            }

            info("There are " + count + " inside of your render distance!");
            return SINGLE_SUCCESS;
        });
    }
}
