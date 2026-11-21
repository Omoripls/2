package org.levimc.launcher.core.discord;

import android.app.Application;

/**
 * Discord Rich Presence is disabled in this build: the Discord Social SDK
 * is not available, so these methods intentionally do nothing.
 */
public final class DiscordPresence {
    private DiscordPresence() {}
    public static void initialize(Application application) {}
    public static boolean isConfigured() { return false; }
    public static void refresh() {}
    public static void shutdown() {}
}
