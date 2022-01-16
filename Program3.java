package projectQ;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		 
		char operator;
		double number1;
		double number2;
		double result;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Operator :+ ,- ,* ,or / ");
		operator =sc.next().charAt(0);
		
		System.out.println("Enter the First Number");
		number1=sc.nextDouble();
		
		System.out.println("Enter the Second Number");
		number2 =sc.nextDouble();
		
		switch (operator)
		{
		case'+':
			result=number1+number2;
			System.out.println(number1+ "+" +number2 + "=" +result);
			break;
			
		case'-':
			result=number1-number2;
			System.out.println(number1+ "-" +number2 + "=" +result);
			break;
			
		case'*':
			result=number1*number2;
			System.out.println(number1+ "*" +number2 + "=" +result);
			break;
			
		case'/':
			result=number1/number2;
			System.out.println(number1+ "/" +number2 + "=" +result);
			break;
			
		default:
			result=number1+number2;
			System.out.println("Invalid Operator");
			break;
			
		}

		sc.close();
	}

}
