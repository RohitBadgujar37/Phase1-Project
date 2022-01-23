package projectQ;

abstract class Shape{
	int len;
	//constructor
	public Shape(int len) {
		super();
		this.len = len;
	}
	
	abstract void calcArea();
	
}
class Rectangle extends Shape{
	private int breadth;
	Rectangle(int len, int breadth){
		super(len);
		this.breadth=breadth;
	}
	
	@Override
	void calcArea(){
		System.out.println("Area of Rectangle="+len*breadth);
	}
	
}

public class AbstractClass {

	public static void main(String[] args) {
		
		//Shape shape=new Shape(); Error- can't create object of abstract class
		Shape shape=new Rectangle(4,5);
		shape.calcArea();
	}

}
