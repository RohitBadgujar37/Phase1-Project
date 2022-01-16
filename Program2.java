package projectQ;

class Other {
	
public int no;
{
	System.out.println("Public Acess Specifier");
}
protected  void fun() //protected scope
{
	System.out.println("Protected Acess Specifier ");
}
void display() // default scope
{
	System.out.println("Default Acess Specifier");
}
private void show() // private scope
{
	System.out.println("Private Acess Specifier");
}
}

 public class Program2
 {
 
		public static void main(String[] args) {
			
		
		Other pg=new Other();
		pg.no=20; 
		pg.fun(); 
		pg.display();
		//pg.show();

	}
}

