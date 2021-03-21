package lab6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReversedArray {
	
	public int[] getSorted(int[] numbers) {
		int[] sorted=new int[numbers.length];
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<numbers.length;i++) {
			StringBuilder str= new StringBuilder(String.valueOf(numbers[i]));
			str.reverse();
			sorted[i]=Integer.parseInt(str.toString());
		}
		Arrays.sort(sorted);
		return sorted;
	}
	public static void main(String[] args) {
		int [] numbers=new int[] {12,15,20,5,24,89};
		ReversedArray obj=new ReversedArray();
		int[] sorted=obj.getSorted(numbers);
		for(int i=0;i<sorted.length;i++)
			System.out.println(sorted[i]);
	}
}
