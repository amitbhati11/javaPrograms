package javaPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class arraylistduplicatefind {

	public static void main(String[] args) {
//printlue in  duplicate value in arraylist by using hashset
		ArrayList<String>  name=new ArrayList();
		name.add("Amit");
		name.add("Baby");
		name.add("Sachin");
		name.add("Amit");
		name.add("Sachin");
		System.out.println(name);
		Set<String> se=new HashSet<String>();
		for(String names:name) {
			if(se.add(names)==false) {
				System.out.println(names);
			}
		}
		
		
		}
	}


