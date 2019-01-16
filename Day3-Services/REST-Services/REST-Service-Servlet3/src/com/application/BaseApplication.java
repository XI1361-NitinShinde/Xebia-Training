package com.application;

import java.util.Collections;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/data")
public class BaseApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {

        return Collections.emptySet();
    }
}
