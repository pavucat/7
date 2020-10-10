package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Furniture {
    String material;
    int length;
    int wigth;
    int height;
    String name;

    @Override
    public String toString() {
        return "Furniture{" +
                "material='" + material + '\'' +
                ", length=" + length +
                ", wigth=" + wigth +
                ", height=" + height +
                ", name='" + name + '\'' +
                '}';
    }
}