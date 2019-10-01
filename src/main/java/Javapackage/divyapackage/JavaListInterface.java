package Javapackage.divyapackage;

import java.util.*;

public class JavaListInterface {

    public static void main(String[] args) {

        /*List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();*/

        LinkedList<String> list1 = new LinkedList<>();
        LinkedList<String> list2 = new LinkedList<>();

        list1.add("Java2");
        list1.add("Java4");
        list1.add("Java");
        list1.add("Java3");
        list1.add(0, "Java 1.0");
        list1.add("Java1");
        list1.add("Java4");
        list1.add("Java4");
        list1.add("Java5");
        //list1.add(null);
        //list1.add(null);

        /*list1.addFirst("Java9");
        list1.addLast("Java10");*/

        System.out.println("Number of elements in list1 :: " + list1.size());

        list2.add("Java5");
        list2.add("Java6");
        list2.add("Java7");
        list2.add("Java8");


        //System.out.println("Number of elements in list2 :: " + list2.size());

        //System.out.println(list1.get(0));

        /*System.out.println(list1.getFirst());
        System.out.println(list1.getLast());

        list1.removeFirst();
        list1.removeLast();

        list1.removeFirstOccurrence("Java4");
        list1.removeLastOccurrence("Java4");*/

        list2.addAll(list1);
        //list2.addAll(list1);
        //System.out.println(list2.size());
        //list2.remove("Java3");
        //list2.clear();
        System.out.println("Number of elements in list2 :: " + list2.size());
        //System.out.println(list2.contains("Java5"));
        //System.out.println(list2.containsAll(list1));

        //list2.removeAll(list1);
        //list2.retainAll(list1);

        //System.out.println(list2.isEmpty());
        //System.out.println(list1.equals(list2));

        //System.out.println(list1.indexOf("Java4"));

        //System.out.println(list1.lastIndexOf("Java4"));

        //System.out.println(list2.size());

       /* for (int i = 0; i <= list2.size()-1; i++) {
            System.out.println(list2.get(i));
        }*/

       /* Object[] arr = list2.toArray();

        for(int i=0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/

        //System.out.println(list1.size());

        // ListIterator<String> itr = list1.listIterator();

        Iterator<String> itr = list1.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
            //itr.remove();
        }

        System.out.println(list1.size());

        /*while(itr.hasPrevious()) {
            System.out.println(itr.previous());
        }*/

        for (String str : list1) {
            System.out.println(str);
        }

        System.out.println();

        Collections.sort(list1);
        Collections.reverse(list1);


        for (String str : list1) {
            System.out.println(str);
        }


    }


}
