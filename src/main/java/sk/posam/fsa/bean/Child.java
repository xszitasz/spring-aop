package sk.posam.fsa.bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Child {
    private String name;

    // Life cycle annotations
    @PostConstruct
    public void init() {
        System.out.println("Child init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Child destroy");
    }

    public Child(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
