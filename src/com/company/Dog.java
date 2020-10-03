package com.company;

import java.util.Scanner;

public abstract class Dog {
    String name;
    int age;
    String poroda;
    public int tohuman() {
        return this.age * 7;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", poroda='" + poroda + '\'' +
                '}';
    }
}
class ovsharka extends Dog
{
    Scanner in=new Scanner(System.in);
    ovsharka()
    {
        System.out.println("name:");
        this.name=in.nextLine();
        System.out.println("age:");
        this.age=in.nextInt();
        this.poroda="ovcharka";
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int tohuman() {
        return super.tohuman();
    }
}
class taksa extends Dog
{
    Scanner in=new Scanner(System.in);
    taksa(String name, int age)
    {
        System.out.println("name:");
        this.name=in.nextLine();
        System.out.println("age:");
        this.age=in.nextInt();
        this.poroda="taksa";
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int tohuman() {
        return super.tohuman();
    }
}
