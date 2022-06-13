package javaPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class hasmapiterator {
	
	public static void main(String [] xyz) {
		
		HashMap<String,Integer> capit=new HashMap<String,Integer>();
		
		capit.put("delhi",1);
		capit.put("vizag",null);
		capit.put("luknow", null);
		capit.put("patna",5);
		capit.put(null, 6);
		capit.put(null, 7);
		capit.put("delhi", 7);
		System.out.println(capit.get(null));
		System.out.println(capit.get("vizag"));
		System.out.println(capit.get("delhi"));
		System.out.println(capit.get("luknow"));
		System.out.println(capit.get("patna"));
		System.out.println(capit.remove(null));
		
		System.out.println("============");
		//iterator with keyset
		
		Iterator<String>  it= capit.keySet().iterator();
		  while( it.hasNext()) {
			      String key= it.next();
			                 Integer value=capit.get(key);
			                 System.out.println("Key:-"+key+" value:"+value);
			  
		  }
		  
		  System.out.println("============");
		  //iterator with Entryset
		  
		 Iterator<Entry<String,Integer>>   eit=   capit.entrySet().iterator();
		 while(eit.hasNext()) {
			  
		     Entry<String,Integer> key1   =  eit.next();
		                   Integer val=capit.get(key1);
		                   System.out.println("key: "+key1+" value:"+val);
		  }
		 System.out.println("============");
		 //lambda expression
		 
		    capit.forEach((k,v)->System.out.println("key"+k+"val"+v));
		
	}

}
