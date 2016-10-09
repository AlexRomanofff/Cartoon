package model.men;

import interfaces.Drawable;
import interfaces.Moveable;
import interfaces.Speakable;

import java.awt.*;

public abstract class Man implements Drawable, Moveable, Speakable {
    private String name;
    private int age;
    private int xCoord;
    private int yCoord;
    private int height;
    private Color dressColor;

    public Man(String name, int height, int age) {
        this.name=name;
        this.height=height;
        this.age=age;
    }

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

    public Color getDressColor() {
        return dressColor;
    }

    public void setDressColor(Color dressColor) {
        this.dressColor = dressColor;
    }

    @Override
    public void move() {
        System.out.println("Man moves by feet and changes coordinates");
    }
}
