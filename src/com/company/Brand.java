package com.company;

public final class Brand extends Category {
    private String name;
    private int volume, release, mileage;

    public Brand(Color color, Fuel fuel, String type, int weight, String name, int volume, int release, int mileage) {
        super(color, fuel, type, weight);
        this.name = name;
        this.volume = volume;
        this.release = release;
        this.mileage = mileage;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public int getRelease() {
        return release;
    }

    public int getMileage() {
        return mileage;
    }

    public void drawAuto(char draw, String name, int volueme) {
        System.out.println("Категория:" + name + "\n" + "(" + draw + ")" + "\n" + volueme);
    }

    public void drawAuto(String name, char draw) {
        System.out.println("Категория:" + name + "(" + draw + ")");
    }

    final String getInfo2() {
        return getInfo1() + "|Марка:" + name + "|Объём:" + volume + "|Год выпуска:" + release + "год|Километраж:" + mileage + "км";
    }

    public Brand(Brand objectC){}
    public void copyBufer(Brand brand){
        this.mileage=brand.getMileage();
        this.release=brand.getRelease();
    }
}
