package com.company;

public class Cars {
    private Color color;
    private Fuel fuel;
    //Fuel fuel = new Fuel();

    public Cars(Color color, Fuel fuel) {
        this.color = color;
        this.fuel = fuel;
    }

    public Cars() {
    }

    public Color getColor() {
        return color;
    }


    public Fuel getFuel() {
        return fuel;
    }

    final String getInfo() {
        return "Цвет:" + color + "|Топливо:" + fuel.getFuelName() + "|Расход:" + fuel.getFuelConsumption();
    }

}
