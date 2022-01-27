package projectQ;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

class Employee2 
{
	int userid;
	String username;
	long contactno;
	String emailid;
	
	
	public Employee2(int userid, String username, long mobileno, String emailid) {
		super();
		this.userid = userid;
		this.username = username;
		this.contactno = mobileno;
		this.emailid = emailid;
	}
	
	public String toString()
	{
		return"User Details" +"\nID:"+this.userid +"\nName" +this.username + "\nContactno" +this.contactno+ "\nEmailID" +this.emailid;
	}
		
}


public class UserManagementSystem 
{
	 

	static void Display(ArrayList<Employee2>al)	
	{
		System.out.println("\n==========================User List=============================");
		System.out.println(String.format("%-10s%-15s%-10s%-20s","userid","username","contactno","emailid"));
	     for(Employee2 e:al)
		{
			System.out.println(String.format("%-5s%-20s%-10s%-15s",e.userid, e.username,e.contactno,e.emailid));
		}
	}
	
	public static void main(String[] args)
	{
		
		int userid;
		String username;
		long contactno;
		String emailid;
		
		Scanner sc=new Scanner(System.in);
		ArrayList<Employee2> al=new ArrayList<Employee2>();
		
		File f=null;
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try
		{
	
		
		f=new File("C:\\Users\\91976\\eclipse-workspace\\java\\src\\projectQ\\UserManagementSystem.txt");
		if(f.exists())
		{
			fis=new FileInputStream(f);
			ois=new ObjectInputStream(fis);
		
			al=(ArrayList<Employee2>)ois.readObject();
		}
		}
		catch(Exception ex)
		{
		System.out.println(ex);	
		}
		do
		{
		System.out.println("\n *******==============Welcome To User Management System=================*******\n");
		System.out.println("1) Add user to the Database\n"+
							"2.) Search User For Database\n" +
							"3.)Edit User for Database\n" +
							"4.)Delete User For Database\n" +
							"5.)Display All Record\n" +
							"6.)Exit\n");
		
		System.out.println("Enter Your Choice");
		int ch =sc.nextInt();
		
		switch(ch)
		{
		
		case 1:System.out.println("Enter The User Details To The Add List");
		System.out.println("Enter the UserID: ");
		userid=sc.nextInt();
		System.out.println("Enter the UserName: ");
		username=sc.next();
		System.out.println("Enter the User Contactno: ");
		contactno=sc.nextLong();
		System.out.println("Enter the User EmailID: ");
		emailid=sc.next();
		al.add(new Employee2(userid,username,contactno,emailid));
		Display(al);
		break;
		
		case 2:System.out.println("Enter the UserID And Search The user Details");
		userid=sc.nextInt();
		int i=0;
		for(Employee2 e:al)
		{
			if(userid==e.userid)
			{
				System.out.println("e+\n");
				i++;
			}
		}
		if(i==0) 
		{
			System.out.println("User Details Not Found");
		}
		break;
		
		case 3:System.out.println("Enter the User ID And Edit The User Details");
		userid=sc.nextInt();
		
		int j=0;
		for(Employee2 e:al)
		{
			if(userid==e.userid)
			{
				j++;
				do
				{
					int ch1=0;
				System.out.println("\n Edit User Details:\n" +
										"1.)User ID\n" +
										"2.)User Name\n" +
										"3.)Contact NO\n" +
										"4.)EmailID\n" +
										"5.)Exit\n");
										
					System.out.println("Enter your Choice");
					ch1=sc.nextInt();
					switch(ch1)
					{
					case 1:System.out.println("Enter Your New UserID");
					e.userid=sc.nextInt();
					System.out.println(e +"\n");
					break;
					
					case 2: System.out.println("Enter Your New UserName");
					e.username=sc.next();
					System.out.println(e +"\n");
					break;
					
					case 3: System.out.println("Enter Your New Contact NO.");
					e.contactno=sc.nextInt();
					System.out.println(e +"\n");
					break;
					
					case 4: System.out.println("Enter Your New EmailID");
					e.emailid=sc.next();
					System.out.println(e +"\n");
					break;
					
					case 5:j++;
					break;
					
					 default:System.out.println("Enter correct Choice For The List");
					 break;
					 
					
					}					
				}
				while(j==1);
			}
		}
		if(j==0)
		{
			System.out.println("Employee Details Are not Found");
		}
		break;
		
		
		case 4:System.out.println("Enter User ID And Delete THe Record ");
		userid=sc.nextInt();
		int k=0;
		try {
			for(Employee2 e:al)
			{
				if(userid==e.userid)
				{
					al.remove(e);
					Display(al);
					k++;
				}
			}
			if(k==0)
			{
				System.out.println("User Details Are Not Found");
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		break;
		
		
		
		case 5:try
		{
			al=(ArrayList<Employee2>)ois.readObject();
			
		}
		catch(ClassNotFoundException e2)
		{
			System.out.println(e2);
		}
		catch(Exception e2)
		{
			System.out.println(e2);
		}
		Display(al);
		break;
		
		case 6:try 
		{
			fos=new FileOutputStream(f);
			oos=new ObjectOutputStream(fos);
			oos.writeObject(al);
		}
		catch(IOException e1)
		{
			e1.printStackTrace();
		}
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
		finally
		{
			try
			{
				fis.close();
				ois.close();
				fos.close();
				oos.close();
			}
			catch(Exception e1)
			{
				e1.printStackTrace();
			}
		}
		System.out.println("\n You Have Choice Entered Exit ");
		sc.close();
		System.exit(0);
		break;
		
		default :System.out.println("\n Enter The Correct Choice From the List");
		break;
		
		}
		}
	
	while(true);

	}
	
	}

