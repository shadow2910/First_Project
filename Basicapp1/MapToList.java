package lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapToList {
	
	
	public List<Integer> getValues(Map<String,Integer> map){
		List<Integer> list=new ArrayList<>();
		Iterator<String> itr=map.keySet().iterator();
		while(itr.hasNext()) {
			list.add(map.get(itr.next()));
		}
		Collections.sort(list);
		return list;
	}

	public static void main(String[] args) {
		
		Map<String, Integer> map=new HashMap<>();
		map.put("A", 100);
		map.put("G", 40);
		map.put("C", 80);
		map.put("D", 70);
		map.put("E", 60);
		map.put("F", 50);
		map.put("B", 90);
		map.put("H", 30);
		System.out.println(map);
		List<Integer> list=new MapToList().getValues(map);
		System.out.println(list);
	}
}
