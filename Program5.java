package projectQ;

public class Program5
{
	int id;
	String name;

	public Program5(int id, String name) 
	{
		System.out.println("Parameterized Constructor");
		this.id = id;
		this.name = name;
	}
	
	public Program5()
	{
		System.out.println("Default Constructor");
	}

	public static void main(String[] args)
	{
		Program5 pg=new Program5();//Default Constructor
		System.out.println(pg.id);
		System.out.println(pg.name);
		
		Program5 pg2=new Program5(10,"Rohit");//Parameterized Constructor
		System.out.println(pg2.id);
		System.out.println(pg2.name);		
	}

}
