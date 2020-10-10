package com.company;

import java.util.ArrayList;
import java.util.Scanner;

class FurnitureShop
{
    static Scanner in=new Scanner(System.in);
    static ArrayList<Furniture> arrayList = new ArrayList<Furniture>();
    static public void addBed(Bed one)
    {
        arrayList.add(one);
    }
    public static void addTable(Table one)
    {
        arrayList.add(one);
    }
}