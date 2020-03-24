package com.example.config;

import org.springframework.stereotype.Component;

import io.crnk.core.boot.CrnkBoot;
import io.crnk.spring.setup.boot.core.CrnkBootConfigurer;

@Component
public class CrnkBootConfigurerImpl implements CrnkBootConfigurer {

    @Override
    public void configure(CrnkBoot boot) {
        boot.addModule(new HttpOverrideModule("HttpOverrideModule"));
    }
}
