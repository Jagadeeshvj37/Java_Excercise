package Interview_Questions;

import java.util.Scanner;

public class Prime_number {
		public static void main(String args[])
		{
			System.out.println("Enter the Number: ");
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			
			boolean check= false;
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					check=true;
				}
			}
			if(check)
			{
				System.out.println("Not a Prime number");
			}
			else
			{
				System.out.println("Prime number");
			}
		}
		
}
