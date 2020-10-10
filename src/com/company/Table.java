package com.company;

import java.util.Scanner;

class Table extends Furniture
{
    Scanner in=new Scanner(System.in);
    String type;
    Table()
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
