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
class bed extends Furniture
{
    Scanner in = new Scanner(System.in);
    bed()
    {
        this.name="bed";
        System.out.println("material:");
        this.material=in.nextLine();
        System.out.println("height:");
        this.height=in.nextInt();
        System.out.println("length:");
        this.length=in.nextInt();
        System.out.println("wigth:");
        this.wigth=in.nextInt();
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
class table extends Furniture
{
    Scanner in=new Scanner(System.in);
    String type;
    table()
    {
        this.name="table";
        System.out.println("type:");
        this.type=in.nextLine();
        System.out.println("material:");
        this.material=in.nextLine();
        System.out.println("height:");
        this.height=in.nextInt();
        System.out.println("length:");
        this.length=in.nextInt();
        System.out.println("wigth:");
        this.wigth=in.nextInt();
    }

    @Override
    public String toString() {
        return "table{" +
                "material='" + material + '\'' +
                ", length=" + length +
                ", wigth=" + wigth +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
class Furnitureshop
{
    static Scanner in=new Scanner(System.in);
    static ArrayList<Furniture> arrayList = new ArrayList<Furniture>();
    static public void addbed(bed one)
    {
        arrayList.add(one);
    }
    public static void addtable(table one)
    {
        arrayList.add(one);
    }
}