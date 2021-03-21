package lab6;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
public class CountCharacters {
	
	public Map<Character, Integer> countChars(char[] arr){
		Map<Character, Integer> map=new HashMap<>();
		for (int i=0;i<arr.length;i++) {
			Integer count=map.get(arr[i]);
			if(count==null) {
				map.put(arr[i], 1);
			}
			else {
				map.put(arr[i], count+1);
			}
		}
		return map;
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String str=sc.nextLine();
		char[] charArray=str.toCharArray();
		Map<Character, Integer> map=new CountCharacters().countChars(charArray);
		Iterator<Character> itr=map.keySet().iterator();
		while(itr.hasNext())
		{
			Character ch=itr.next();
			System.out.println(ch+":"+map.get(ch));
		}
		
	}
}
