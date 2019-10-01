package Javapackage.divyapackage;

import java.util.*;
import java.util.Map.Entry;

public class JavaMapInterface {

    public static void main(String[] args) {


        /*Map<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();*/
		
		/*Map<String, String> map1 = new LinkedHashMap<>();
		Map<String, String> map2 = new LinkedHashMap<>();*/

        TreeMap<String, String> map1 = new TreeMap<>();
        TreeMap<String, String> map2 = new TreeMap<>();

        map1.put("Extends1", "C#");
        map1.put("2", "Python");
        map1.put("Python", null);
        map1.put("C#", "Extends");
        map1.put("Interface2", "Interface");
        map1.put("C#", "Extends1");
        map1.put("Interface2", "Interface1");
        /*map1.put(null, "Extends2");
        map1.put(null, "Interface2");*/

        map2.putAll(map1);

        //map2.put("6", "Extends44");
        //map2.put("7", "Interface33");
       // map2.put("8", "Extends33");
       // map2.put("9", "Interface");
        map2.put("1", null);

        System.out.println(map2.firstEntry());
        System.out.println(map2.ceilingEntry("3"));

        //System.out.println("Number of data is :: " + map2.size());

        /*System.out.println(map2.get(null));
        System.out.println(map2.get("Interface"));//
        System.out.println(map2.get("Python"));
        System.out.println(map2.get("6"));
        System.out.println(map2.get("Interface2"));*/

        /*map2.remove(null);
        map2.remove("1");*/

        //map2.clear();
        //System.out.println("After clear number of data is :: " + map2.size());

        //System.out.println(map2.containsKey("10"));
        //System.out.println(map2.containsValue("Interface555555"));

        //System.out.println(map2.isEmpty());

       /* Set<String> set1 = map2.keySet();

		for(String key : set1) {
            System.out.println(key+ "  ==  " + map2.get(key));
		}*/

		/*for(String key : map2.keySet()) {
			System.out.println(key+" == "+map2.get(key));
		}*/

         Set<Entry<String, String>> set = map2.entrySet();

        for (Entry<String, String> entry : map2.entrySet()) {
            System.out.println(entry.getKey() + " == " + entry.getValue());
        }




    }

}
