package javaPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class CollectionDemo {
	
	@Test
	//Collection class
	public void Collectionclass() {
		
		List<Integer>  ii=new ArrayList<Integer>();//List is a mutable(can change the value of list)
		
		ii.add(9);
		ii.add(7);
		ii.add(8);
		ii.add(2);
		ii.add(5);
		
		//Collection -->sort method
		Collections.sort(ii);
		Collections.reverse(ii);
		Collections.shuffle(ii);
		//System.out.println(ii);
		
		/*for(Integer values :ii) {
			
			System.out.println(values);
			
		}
		*/
		for(int k=0;k<ii.size();k++) {
			System.out.println(ii.get(k));
		}
		
	}
	
}