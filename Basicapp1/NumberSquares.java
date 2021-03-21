package lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicIntegerArray;
public class NumberSquares {
	
	public Map<Integer, Integer> getSquares(int[] numbers){
		Map<Integer, Integer> squares=new HashMap<>();
		for(int i=0;i<numbers.length;i++) {
			squares.put(numbers[i], numbers[i]*numbers[i]);
		}
		return squares;
	}
	
	public static void main(String[] args) {
		
		NumberSquares obj=new NumberSquares();
		int[] numbers= new int[] {2,3,4,5,6};
		Map<Integer, Integer> squares=obj.getSquares(numbers);
		System.out.println(squares);
		
		}
}
