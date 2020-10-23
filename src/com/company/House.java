package com.company;
import java.awt.*;
public abstract class House  {
    private String name;
    private int doors;

    public House(String name, int doors) {
        this.name = name;
        this.doors = doors;
    }

    public String getName() {
        return name;
    }

    public int getDoors() {
        return doors;
    }
}
