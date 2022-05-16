package javaPrograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class Collectonpackage {
	
	@Test
	
	public void collectionp() {
		
		Collection values=new ArrayList();
		
		values.add(5);
		values.add(7);
		values.add(9);
		values.add("amit");
		values.remove(7);
		
		System.out.println(values);
		
		Iterator it=values.iterator();
		it.next();
		
		System.out.println(it.next());
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	@Test
	
	public void listdemo() {
		//<> generic
		List<Integer> abc=new ArrayList();
		abc.add(13);
		abc.add(123);
		abc.add(5);
		abc.add(5);//can add duplicate value in list
		
		System.out.println("value of list "+abc);
		
		//String
		List<String> mn=new ArrayList();
		mn.add("amitb");
		System.out.println(mn);
	}
	
	@Test
	
	public void setineterfacedemo() {
		Set vm=new HashSet();
		
		vm.add(5);
		vm.add(5);//set is working for unique not insert duplicate value
		
		vm.add("sumit");
		
		System.out.println("value of set"+vm);
			
	}
	
	@Test
	
	public void Mapinterfacedemo() {
		Map<Integer,String> mm=new HashMap();
		mm.put(123, "baby");
		mm.put(789,"rash");
		
		System.out.println("value of map"+mm);
		
		
	}

}
