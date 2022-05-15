package javaPrograms;

interface  D{
	int i=9;//by default variable is final constant
	void tig();
	static void show() {
		System.out.println("hi team");
	}
}

 class animal implements D {
	public void tig() {
		 i=10;
	}
}

public class InterfaceStaticMethoddemo {

	public static void main(String[] args) {

		D.show();
		
	}

}
