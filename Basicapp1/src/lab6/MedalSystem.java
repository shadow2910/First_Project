package lab6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MedalSystem {
	
	public Map<Integer, String>	getStudents(Map<Integer, Integer> studentInfo){
		Map<Integer, String> studentMedal=new HashMap<>();
		Iterator<Integer> itr=studentInfo.keySet().iterator();
		while(itr.hasNext()) {
			int rollNo=itr.next();
			int marks=studentInfo.get(rollNo);
			if(marks >=70 && marks<80)
				studentMedal.put(rollNo, "Bronze");
			else if(marks >=80 && marks<90)
				studentMedal.put(rollNo, "Silver");
			else if(marks >=90)
				studentMedal.put(rollNo, "Gold");
		}
		return studentMedal;
	}

	public static void main(String[] args) {
		Map<Integer, Integer> studentInfo=new HashMap<>();
		studentInfo.put(001, 94);
		studentInfo.put(002, 84);
		studentInfo.put(003, 70);
		studentInfo.put(004, 52);
		studentInfo.put(005, 90);
		MedalSystem obj=new MedalSystem();
		Map<Integer, String> studentMedals=obj.getStudents(studentInfo);
		System.out.println(studentMedals);
		}
}
