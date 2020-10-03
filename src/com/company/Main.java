package com.company;

public class Main {

    public static void main(String[] args) {
	/*kastrula a=new kastrula("black", "iron");
	System.out.println(a.toString());*/
        /*ovsharka one = new ovsharka();
        System.out.println(one.tohuman());
        System.out.println(one.toString());*/
        table one = new table();
        Furnitureshop.addtable(one);
        bed two = new bed();
        Furnitureshop.addbed(two);
        System.out.println(Furnitureshop.arrayList.get(1).toString());
    }
}
