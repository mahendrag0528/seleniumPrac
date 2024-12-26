package OopsConcepts;
//Multilevel + overriding both
class A{
	int a=10;
}
class B extends A{
	int b=20;
	public void print() {
		System.out.println(a);
	}
}
class C extends B{
	public void print() {
		System.out.println(b);
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj=new B();
		obj.print();
		C obj2=new C();
		obj2.print();
	}

}
