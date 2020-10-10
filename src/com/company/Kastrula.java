package com.company;

class Kastrula extends Dish
{
    Kastrula(String color, String material)
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
