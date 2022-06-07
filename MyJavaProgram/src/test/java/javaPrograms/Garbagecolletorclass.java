package javaPrograms;

public class Garbagecolletorclass {

	/*it is the process of reclaiming the runtime unused memory automatically
	advantages-1.make java memory more efficient 2. Automatically done(jvm)
	1.	By nulling the references 2. By assigning ref to another 3. By annomys object
	1.Finilise() objectclass –invoke before object  is to  garbage collected 2. Gc()  system,runtime- invoke garabage collection 
*/
	public void finalize() {
		System.out.println("garbaze collecteor");
	}
	public static void main(String[] args) {

		Garbagecolletorclass a=new Garbagecolletorclass();
		a=null;
		Garbagecolletorclass b=new Garbagecolletorclass();
		a=b;
		new Garbagecolletorclass();
		System.gc();
	}

}
