package com.example.config;

import org.springframework.stereotype.Component;

import io.crnk.core.engine.http.HttpMethod;
import io.crnk.core.engine.http.HttpStatus;
import io.crnk.core.engine.http.HttpStatusBehavior;
import io.crnk.core.engine.http.HttpStatusContext;

@Component
public class CustomStatusBehavior implements HttpStatusBehavior {

    @Override
    public Integer getStatus(HttpStatusContext context){
        HttpMethod method = context.getMethod();
        if(method == HttpMethod.POST){
            return HttpStatus.OK_200;
        }
        return null;
    }

}
