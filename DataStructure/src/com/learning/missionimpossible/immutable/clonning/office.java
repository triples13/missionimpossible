package com.learning.missionimpossible.immutable.clonning;

import javafx.beans.binding.ObjectExpression;

import java.util.concurrent.atomic.AtomicInteger;

public class office implements  Cloneable{

    private String id;
    private String location;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();

    }
}
