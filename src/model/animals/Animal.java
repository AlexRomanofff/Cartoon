package model.animals;

import interfaces.Drawable;
import interfaces.Moveable;

import java.awt.*;

public abstract class Animal implements Drawable, Moveable{

    public Animal(String name, int height, Color color) {
        this.name = name;
        this.height = height;
        this.color = color;
    }

    private String name;
    private int height;
    private Color color;
    private int xCoord;
    private int yCoord;

    public int getxCoord() {
        return xCoord;
    }

    public void setxCoord(int xCoord) {
        this.xCoord = xCoord;
    }

    public int getyCoord() {
        return yCoord;
    }

    public void setyCoord(int yCoord) {
        this.yCoord = yCoord;
    }
}
