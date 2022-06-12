package javaPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class Toarraylist {

	public static void main(String[] args) {
//1. creating to arraylist
		ArrayList<Integer> list=new ArrayList();
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(2);
		list.add(4);
		System.out.println(list);
		ArrayList<Integer>  list1=new ArrayList(Arrays.asList(1,2,3,5,9,2,3,1));
	/*	list.addAll(list1);
		System.out.println(list);*/
	//2.	list match both
	/*	list.retainAll(list1);
		System.out.println(list);*/
		
		//3. find thie missing element
		list1.remove(list);
		System.out.println(list1);
	}

}
