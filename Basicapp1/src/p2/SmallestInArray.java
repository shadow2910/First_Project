package p2;
import java.util.Arrays;
import java.util.Scanner;
public class SmallestInArray {

	
	public int getSecondSmallest(int[] arr)
	{
		Arrays.sort(arr);
		return arr[1];
	}
	public static void main(String[] args) {
	
		SmallestInArray obj=new SmallestInArray();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int len=Integer.parseInt(sc.nextLine());
		int[] arr=new int[len];
		
		for(int i=0;i<len;i++)
		{
			int x=Integer.parseInt(sc.nextLine());
			arr[i]=x;
		}
		int key=obj.getSecondSmallest(arr);
		System.out.println("second Smallest element is "+key);
	}

}
