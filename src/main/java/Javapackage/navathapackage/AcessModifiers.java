package Javapackage.navathapackage;

public class AcessModifiers {
 /*
    Access Modifiers ::

    1. private :: within the class
    2. default :: Package Protected :: within the package
    3. protected :: outside the package through inheritance
    4. public :: every where

  */

    public String name = "Chandra Shekhar";
    public long ph = 9912127022L;
    public int rno = 30;
    public static String country = "India";

    public void m1() {

        System.out.println("Method m1()");
    }

    public void m2() {

        System.out.println("Method m2()");
    }

    public static void main(String[] args) {
        AcessModifiers obj = new AcessModifiers();

        System.out.println("Name :: " + obj.name + " ph num :: " + obj.ph + " Roll num :: " + obj.rno + " Country :: " + country);

        obj.m1();
        obj.m2();
    }

}
