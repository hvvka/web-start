package com.hania.model;

/**
 * Wall paint efficiency.
 * Defines how many liters of paint is required to paint 1 square meter of wall.
 * There's also volume for can of paint and its price.
 *
 * @author <a href="mailto:226154@student.pwr.edu.pl">Hanna Grodzicka</a>
 */
public class Efficiency {

    private float litersPerSquareMeter;

    private float volume;

    private float price;


    public Efficiency(float litersPerSquareMeter, float volume, float price) {
        this.litersPerSquareMeter = litersPerSquareMeter;
        this.volume = volume;
        this.price = price;
    }

    public float getLitersPerSquareMeter() {
        return litersPerSquareMeter;
    }

    public float getVolume() {
        return volume;
    }

    public float getPrice() {
        return price;
    }
}
