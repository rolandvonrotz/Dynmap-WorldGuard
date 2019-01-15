package org.dynmap.worldguard;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;

import java.util.*;

public class PlayerFetcher {
    private static final Map<UUID, String> NAMES = new HashMap<>();

    public static String getPlayerName(UUID uuid) {
        if(!NAMES.containsKey(uuid)) {
            OfflinePlayer offlinePlayer = Bukkit.getOfflinePlayer(uuid);
            if(offlinePlayer == null) {
                return "Unknown";
            }
            NAMES.put(uuid, offlinePlayer.getName());
        }
        return NAMES.get(uuid);
    }
}
