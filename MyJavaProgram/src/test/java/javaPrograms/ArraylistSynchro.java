package javaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArraylistSynchro {

	public static void main(String[] args) {
// 1. Collections.Synchroniedarraylist() -need explict synchronized for treverse,2. copyOnWriteArraylist class- do not need explict synchronized
	/*ArrayList<String>  boble=new ArrayList<>();
	            List<String> tt=  Collections.synchronizedList(boble);*/
		         List<String> name=  Collections.synchronizedList(new ArrayList<String>());
			       name.add("Amit");
			       name.add("sumit");
			       name.add("punit");
			       name.add("vinit");
			       synchronized(name) {
			    	   
			    	   Iterator<String>  it=name.iterator();
			    	   while(it.hasNext()) {
			    		   
			    		System.out.println( it.next());
			    	   }
			    	   
			    	   System.out.println("==========");
			    	  // by lamdaexpression
			    	   
			    	   name.forEach(nm->System.out.println(nm));
			    	 
			    	   System.out.println("==========");
			    	   //for each
			    	   
			    	   for(String names:name) {
			    		   System.out.println(names);
			    	   }
			       }
		//2. CopyOnWriteArraylist-Threadsafe-synchonized
			       
			       CopyOnWriteArrayList<String>  ll=new CopyOnWriteArrayList<>();
				   System.out.println("==========");
				   ll.add("Raju");
				   ll.add("mangesh");
				   ll.add("hariom");
				   ll.add("nevada");
				   for(int i=0;i<ll.size();i++) {
					   System.out.println(ll.get(i));
				   }
	}

}
