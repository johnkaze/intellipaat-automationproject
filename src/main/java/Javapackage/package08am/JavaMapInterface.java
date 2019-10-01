package Javapackage.package08am;

import java.util.*;
import java.util.Map.Entry;

public class JavaMapInterface {

    public static void main(String[] args) {


		/*Map<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();*/
		
		/*Map<String, String> map1 = new LinkedHashMap<>();
		Map<String, String> map2 = new LinkedHashMap<>();*/

        Map<String, String> map1 = new TreeMap<>();
        Map<String, String> map2 = new TreeMap<>();


        map1.put("Extends1", "C#");
        map1.put("2", "Python");
        map1.put("Python", null);
        map1.put("C#", "Extends");
        map1.put("Interface2", "Interface");
        map1.put("C#", "Extends1");
        map1.put("Interface2", "Interface1");
        map1.put(null, "Extends2");
        //map1.put(null, "Interface2");

        map2.putAll(map1);

        map2.put("6", "Extends");
        map2.put("7", "Interface");
        map2.put("8", "Extends");
        map2.put("9", "Interface");
        map2.put("10", null);

        System.out.println("Number of data is :: " + map2.size());

       /* System.out.println(map2.get(null));
        System.out.println(map2.get("6"));
        System.out.println(map2.get("C#"));

        map2.remove(null);
        map2.remove("C#");
        map2.remove("6");

       System.out.println(map2.get(null));
        System.out.println(map2.get("6"));
        System.out.println(map2.get("C#"));*/

        //map2.clear();
        //System.out.println("Number of data is :: " + map2.size());

       /* System.out.println(map2.containsKey("2"));
        System.out.println(map2.containsValue("Interface"));
        map2.clear();
        System.out.println(map2.isEmpty());*/

        //Set<String> set1 = map2.keySet();

		/*for(String key : set1) {
			System.out.println(key + "  ==  " + map2.get(key));  // key == value
		}*/

		/*for(String key : map2.keySet()) {
			System.out.println(key+" == "+map2.get(key));
		}*/

        Set<Entry<String, String>> set = map2.entrySet();

        for (Entry<String, String> entry : set) {
            System.out.println(entry.getKey() + " == " + entry.getValue());
        }


    }

}
