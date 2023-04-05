package sec3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashMapEx1 {
	public static void main(String[] args) {
		System.out.println("HashMap");
		HashMap<String, String> map1 = new HashMap<>();
		map1.put("guest", "이재현");
		map1.put("member", "이주연");
		map1.put("administrator", "지창민");
		for(Map.Entry<String, String> entry : map1.entrySet()){
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		System.out.println("\nLinkedHashMap");
		LinkedHashMap<String, String> map2 = new LinkedHashMap<>();
		map2.put("guest", "이재현");
		map2.put("member", "이주연");
		map2.put("administrator", "지창민");
		for(Map.Entry<String, String> entry : map2.entrySet()){
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		map2.put("nomember", "김선우");
		map2.remove("guest");
		boolean b1 = map2.containsValue("이재현");
		boolean b2 = map2.containsKey("member");
		System.out.println("이재현이 존재하는가? "+b1);
		System.out.println("member가 있는가? "+b2);
	}
}
