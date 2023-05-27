package com.example.cubedcraft.modules;

import com.example.cubedcraft.CubedCraftAddon;
import meteordevelopment.meteorclient.systems.modules.Module;

/**
 * Module that does nothing.
 */
public class DoesNothingModule extends Module {
    public DoesNothingModule() {
        super(CubedCraftAddon.CATEGORY, "nothing", "Does absolutely nothing.");
    }
}
