package javaPrograms;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.google.common.collect.ImmutableMap;

public class differentwaytocreatemap {

	public static Map<String,Integer> map1;
	
	static {
		map1=new HashMap<>();
		 map1.put("A",100 );
		 map1.put("B",200 );
		 map1.put("C",300 );
		 map1.put("D",400 );
	}
	
	public static void main(String[] args) {

		//1.static map
		System.out.println(differentwaytocreatemap.map1.get("C"));
		//2. 2D array//mutable
		System.out.println("=======");
		Map<String,String> map2= Stream.of(new String [][]
				{
			{"Amit","300"},
			{"sumit","400"},
			{"punit","500"},
			
				}).collect(Collectors.toMap(B->B[0],B->B[1]));
		System.out.println(map2.get("sumit"));
				map2.put("Bikash", "500");
		System.out.println(map2.get("Bikash"));
	
	//3. Immutable map
		System.out.println("=======");
	Map<String,String> map3=Collections.singletonMap("Rakesh","700");
	System.out.println(map3.get("Rakesh"));
	//  map3.put("Aksahy","900");//UnsupportedOperationException
	
	//4.Simple entry #Abstractmap//mutable
	System.out.println("=======");
	Map<String,Integer> map4= Stream.of(
			new AbstractMap.SimpleEntry<>("tivan",900),
			new AbstractMap.SimpleEntry<>("pops",500)
			
			).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	System.out.println(map4.get("tivan")); 
	map4.put("Reena", 250);
	
	System.out.println(map4.get("Reena"));
	
	//5. map of
	
	Map<String,Integer> map5=Map.ofEnteries(
			new AbstractMap.SimpleEntry<>("rinku",130),
			new AbstractMap.SimpleEntry<>("tony",120)
			);
	System.out.println(map5.get("tony"));
	map5.put("yonky",290);
	
	//6. Map<String,Integer> emptymap=Map.of();//emptymap
	//emptymap.put("akash",530); not possible
	 
	 Map<String,Integer> singleton=Map.of("Sulekha",300);
	 System.out.println(singleton.get("sulekha"));
	 singleton.put("ponam", 240);//not possible
	 
	 //7. multivalue#thersold upto 10
	 Map<String,Integer> multi=Map.of("k1",vi,"k2",v2,"k3",v3);
	 System.out.println(multi.get("k3")); 
	 
	 //8 imutable by guvava
	 Map<String,Integer> guvamap=ImmutableMap.of("A",1,"B",3,"C",2);
	 System.out.println(guvamap.get("B"));
	 guvamap.put("ritu",8);//not possible
}
}
