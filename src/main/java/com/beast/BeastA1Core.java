package com.beast;

public class BeastA1Core {
    public static void main(String[] args) {
        System.out.println("Beast Mode Activated for Infinix Note 30 5G");
    }
    
    // Performance Tweak
    public static void applySettings() {
        System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "8");
    }
}
