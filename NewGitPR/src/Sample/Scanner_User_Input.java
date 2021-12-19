package Sample;

import java.util.Scanner;

public class Scanner_User_Input {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		//if i want number from user
//		System.out.println("Enter Num1");
//		int num1 = sc.nextInt();
//		System.out.println("Enter Num2");
//		int num2 = sc.nextInt();
//		int sum=num1+num2;
//		System.out.println("Addition is "+sum);
		//if i want String from user
		
				System.out.println("Enter your name");
				String name = sc.next();
				System.out.println("Enter your Lastname");
				String LastName = sc.next();
				
				System.out.println("Your name is " +name+ " Your lastname is " +LastName);

	}

}
