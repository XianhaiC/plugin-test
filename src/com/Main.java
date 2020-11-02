package com;

import org.bukkit.plugin.java.JavaPlugin;
import com.commands.HelloCommand;

public class Main extends JavaPlugin {

  @Override
  public void onEnable() {
    this.getCommand("hello").setExecutor(new HelloCommand());
  }
}
