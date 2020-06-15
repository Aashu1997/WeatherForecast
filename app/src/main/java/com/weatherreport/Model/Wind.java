package com.weatherreport.Model;

public class Wind
{
    private double speed;
    private double deg;
  //  public double gust { get; set; }


    public Wind() {
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDeg() {
        return deg;
    }

    public void setDeg(double deg) {
        this.deg = deg;
    }
}
