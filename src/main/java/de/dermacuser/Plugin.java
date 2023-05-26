package de.dermacuser;

import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;

import de.dermacuser.commands.build;

/*
 * lobby java plugin
 */
public class Plugin extends JavaPlugin
{
  private static final Logger LOGGER=Logger.getLogger("lobby");

  public void onEnable()
  {
    LOGGER.info("lobby enabled");

    this.getCommand("build").setExecutor(build this);

  }

  public void onDisable()
  {
    LOGGER.info("lobby disabled");
  }
}
