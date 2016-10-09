package model;

import interfaces.Drawable;
import java.util.List;

public class Picture {

    public void drawPicture(List<Drawable> elements) {
        for (Drawable element: elements) {
            element.draw();
        }
    }
}
