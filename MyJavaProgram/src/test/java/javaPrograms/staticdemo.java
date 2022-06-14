package javaPrograms;

class cassio{
	
	public cassio() {
		
	}
	
	class inner{
		public void innerdemo() {
			int a=10;
			int b=12;
			int add=a+b;
			System.out.println(a+" | "+b+" | "+add);
		}
	}
}
//we can make innerclass as static
public class staticdemo {
	static String name="raj";
	public void teardown() {
		int i=3;
		String opr="abc";
		System.out.println("static class");
	}
	
	
	public static void main(String [] arhs) {
		cassio cd=new cassio();
	staticdemo sd=new staticdemo();
	sd.teardown();
	staticdemo.name="bikash";
	System.out.println(name);
	cassio.inner in= cd.new inner();
	in.innerdemo();
	
	}

}
