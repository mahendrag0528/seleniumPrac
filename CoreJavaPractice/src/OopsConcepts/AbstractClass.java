package OopsConcepts;


abstract class Animal{
	abstract void food();
	void homanyLegs()
	{
		System.out.println("no.of legs="+4);
	}
}
class Cow extends Animal{
	void food() {
		System.out.println("Grass");
	}
}
class Tiger extends Animal{
	void food() {
		System.out.println("Meat");
	}
}
public class AbstractClass {
	public static void main(String[] args) {
		Tiger obj=new Tiger();
		obj.food();
		obj.homanyLegs();
		Cow obj1=new Cow();
		obj1.food();
		obj1.homanyLegs();
	}
}
