package javaPrograms;

 abstract class Writer {
	public abstract void write();
}

class Pen extends Writer{
	
	public void write() {
		System.out.println("Pen");
	}
}
class Pencil extends Writer{
	public void write() {
		System.out.println("Pencil");
	}
}

class kit{
	
	public void doSomehting(Writer w) {
		w.write();
	}
}

public class Abstractdemo2 {

	public static void main(String[] args) {

		kit k=new kit();
		Pen p=new Pen();
		Writer pc=new Pencil();
		Writer pp=new  Pen();
		k.doSomehting(pp);
		
		
	}

}
