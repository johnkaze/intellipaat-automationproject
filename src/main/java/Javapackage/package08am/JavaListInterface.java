package Javapackage.package08am;

import java.util.ArrayList;
import java.util.List;

public class JavaListInterface {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

       /*LinkedList<String> list1 = new LinkedList<>();
        LinkedList<String> list2 = new LinkedList<>();*/

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

        //System.out.println(list1.get(0));
        //System.out.println(list1.get(5));
        //System.out.println(list1.get(10));
        //System.out.println(list1.get(15));  // IndexOutOfBoundsException

        /*list1.getFirst();
        list1.getLast();

        list1.removeFirst();
        list1.removeLast();

        list1.removeFirstOccurrence("Java4");
        list1.removeLastOccurrence("Java4");*/
        //list2.addAll(1, list1);
        list2.addAll(list1);
        //list2.remove(5);
        //list2.removeAll(list1);
        //list2.retainAll(list1);
        //list2.clear();

        System.out.println("Number of elements :: " + list2.size());

        //System.out.println(list2.contains("Java5"));
        //System.out.println(list2.containsAll(list1));

        //System.out.println(list2.isEmpty());
        //System.out.println(list1.equals(list2));

        //System.out.println(list2.indexOf("Java4"));
        //System.out.println(list2.lastIndexOf("Java4"));


       /* for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }*/

        Object[] arr = list2.toArray();

        for(int i=0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

       /* for(String data : list2) {
            System.out.println(data);
        }*/

        //ListIterator<String> itr = list1.listIterator();

        /*Iterator<String> itr = list1.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
            itr.remove();
        }*/

        //System.out.println(list1.size());

       /* while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        } */

    }


}
