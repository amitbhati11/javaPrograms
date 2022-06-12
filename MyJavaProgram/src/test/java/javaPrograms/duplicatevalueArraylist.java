package javaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class duplicatevalueArraylist {

	public static void main(String[] args) {
//1. jdk8-stream
		ArrayList<String> name=new ArrayList<String>(Arrays.asList("Raj","Amit","Sachin","Raj","Amit"));
		System.out.println(name);
	List<Object> unqname=name.stream().distinct().collect(Collectors.toList());
	//Collections.sort(unqname);
	System.out.println(unqname);
	
	//2.by use linkedhashset
	
	ArrayList<Integer> number=new ArrayList(Arrays.asList(1,2,3,1,4,7,8,3,2,5,7));
	System.out.println(number);
	LinkedHashSet<Integer> num=new LinkedHashSet(number);
	List<Integer>  unqnum=new ArrayList(num);
	Collections.sort(unqnum);
	System.out.println(unqnum);
	
	//3. print duplicate value in arraylist
	
	ArrayList<Integer>  val=new ArrayList<Integer>(Arrays.asList(1,1,2,4,5,3,2,3,5,9,5));
	System.out.println(val);
	
	Set<Integer> ss=new HashSet<Integer>();
	for(int valus:val)
	if(ss.add(valus)==false) {
		System.out.println(valus);
		
	}
		
	}

}
  