package com.company;

public class Category extends Cars {
    private String type;
    private int weight;

    public Category() {

    }

    public Category(Color color, Fuel fuel, String type, int weight) {
        super(color, fuel);
        this.type = type;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    public void drawAuto(String name, char draw) {
        System.out.println("Категория:" + name + "(" + draw + ")");
    }

    public void drawAuto(char draw, String name) {
        System.out.println("Категория:" + name + "(" + draw + ")");
    }

    final public void drawAuto(char draw) {
        System.out.println("Категория:" + "(" + draw + ")");
    }

    final String getInfo1() {
        return getInfo() + "|Тип кузова:" + type + "|Вес авто:" + weight;
    }
}

