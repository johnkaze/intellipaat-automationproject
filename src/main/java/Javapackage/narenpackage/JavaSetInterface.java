package Javapackage.narenpackage;

import java.util.TreeSet;

public class JavaSetInterface {

    public static void main(String[] args) {
		
		/*HashSet<String> set1 = new HashSet<>();
		HashSet<String> set2 = new HashSet<>();*/
		
		/*LinkedHashSet<String> set1 = new LinkedHashSet<>();
		LinkedHashSet<String> set2 = new LinkedHashSet<>();*/

        TreeSet<String> set1 = new TreeSet<>();
        TreeSet<String> set2 = new TreeSet<>();

        set1.add("Java");
        set1.add("Python");
        set1.add("CSharp");
        set1.add("Interface");
        set1.add("Inheritance");
        //set1.add(null);
        //set1.add(null);
        set1.add("CSharp");
        set1.add("Interface");
        set1.add("Inheritance");
        set1.add("static");

        set2.addAll(set1);

        set2.add("super");
        set2.add("this");
        set2.add("static");

        System.out.println(set2.size());

        //set2.remove("this");

        //System.out.println(set2.size());

        //set2.removeAll(set1);

        //set2.clear();

        //set2.retainAll(set1);

        //set2.toArray();

        //set2.isEmpty();

        //set2.equals(set1);

        //System.out.println(set1.hashCode());
        //System.out.println(set2.hashCode());

		/*Iterator<String> itr = set2.iterator();
		
		while(itr.hasNext()) {
		    String data = itr.next();
			System.out.println(data);
		}*/

        for (String ele : set2) {
            String data = ele;
            System.out.println(data);
        }




    }

}
