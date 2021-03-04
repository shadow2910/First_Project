package p1;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		int a=0;
		int b=1;
		for(int i=0;i<number-2;i++)
		{
			int temporary_variable=b;
			b=b+a;
			a=temporary_variable;
		}
		System.out.println(number+"th Fibonacci number is:"+b);
		
	}

}
