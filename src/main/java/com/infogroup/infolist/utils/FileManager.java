package com.infogroup.infolist.utils;

import com.infogroup.infolist.InfoList;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;

import java.io.*;

public class FileManager {

    private InfoList plugin;

    //Files & configs
    private File listFile;
    private File messagesFile;
    private File listFolder = new File(plugin.getDataFolder(), "lists");

    private FileConfiguration list;
    private FileConfiguration messages;

    public FileManager(InfoList plugin){
        this.plugin = plugin;
        setup();
    }

    private void setup(){
        if(!plugin.getDataFolder().exists()) {
            plugin.getDataFolder().mkdir();
            listFolder.mkdir();
        }

        messagesFile = new File(plugin.getDataFolder(), "messages.yml");
        listFile = new File(plugin.getDataFolder() + "/lists", "list.yml");


        if(!listFile.exists()){
            try {
                listFile.createNewFile();
                copy(plugin.getResource("list.yml"), listFile);
            }catch (IOException ex){

            }
        }
    }





    private void copy(InputStream in, File file) {
        try {
            OutputStream out = new FileOutputStream(file);
            byte[] buf = new byte[1024];
            int len;
            while ((len = in.read(buf)) > 0) {
                out.write(buf, 0, len);
            }
            out.close();
            in.close();
        } catch (Exception ex) {
            Bukkit.getConsoleSender().sendMessage("Could not copy " + file.getName()+ "because: ex");
            ex.printStackTrace();
        }
    }
}
