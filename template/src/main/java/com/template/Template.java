package com.template;

import java.util.logging.Level;

import org.bukkit.plugin.java.JavaPlugin;

public class Template extends JavaPlugin 
{

    @Override
    public void onEnable(){
        this.getServer().getLogger().log(Level.INFO, "[Template plugin enabled]");
    }

    @Override
    public void onDisable(){
        this.getServer().getLogger().log(Level.INFO, "[Template plugin disabled]");
    }

}
