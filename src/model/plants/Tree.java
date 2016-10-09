package model.plants;

import java.awt.*;

public class Tree extends Plant {

    public Tree(int height, Color color) {
        super(height, color);
    }

    @Override
    public void draw() {
        System.out.println("We draw tree");
    }
}
