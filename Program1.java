package projectQ;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Entered the String");
		String str=sc.nextLine();
		System.out.println("you have entered"+ str);
		
		int i=Integer.parseInt(str);
		System.out.println("Integer"+str+" "+i);
		
		float f=Float.parseFloat(str);
		System.out.println("Float"+f);

	}

}
