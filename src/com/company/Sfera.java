package com.company;

public class Sfera {
    private int radius;

    public Sfera(int radius) {
        this.radius = radius;
    }

    public Sfera() {
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    void sfera() {
        double sfera = 4*Math.PI*Math.pow(radius,2);
        System.out.println(sfera);
    }

    void volume() {
        double volume = 4/3*Math.PI*Math.pow(radius,3);
        System.out.println(volume);
    }
}
