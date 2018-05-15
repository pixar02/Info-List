package com.infogroup.infolist.utils;

import com.infogroup.infolist.InfoList;
import com.infogroup.infolist.tablist.IList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class ListManager {

    private InfoList plugin;
    private ArrayList<IList> lists = new ArrayList<>();
    private HashMap<UUID, IList> pLists = new HashMap<>();

    public ListManager(InfoList plugin) {
        this.plugin = plugin;
        loadLists();
    }

    /**
     * create a new List
     * @return
     */
    public InfoList createList(){

        return null;
    }

    /**
     * Load all existing List files
     */
    public void loadLists(){
    }
}