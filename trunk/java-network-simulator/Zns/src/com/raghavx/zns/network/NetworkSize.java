/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raghavx.zns.network;

/**
 *
 * @author Raghvendra
 */
public class NetworkSize {

    private double width;
    private double altitude;
    private double length;

    public NetworkSize() {
        this.width = 1;
        this.length = 1;
        this.altitude = 0;

    }

    public NetworkSize(double width, double altitude, double length) {
        this.width = width;
        this.altitude = altitude;
        this.length = length;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    @Override
    public String toString(){
        return "(width-length-altitude)"+getWidth()+"-"+getLength()+"-"+getAltitude();
    }
}
