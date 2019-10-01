package Javapackage.bazlupackage;

import java.util.HashSet;
import java.util.Set;

public class JavaSetInterface {

    public static void main(String[] args) {
		
		Set<String> set1 = new HashSet<>();
		Set<String> set2 = new HashSet<>();

        /*Set<String> set1 = new LinkedHashSet<>();
        Set<String> set2 = new LinkedHashSet<>();*/

/*       Set<String> set1 = new TreeSet<>();
        Set<String> set2 = new TreeSet<>();*/

        set1.add("Java");
        set1.add("Python");
        set1.add("CSharp");
        set1.add("Interface");
        set1.add("Inheritance");
        /*set1.add(null);
        set1.add(null);*/
        set1.add("CSharp");
        set1.add("Interface");
        set1.add("Inheritance");
        set1.add("static");

        set2.addAll(set1);

        set2.add("super");
        set2.add("this");
        set2.add("static");

       System.out.println(set2.size());

        /*set2.remove("this");

        System.out.println(set2.size());

        set2.removeAll(set1);
        set2.retainAll(set1);

        set2.clear();

        Object[] arr = set2.toArray();

        for(int i=0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        set2.isEmpty();

        set2.equals(set1);

		Iterator<String> itr = set2.iterator();
		
		while(itr.hasNext()) {
		    String data = itr.next();
			System.out.println(data);
		}*/

        for (String ele : set2) {
            System.out.println(ele);
        }

    }

}
