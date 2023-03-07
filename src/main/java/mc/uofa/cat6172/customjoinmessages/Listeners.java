package mc.uofa.cat6172.customjoinmessages;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class Listeners implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        String playername = event.getPlayer().getName();
        CustomMessage joinmessage = new CustomMessage(playername, true);
        event.joinMessage(joinmessage.getMessage());
    }

    @EventHandler
    public void onPlayerJoin(PlayerQuitEvent event) {
        String playername = event.getPlayer().getName();
        CustomMessage leavemessage = new CustomMessage(playername, false);
        event.quitMessage(leavemessage.getMessage());
    }
}
