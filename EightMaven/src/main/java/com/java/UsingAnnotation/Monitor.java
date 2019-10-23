package com.java.UsingAnnotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Monitor {
	private int timeout;

    public Monitor(int timeout) {
        this.timeout = timeout;
    }

    @PostConstruct
    public void init() throws Exception {
        System.out.println("- - - initializing monitor bean using @PostConstruct");
        System.out.println("timeout: " + timeout);
    }

    @PreDestroy
    public void destroy() throws Exception {
        System.out.println("- - - destroying monitor bean using @PreDestroy");
    }
}
