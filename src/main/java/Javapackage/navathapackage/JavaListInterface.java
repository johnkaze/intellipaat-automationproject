package Javapackage.navathapackage;

import java.util.LinkedList;

public class JavaListInterface {

    public static void main(String[] args) {

        LinkedList<String> list1 = new LinkedList<>();

        LinkedList<String> list2 = new LinkedList<>();

        LinkedList<String> list3 = new LinkedList<>();

        list1.add("Java");
        list1.add(0, "Java 1.0");
        list1.add("Java1");
        list1.add("Java2");
        list1.add("Java3");
        list1.add("Java4");
        list1.add("Java4");
        list1.add("Java4");
        list1.add("Java4");
        list1.add(null);
        list1.add(null);
        //list1.addFirst("Java9");
        //list1.addLast("Java10");

        list2.add("Java5");
        list2.add("Java6");
        list2.add("Java7");
        list2.add("Java8");

        //System.out.println(list1.size());

       /* System.out.println(list1.getFirst());
        System.out.println(list1.getLast());

        list1.removeFirst();
        list1.removeLast();

        list1.removeFirstOccurrence("Java4");
        list1.removeLastOccurrence("Java4");*/

        //list1.addAll(list2);
        //list1.remove(0);
        //list1.remove(null);
        //list1.removeAll(list2);
        //list1.retainAll(list2);
        //list1.clear();

        //System.out.println(list1.size());
        //System.out.println(list1.contains("Java5"));
        //System.out.println(list1.containsAll(list2));

        //list3.addAll(list1);

        //System.out.println(list1.isEmpty());
        //System.out.println(list1.equals(list3));

        //System.out.println(list1.indexOf("Java5"));

        //System.out.println(list1.lastIndexOf("Java4"));

        //System.out.println(list1.get(11));

        /*for(int i=0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }*/

        /*Object[] arr = al1.toArray();

        for(int i=0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/

        for (String str : list1) {
            System.out.println(str);
        }

        //System.out.println(list1.size());

        //ListIterator<String> itr = list1.listIterator();

        //Iterator<String> itr = list1.iterator();

       /* while (itr.hasNext()) {
            System.out.println(itr.next());
            //itr.remove();
        }

        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }*/

        //System.out.println(list1.size());
    }


}
