package com.example.config;

import io.crnk.core.module.SimpleModule;

public class HttpOverrideModule extends SimpleModule {

    public HttpOverrideModule(String moduleName) {
        super(moduleName);
    }

    @Override
    public void setupModule(ModuleContext context){
        context.addHttpStatusBehavior(new CustomStatusBehavior());
    }

}
