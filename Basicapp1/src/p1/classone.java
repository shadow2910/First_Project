package p1;
import java.util.Scanner;
public class classone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your choice as r for Red, g for Green and y for yellow");
		
		Scanner sc=new Scanner(System.in);
		char input_user=sc.next().charAt(0);
		if(input_user=='r')
		{
			System.out.println("stop ");
		}
		else if(input_user=='y')
		{
			System.out.println("ready ");
		}
		else
		{
			System.out.println("go ");
		}
	}

}
