package com.infogroup.infolist.utils;

import com.infogroup.infolist.InfoList;

public class Settings {

    private InfoList plugin;

    public Settings(InfoList plugin){
        this.plugin = plugin;
    }

    /**
     * Get Debug True/False
     * @return
     */
    public boolean getDebug(){ return true;}

}
