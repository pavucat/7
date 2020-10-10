package com.company;

public class Main {

    public static void main(String[] args) {
	/*Kastrula a=new Kastrula("black", "iron");
	System.out.println(a.toString());*/
        /*Ovsharka one = new Ovsharka();
        System.out.println(one.toHuman());
        System.out.println(one.toString());*/
        Table one = new Table();
        FurnitureShop.addTable(one);
        Bed two = new Bed();
        FurnitureShop.addBed(two);
        System.out.println(FurnitureShop.arrayList.get(1).toString());
    }
}
