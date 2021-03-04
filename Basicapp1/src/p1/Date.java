package p1;
import java.util.Scanner;
public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a date");
		int date=sc.nextInt();
		if(date<1 || date>31)
		{
			System.out.println("Date is wrong");
		}
		else
		{
			switch(date%10)
			{
			case 1:
				if(((date/10)%10)==1)
				{
					System.out.println(date+"th");
				}
				else
				{
					System.out.println(date+"st");
				}break;
			case 2:
				if(((date/10)%10)==1)
				{
					System.out.println(date+"th");
				}
				else
				{
					System.out.println(date+"nd");
				}break;
			case 3:
				if(((date/10)%10)==1)
				{
					System.out.println(date+"th");
				}
				else
				{
					System.out.println(date+"rd");
				}break;
			default:
				System.out.println(date+"th");
				break;
			}
	}
	}
}
