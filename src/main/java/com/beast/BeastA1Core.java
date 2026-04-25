package com.beast;
import net.fabricmc.api.ModInitializer;

public class BeastA1Core implements ModInitializer {
    @Override
    public void onInitialize() {
        // CPU ko instruction ki game priority badhao
        Thread.currentThread().setPriority(10);
        System.out.println("Beast Mode: High Priority FPS Enabled");
    }
}
