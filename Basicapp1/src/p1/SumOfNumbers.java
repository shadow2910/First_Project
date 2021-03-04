package p1;
import java.util.Scanner;
public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		int sum=number*(2+(number-1))/2;
		System.out.println(sum);
		int sum2=0;
		for(int i=0;i<number+1;i++)
		{
			sum2+=i;
		}
		System.out.println(sum2);
	}

}
