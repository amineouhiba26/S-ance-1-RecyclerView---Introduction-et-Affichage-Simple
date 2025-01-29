package com.example.myapplication;

public class SensorData {

    private String name ;
    private double value ;
    private String unit ;
    private int imageResId ;

    public SensorData(String name, double value, String unit, int imageResId) {
        this.name = name;
        this.value = value;
        this.unit = unit;
        this.imageResId = imageResId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getImageResId() {
        return imageResId;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }
}
