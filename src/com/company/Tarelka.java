package com.company;

public class Tarelka extends Dish
{

    Tarelka(String color, String material)
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
