package com.raghavx.zns.mobility;

/**
 *
 * @author Raghvendra
 */
public class Coordinates {

    private int x;
    private int y;
    private int z;
    private int[] speed = new int[3];

    public Coordinates(int x, int y, int z, int[] speed) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.speed = speed;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}