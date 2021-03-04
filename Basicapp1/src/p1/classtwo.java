package p1;
import java.util.Scanner;
public class classtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter basic salary");
		int basic_salary=sc.nextInt();
		int hra=15*basic_salary/100;
		int da=60*basic_salary/100;
		int monthly_net_salary=basic_salary+da+hra;
		int annual_salary=12*monthly_net_salary;
		System.out.println("Basic Salary:"+basic_salary);
		System.out.println("Hra:"+hra);
		System.out.println("DA:"+da);
		System.out.println("Monthly Net Salary:"+monthly_net_salary);
		System.out.println("Annual Salary:"+annual_salary);
		int tax=0;
		if(annual_salary<300000)
		{
			tax=0;
			System.out.println("Tax 0%:"+tax);
			
		}
		else if(annual_salary<700000)
		{
			tax=10*annual_salary/100;
			System.out.println("Tax 10%:"+tax);
		}
		else if(annual_salary<1500000)
		{
			tax=15*annual_salary/100;
			System.out.println("Tax 15%:"+tax);
		}
		else
		{
			tax=30*annual_salary/100;
			System.out.println("Tax 30%:"+tax);
		}
		int net_salary_after_tax=annual_salary-tax;
		System.out.println("Net Salary After Tax"+net_salary_after_tax);
	
	}

}
