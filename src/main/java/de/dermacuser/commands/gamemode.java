// 
// Decompiled by Procyon v0.5.36
// 

package de.dermacuser.commands;

import org.bukkit.GameMode;
import de.dermacuser.util.messages;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class gamemode implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {
        final Player p = (Player)sender;
        p.sendMessage(messages.Prefix + " Derzeit nicht verf\u00fcgbar");
        if (sender instanceof Player) {
            if (p.hasPermission("lobby.gamemode")) {
                if (args.length == 1) {
                    if (args[0].equals("0")) {
                        p.setGameMode(GameMode.SURVIVAL);
                        p.sendMessage(messages.Prefix + " Dein Spielmodus ist nun §6" + p.getGameMode());
                    }
                    if (args[0].equals("1")) {
                        p.setGameMode(GameMode.CREATIVE);
                        p.sendMessage(messages.Prefix + " Dein Spielmodus ist nun §6" + p.getGameMode());
                    }
                    if (args[0].equals("2")) {
                        p.setGameMode(GameMode.ADVENTURE);
                        p.sendMessage(messages.Prefix + " Dein Spielmodus ist nun §6" + p.getGameMode());
                    }
                    if (args[0].equals("3")) {
                        p.setGameMode(GameMode.SPECTATOR);
                        p.sendMessage(messages.Prefix + " Dein Spielmodus ist nun §6" + p.getGameMode());
                    }
                }
                else {
                    p.sendMessage(messages.syntaxerror);
                }
            }
        }
        else {
            sender.sendMessage(messages.notpossible);
        }
        return false;
    }
}
