package com.infogroup.infolist.tablist;

import org.bukkit.Bukkit;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;

public class List {

    private Scoreboard scoreboard;
    private Objective objective;

    /**
     * Create new scoreboard and Objective
     */
    public List(){
        scoreboard = Bukkit.getScoreboardManager().getNewScoreboard();
        setup();
    }





    /**
    * Setup new Objective
    */
    private void setup(){
        objective.getScoreboard().registerNewObjective("InfoList", "dummy");
        objective.setDisplaySlot(DisplaySlot.PLAYER_LIST);
    }
}
