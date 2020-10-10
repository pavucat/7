package com.company;

import java.util.Scanner;

class Bed extends Furniture
{
    Scanner in = new Scanner(System.in);
    Bed()
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
