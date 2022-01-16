package projectQ;

import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter no of words");
		n=sc.nextInt();
		sc.skip(System.lineSeparator());
		
		String[] str=new String[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("words"+(i+1));
			str[i]=sc.nextLine();
			
		}
		sc.close();
		System.out.println("Entered Words");
		for(int i= 0;i<n;i++)
		{
			System.out.println(str[i]);
			
		}

	}

}
