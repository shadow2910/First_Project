package lab6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondSmallest {
	
	public int getSecondSmallest(int[] numbers) {
		List<Integer> listNumbers=new ArrayList<>();
		for(int i=0;i<numbers.length;i++) {
			listNumbers.add(numbers[i]);
		}
		Collections.sort(listNumbers);
		int secondSmallest=listNumbers.get(1);
		return secondSmallest;
	}
	
	
	
	public static void main(String[] args) {
		int[] numbers=new int[] {2,25,36,12,79,43,52,10};
		SecondSmallest obj=new SecondSmallest();
		int secondsmallest=obj.getSecondSmallest(numbers);
		System.out.println(secondsmallest);
	}
}
