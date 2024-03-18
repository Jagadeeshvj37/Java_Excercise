package Interview_Questions;

import java.util.Scanner;

public class Odd_Or_Even {

	public static void main(String[] args) {
		System.out.println("Odd Or Even");
//		Getting input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int inputnum=sc.nextInt();
		Odd_Or_Even.resultnumber(inputnum);
	}
	public static void resultnumber(int dup)
	{
		if(dup%2==0)
		{
			System.out.println("Method Even Number");
		}
		else {
			System.out.println("Method Odd number");
		}
	}

}
