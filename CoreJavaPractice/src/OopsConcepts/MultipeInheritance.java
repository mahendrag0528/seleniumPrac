package OopsConcepts;

interface A1{
	void print();
}
interface B1{
	void print();
}
class C1 implements A1,B1{
	public void print() {
		System.out.println("This is method from multiple interfaces");
	}
}
public class MultipeInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 obj=new C1();
		obj.print();
	}

}
