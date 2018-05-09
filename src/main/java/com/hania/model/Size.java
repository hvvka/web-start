package com.hania.model;

/**
 * Two-dimensional size of any object. In centimeters.
 * E.g. wall, room, a tile.
 *
 * @author <a href="mailto:226154@student.pwr.edu.pl">Hanna Grodzicka</a>
 */
public class Size {

    private float width;

    private float length;

    public Size(float width, float length) {
        this.width = width;
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public float getLength() {
        return length;
    }
}
