package model.animals;

import java.awt.*;

public class Monkey extends Animal {

    public Monkey(String name, int height, Color color) {
        super(name, height, color);
    }

    @Override
    public void draw() {
        System.out.println("We draw Monkey");
    }

    @Override
    public void move() {
        System.out.println("Monkey climbs on trees and changes coordinates");
    }
}
