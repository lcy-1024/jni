package com.lcy;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.StartupEvent;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

/**
 * @author lichuyang
 * @date 2022/5/18
 */
@ApplicationScoped
public class Start {

    public void test(@Observes StartupEvent ev) {
        new Hello().sayHello();
        Quarkus.asyncExit();
    }
}
