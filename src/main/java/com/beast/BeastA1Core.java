package com.beast;

import net.fabricmc.api.ModInitializer;
import net.minecraft.client.MinecraftClient;

public class BeastA1Core implements ModInitializer {
    @Override
    public void onInitialize() {
        System.out.println("Beast Mod: Optimized for Infinix Note 30 5G & Holy Renderer");
        
        // Speed up memory cleaning
        Runtime.getRuntime().gc();
        
        // Setup high priority for game tasks
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
    }
}
