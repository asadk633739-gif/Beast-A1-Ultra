package com.beast;

import net.minecraft.client.MinecraftClient;

public class BeastA1Core {
    // Simple init for maximum stability
    public static void init() {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client != null) {
            client.options.maxFps = 100;
        }
    }
}
