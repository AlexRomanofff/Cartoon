package model.plants;

import interfaces.Drawable;
import java.awt.*;

public abstract class Plant implements Drawable {

    public Plant(int height, Color color) {
        this.height = height;
        this.color = color;
    }

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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
