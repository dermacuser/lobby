package de.dermacuser.commands;

import java.io.Console;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.dermacuser.util.messages;

public class build implements CommandExecutor{

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        if(sender instanceof Player){
            if(p.hasPermission("Lobby.build")){

            }else{
                p.sendMessage(messages.nopermission);
            }
        }else{
        sender.sendMessage(messages.notpossible);
        }
        return false;
    }
    
}
