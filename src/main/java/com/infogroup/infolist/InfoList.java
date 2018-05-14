package com.infogroup.infolist;

import com.infogroup.infolist.utils.Metrics;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class InfoList extends JavaPlugin {
    Logger logger;
    Metrics metrics;

    public void onEnable() {
        metrics = new Metrics(this);
        logger = this.getLogger();




        logger.info("InfoList is enabled!");
    }

    public void onDisable() {



        logger.info("InfoList is disabled!");
    }

    private void dependencies(){

    }
}
