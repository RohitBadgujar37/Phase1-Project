package projectQ;

  public class Program8{
	
	 String name;
	 int stuid;
	 String city;
	 
	
	public Program8(String name, int stuid, String city) {
		super();
		this.name = name;
		this.stuid = stuid;
		this.city = city;
	}


	{
	System.out.println("Student Details");
	}
  void display()
	{
	  
	 class Inner
	{
		void show()
		{
			System.out.println("Welcome to Inner class in Java");
		}
	}
	Inner in=new Inner();
	in.show();
	}
	

	public static void main(String[] args) {
	Program8 pg8=new Program8("Rohit",101,"Dhule");
	System.out.println(pg8.name);
	System.out.println(pg8.stuid);
	System.out.println(pg8.city);
	
	pg8.display();
		//Program7.Inner in= pg7.new Inner();
		//in.show();

	}

}
