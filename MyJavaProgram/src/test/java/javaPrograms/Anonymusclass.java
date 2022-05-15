package javaPrograms;

class Country{
	
	public void atmoshphare() {
		System.out.println("it is hot");
	}
}
/*class Desh extends Country {
	
	public void atmoshphare() {
		//super.atmoshphare();
		System.out.println("its cold");
	}
}*/

public class Anonymusclass {

	public static void main(String [] xyz) {
		
		Country cc=new Country()
		{      //Anonymus class which does n't has class name and define inside object
			public void atmoshphare() {
				
				System.out.println("its cold");
			}
		};
		cc.atmoshphare();
		
		/*Country cb=new Desh(); 
		cb.atmoshphare();*/
		
	}
}

