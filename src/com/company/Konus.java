package com.company;

import static java.lang.Math.PI;

public class Konus {
    private int radiusOsnovanie;
    private int visota;

    public Konus(int radiusOsnovanie, int visota) {
        this.radiusOsnovanie = radiusOsnovanie;
        this.visota = visota;
    }

    public int getRadiusOsnovanie() {
        return radiusOsnovanie;
    }

    public void setRadiusOsnovanie(int radiusOsnovanie) {
        this.radiusOsnovanie = radiusOsnovanie;
    }

    public int getVisota() {
        return visota;
    }

    public void setVisota(int visota) {
        this.visota = visota;
    }
    void Area() {
        System.out.println(PI * Math.pow(radiusOsnovanie, 2));
    }

    void Volume() {
        System.out.println((visota / 3) * PI * Math.pow(radiusOsnovanie, 2));
    }
}
