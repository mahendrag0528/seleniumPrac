package OopsConcepts;

interface Shape{
	void area();
}
class Rectangle implements Shape{
	private int l;
	private int b;
	Rectangle(int l,int b){
		this.l=l;
		this.b=b;
	}
	public void area() {
		System.out.println("Area of the rectangle : "+(l*b));
	}
}
class Circle implements Shape{
	private int r;
	Circle(int r){
		this.r=r;
	}
	public void area() {
		System.out.println("Area of the circle : "+(3.14*r*r));
	}
}
public class InterfacePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape rect=new Rectangle(6,7);
		rect.area();
		Shape circle=new Circle(6);
	    circle.area();
	}

}
