package com.company;

public abstract class Dish {
    String color;
    String name;
    String material;

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
class tarelka extends Dish
{

    tarelka(String color, String material)
    {
        this.color=color;
        name="tarelka";
        this.material=material;
    }
    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public String getMaterial() {
        return this.material;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
class kastrula extends Dish
{
    kastrula(String color, String material)
    {
        this.color=color;
        name="kastrula";
        this.material=material;
    }
    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public String getMaterial() {
        return this.material;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
