
//#interface same as abstract class, but having only abstract method 
//Methods are only declare not define
//by default all methods are public and abstract
//interface class can be extends By using Implements keyword
//We can not create object of Interface we can create reference variable only
//we can implement multiple class but we can not extends multiple class
// main difference b/w interface and abstract class is all the method by defult public and abstract i interface only decalre but not define

interface  Book{
	//by  default public and abstract 
	void write();
}
// implements interface by using implements keywords in class
class Teacher implements Book
{
	public void write() {
		System.out.println("i m teacher");
	}
}
//multiple classes can implements interface
class Principle  implements Book{
	public void write() {
		System.out.println("i m principle");
	}
}

class Father {
	
	public void dosomething(Book b) {
		b.write();
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {

		Father f= new Father();
		
		Book obj=new Teacher();
		Book obj1=new Principle();
		f.dosomething(obj1);
	
		
		
	}

}
