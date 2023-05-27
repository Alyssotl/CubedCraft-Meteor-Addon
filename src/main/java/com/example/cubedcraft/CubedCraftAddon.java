package com.example.cubedcraft;

import com.example.cubedcraft.commands.ChickenCommand;
import com.example.cubedcraft.modules.DoesNothingModule;
import com.mojang.logging.LogUtils;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.commands.Commands;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;
import org.slf4j.Logger;

/**
 * CubedCraft Meteor Client addon.
 */
public class CubedCraftAddon extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();
    public static final Category CATEGORY = new Category("CubedCraft");

    @Override
    public void onInitialize() {
        LOG.info("Initializing Meteor CubedCraft Addon");

        // Modules
        Modules.get().add(new DoesNothingModule());

        // Commands
        Commands.add(new ChickenCommand());
    }

    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(CATEGORY);
    }

    @Override
    public String getPackage() {
        return "com.example.addon";
    }
}
