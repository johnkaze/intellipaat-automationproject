package Javapackage.narenpackage;

public class AcessModifiers {
 /*
    Access Modifiers ::

    1. private :: within the class
    2. default :: Package Protected :: within the package
    3. protected ::outside the package through inheritance
    4. public :: every where

  */

    private String name = "Chandra Shekhar";
    private long ph = 9912127022L;
    private int rno = 30;
    private static String country = "India";

    private void m1() {
        System.out.println("Method m1()");
    }

    private void m2() {
        System.out.println("Method m2()");
    }

    public static void main(String[] args) {
        AcessModifiers obj = new AcessModifiers();

        System.out.println("Name :: "+obj.name+" ph num :: "+obj.ph+" Roll num :: "+obj.rno+" Country :: "+country);

        obj.m1();
        obj.m2();
    }

}
