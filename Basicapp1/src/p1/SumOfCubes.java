package p1;

import java.util.Scanner;

public class SumOfCubes {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		int sum=0;
		while(number>0)
		{
			int digit=number%10;
			number=number/10;
			sum+=(digit*digit*digit);
		}
		System.out.println("Sum of cube of digits:"+sum);
		

	}

}
