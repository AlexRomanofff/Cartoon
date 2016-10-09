package model.plants;

import java.awt.*;

public class Bush extends Plant {

    public Bush(int height, Color color) {
        super(height, color);
    }

    @Override
    public void draw() {
        System.out.println("We draw bush");
    }
}
