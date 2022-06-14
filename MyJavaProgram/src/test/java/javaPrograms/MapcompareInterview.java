package javaPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class MapcompareInterview {

	public static void main(String[] args) {

	HashMap<Integer,String> map1=new HashMap<>();
	map1.put(1,"A");
	map1.put(2,"B");
	map1.put(3,"C");
	
	HashMap<Integer,String> map2=new HashMap<>();
	map2.put(3, "C");
	map2.put(2,"B");
	map2.put(1,"A");
	
	HashMap<Integer,String> map3=new HashMap<>();
	map3.put(1,"A");
	map3.put(2,"B");
	map3.put(3,"C");
	map3.put(4,"C");
	
	
	//1. Comapre with key,value pair
	System.out.println(map1.equals(map2));//true on ordering
	System.out.println(map1.equals(map3));	
		
	//2 compare by keys
	 System.out.println(map1.keySet().equals(map2.keySet()));//true
	 System.out.println(map1.keySet().equals(map3.keySet()));//false
	
	 System.out.println("===========");
	 //3. find the extrakey
	 HashSet<Integer> combineset=new HashSet<>(map1.keySet());
	 combineset.addAll(map3.keySet());
	 combineset.removeAll(map1.keySet());
	 System.out.println(combineset);
	 System.out.println("===========");
	 //4.compare with values()
	    //i. duplicate values are not allowed         
	          System.out.println((new ArrayList<String>(map1.values()).equals(new ArrayList<String>(map3.values()))));//false
	      //ii. duplicate value are allowed
	          
	          System.out.println(new HashSet<String>(map1.values()).equals(new HashSet<String>(map2.values())));//true
	          
	       
	}

}
