package com.mischiefsmp.backup;

import com.mischiefsmp.core.api.MischiefPlugin;

public class MischiefBackup extends MischiefPlugin {
    private PluginConfig pluginConfig;

    @Override
    public void init1_onLoad() {

    }

    @Override
    public void init2_onEnable() {
        pluginConfig = new PluginConfig(this);
    }

    @Override
    public void init3_onDone() {

    }

    @Override
    public void init4_onDisable() {

    }
}
