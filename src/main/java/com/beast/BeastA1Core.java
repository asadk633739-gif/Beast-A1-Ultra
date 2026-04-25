package com.beast;
import net.minecraft.client.MinecraftClient;

public class BeastA1Core {
    public static void init() {
        // Infinix Dimensity 6080 Performance Lock
        MinecraftClient.getInstance().options.maxFps = 100;
        System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "8");
    }
}
