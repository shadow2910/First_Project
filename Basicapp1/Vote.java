package lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Vote {
	
	final static int currentYear=2021;
	public List<String> votersList(Map<String, String> people){
		List<String> voters=new ArrayList<>();
		Iterator<String> itr=people.keySet().iterator();
		while(itr.hasNext()) {
			String id=itr.next();
			String[] birthDate=people.get(id).split("-");
			int birthYear=Integer.parseInt(birthDate[2]);
			int age=currentYear-birthYear;
			if(age>18) {
				voters.add(id);
			}
		}
		return voters;
	}
	
	
	public static void main(String[] args) {
		Map<String, String> people=new HashMap<>();
		people.put("AB001", "28-5-1998");
		people.put("AB002", "2-4-1992");
		people.put("AB003", "12-11-1975");
		people.put("AB004", "8-12-2010");
		people.put("AB005", "20-1-2002");
		people.put("AB006", "15-6-1991");
		Vote obj=new Vote();
		List<String> voters=obj.votersList(people);
		System.out.println(voters);
	}
}
