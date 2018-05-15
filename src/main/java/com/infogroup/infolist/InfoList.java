package com.infogroup.infolist;

import com.infogroup.infolist.utils.FileManager;
import com.infogroup.infolist.utils.ListManager;
import com.infogroup.infolist.utils.Metrics;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class InfoList extends JavaPlugin {

    private ListManager LM;
    private FileManager FM;

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

    private void instances(){
        this.LM = new ListManager(this);


    }


    private void dependencies(){

    }

    /**
     * Get the ListManager
     * @return
     */
    public ListManager getLM(){ return this.LM; }

    /**
     * Get the FileManager
     * @return
     */
    public FileManager getFM(){ return this.FM; }
}
