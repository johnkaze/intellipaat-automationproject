package Javapackage.narenpackage;

import java.util.Map.Entry;
import java.util.TreeMap;

public class JavaMapInterface {
	
	public static void main(String[] args) {
		
		/*HashMap<String, String> map1 = new HashMap<>();
		HashMap<String, String> map2 = new HashMap<>();*/
		
		/*LinkedHashMap<String, String> map1 = new LinkedHashMap<>();
		LinkedHashMap<String, String> map2 = new LinkedHashMap<>();*/
		
		TreeMap<String, String> map1 = new TreeMap<>();
		TreeMap<String, String> map2 = new TreeMap<>();
		
		map1.put("4","C#");
		map1.put("2","Python");
		map1.put("1",null);
		map1.put("3","Extends");
		map1.put("5","Interface");
		map1.put("3","Extends1");
		map1.put("5","Interface1");
		//map1.put(null,"Extends2");
		//map1.put(null,"Interface2");
		
		map2.putAll(map1);
		
		map2.put("6","Extends");
		map2.put("7","Interface");
		
		//map2.remove(null);
		//map2.remove("1");
		//map2.clear();
		System.out.println(map2.size());
		
		//System.out.println(map2.containsKey("1"));
		//System.out.println(map2.containsValue("Interface"));
		//System.out.println(map2.isEmpty());

		/*Set<String> set1 = map2.keySet();

		for(String key : set1) {
			System.out.println(key);
		}*/

		/*for(String key : map2.keySet()) {
			System.out.println(key+" == "+map2.get(key));
		}*/
		
		//Set< Entry<String, String> > set = map2.entrySet();
		
		for(Entry<String, String> entry : map2.entrySet()) {
			System.out.println(entry.getKey()+" == "+entry.getValue());
		}
		
		
		
	}

}
