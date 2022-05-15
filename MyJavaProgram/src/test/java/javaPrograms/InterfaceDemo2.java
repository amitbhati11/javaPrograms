package javaPrograms;

interface Player{
	
	void palying();
	
}
/*class India implements Player {
	
	public void palying() {
		System.out.println("cricket team");
	}
}
*/

public class InterfaceDemo2 {

	public static void main(String[] args) {

		/* Player p=new India();
		 p.palying();*/
		 
		Player pp=new  Player() {//by using anonmyus class concept
			public void palying() {
				System.out.println("its cricket team");
			}
		};
		pp.palying();
	}

}
