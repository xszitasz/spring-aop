package sk.posam.fsa.bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Parent {
    // Dont forget to initialize
    private List<Child> children = new ArrayList<>();

    public void add(Child child) {
        this.children.add(child);
    }

    // Add unmodifiableList for best practice
    public List<Child> getChildren() {
        return Collections.unmodifiableList(children);
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }
}
