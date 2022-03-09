package chmodsayshello.antiseedleak.Listeners;

import io.papermc.paper.event.player.ChatEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import static org.bukkit.Bukkit.getLogger;


public class Chat implements Listener {
    long seed;
    String seed_string;

    @EventHandler
    public void onmsg(ChatEvent event){
        Player p = event.getPlayer();
        seed = p.getWorld().getSeed();
        seed_string = Long.toString(seed);
        String msg = event.originalMessage().toString();
        if(msg.contains(seed_string)){
            event.setCancelled(true);
            p.banPlayer("This was an automatic ban for leaking the seed!");
            getLogger().info("Player " + p.toString() +" got banned for leaking the seed... Message : " + msg);
        }
    }
}
