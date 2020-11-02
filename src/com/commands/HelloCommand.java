package com.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Main;

public class HelloCommand implements CommandExecutor {
  @Override
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    if (!(sender instanceof Player)) {
      sender.sendMessage("Only players may execute this command");
      return true;
    }
    
    Player player = (Player) sender;

    if (player.hasPermission("hello.use")) {
      player.sendMessage("Hi!");
      return true;
    }
    else {
      player.sendMessage("You do not have permission to execute this command!");
    }

    return false;
  }
}
