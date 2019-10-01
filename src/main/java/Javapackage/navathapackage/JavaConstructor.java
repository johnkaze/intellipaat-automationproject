 package Javapackage.navathapackage;

 public class JavaConstructor {

 /*
        Constructor ::

         Types ::
         1. Default ::
         2. Parameterized ::


  */


     String name;
     int age;
     int rno;

     int i;

     JavaConstructor() {
         System.out.println("I am default constructor");
         ConditionalStmts conditionalStmts = new ConditionalStmts();
     }

     JavaConstructor(String name1, int age1, int rno1) {
         name = name1;
         age = age1;
         rno = rno1;
     }

     void m1() {

         int x = 1;
         i = x;
         System.out.println("I am m1()");
     }


     public static void main(String[] args) {

         JavaConstructor obj1 = new JavaConstructor();

         System.out.println(obj1.name);
         System.out.println(obj1.age);
         System.out.println(obj1.rno);

         obj1.m1();

         JavaConstructor obj2 = new JavaConstructor("Java", 30, 10);

         System.out.println(obj2.name);
         System.out.println(obj2.age);
         System.out.println(obj2.rno);

         JavaConstructor obj3 = new JavaConstructor("Java", 30, 10);

         System.out.println(obj3.name);
         System.out.println(obj3.age);
         System.out.println(obj3.rno);

     }


 }
