package com.company;

import static java.lang.Math.PI;

public class Celindr {
    private int radius;
    private int visota;

    public Celindr(int radius, int visota) {
        this.radius = radius;
        this.visota = visota;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getVisota() {
        return visota;
    }

    public void setVisota(int visota) {
        this.visota = visota;
    }

    void area() {
        System.out.println(2 * PI * radius * (visota + radius));
    }
    void volume() {
        System.out.println(PI * radius * radius * visota);
    }
}
