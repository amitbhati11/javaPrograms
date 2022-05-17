package javaPrograms;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class SetandMapInterface {
	
	@Test
	
	public void setinterfacedemo() {
		
		Set<Integer> set=new HashSet<Integer>();//to make this generic <>,set is used for unique value,we cant insert duplicte
		set.add(50);
		set.add(62);
		set.add(27);
		set.add(69);
		
		System.out.println("the value of set "+set);
		//inhance for loop
		for(int k:set) {
			System.out.println(k);
		}
		
		
		
	}
	
	@Test
	
	public void treeSetdemo() {
		Set<Integer>  tt=new TreeSet<Integer>();//fecthing the value in ascending order(sorting)
		
		tt.add(342);
		tt.add(123);
		tt.add(555);
		tt.add(999);
		tt.add(50);
	//	Collections.sort(tt);
		System.out.println("the value of treeset"+ tt);
		
		for(int j:tt) {
			System.out.println(j);
		}
	}
	
	@Test
	
	
	public void mapinterfacedemo() {
		//hashMap is not syncronized
		Map<String,String> mm=new HashMap();
		mm.put("name","amit");
		mm.put("age", "27");
		mm.put("actor", "Ranbir");
	    mm.put("name", "nanu");//key(name) value can  replace by latest value but not key itself 
	    

		System.out.println(mm);
		
		System.out.println(	mm.get("name"));
		
		
		}
	
	@Test
	
	public void hashtablemap() {
		//HashTable is syncronized(for thread safe)
		Map<String,String>  map=new Hashtable();
		
		
		
	}

}
