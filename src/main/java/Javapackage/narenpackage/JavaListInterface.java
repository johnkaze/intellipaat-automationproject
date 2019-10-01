package Javapackage.narenpackage;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaListInterface {

    public static void main(String[] args) {

        ArrayList<String> al1 = new ArrayList<>();

        ArrayList<String> al2 = new ArrayList<>();

        al1.add("Java");
        al1.add(0, "Java 1.0");
        al1.add("Java1");
        al1.add("Java2");
        al1.add("Java3");
        al1.add("Java4");
        al1.add("Java4");
        al1.add("Java4");
        al1.add("Java4");
        al1.add(null);
        al1.add(null);
        //al1.addFirst("Java9");
        //al1.addLast("Java10");

        al2.add("Java5");
        al2.add("Java6");
        al2.add("Java7");
        al2.add("Java8");

        //System.out.println(al1.size()); // 6

        /*al1.getFirst();
        al1.getLast();

        al1.removeFirst();
        al1.removeLast();

        al1.removeFirstOccurrence("Java4");
        al1.removeLastOccurrence("Java4");*/

        al1.addAll(al2);
        //al1.remove(0);
        //al1.clear();


        //System.out.println(al1.contains("Java5"));
        //al1.removeAll(al2);
        //al1.retainAll(al2);
        //System.out.println(al1.containsAll(al2));

        //System.out.println(al1.isEmpty());
        //System.out.println(al1.equals(al2));

        //System.out.println(al1.indexOf("Java4"));

        //System.out.println(al1.lastIndexOf("Java4"));

        //System.out.println(al1.size());

        /*for(int i=0; i < al1.size(); i++) {
            System.out.println(al1.get(i));
        }*/

       /* Object[] arr = al1.toArray();

        for(int i=0; i < arr.length; i++) {
            System.out.println(al1.get(i));
        } */

      /* for (String str : al1) {
           System.out.println(str);
       }*/

        System.out.println(al1.size());

        //ListIterator<String> itr = al1.listIterator();

        Iterator<String> itr = al1.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
            itr.remove();
        }

        System.out.println(al1.size());

       /* while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        } */

    }


}
