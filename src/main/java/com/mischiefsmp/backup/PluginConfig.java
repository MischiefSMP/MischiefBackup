package com.mischiefsmp.backup;

import com.mischiefsmp.core.api.MischiefPlugin;
import com.mischiefsmp.core.api.config.ConfigFile;
import com.mischiefsmp.core.api.config.ConfigManager;
import com.mischiefsmp.core.api.config.ConfigValue;
import lombok.Getter;

import java.io.FileNotFoundException;
import java.util.ArrayList;

@Getter
public class PluginConfig extends ConfigFile {
    @ConfigValue(path = "output_dir")
    private String outputDir;

    @ConfigValue(path = "file_format")
    private String fileFormat;

    @ConfigValue(path = "include_worlds")
    private boolean includeWorlds;

    @ConfigValue(path = "include")
    private ArrayList<String> include;

    public PluginConfig(MischiefPlugin plugin) {
        super(plugin, "config.yml", "config.yml");
        try {
            ConfigManager.init(this);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
