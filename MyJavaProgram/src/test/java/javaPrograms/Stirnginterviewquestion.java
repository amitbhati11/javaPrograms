package javaPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Stirnginterviewquestion {


	
	public static void main(String [] args) {
		String a="Amitbhati1";
		
		String b="";	
		char find='i';
		 int count=0;
	for(int i=a.length()-1;i>=0;i--) {
		 b=b+a.charAt(i);
		
		 if(a.charAt(i)==find) {
			
			count++;
		 }
		 
		
	}System.out.println(b+"--"+count);
	
	String str="amit and ankur are having sandwich and";
	String search="and";
	
             String words[]= str.split(" ");
             Map<String,Integer> wordmap=new HashMap<>();
             
             for(String word:words) {
            	 if(wordmap.containsKey(word)) {
            		 wordmap.put(word, wordmap.get(word)+1);
            	 }else {
            		 wordmap.put(word, 1);
            	 }
             }
	//print the value map
             
                        Set<Entry<String,Integer>> set= wordmap.entrySet();
                        for(Entry<String,Integer> ee:set) {
                        	//single word
                        	/*if((ee.getValue()>1)&&(ee.getKey().contains(search))) {
                        		System.out.println(ee.getKey()+"--"+ee.getValue());
                        	}*/
                        	
                        	if(ee.getValue()>1) {
                        		System.out.println(ee.getKey()+"###"+ee.getValue());
                        	}else {
                        		System.out.println(ee.getKey()+"###"+ee.getValue());
                        	}
                        }


}
}