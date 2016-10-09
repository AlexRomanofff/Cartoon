package model.animals;

import java.awt.*;

public class Dog extends Animal {

    public Dog(String name, int height, Color color) {
        super(name, height, color);
    }

    @Override
    public void draw() {
        System.out.println("We draw dog");
    }

    @Override
    public void move() {
        System.out.println("Dog moves by 4 limbs and changes coordinates");
    }
}
