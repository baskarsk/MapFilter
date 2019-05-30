package com.cognizant.mapfilter;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;



public class MapFilter {

//	public static <K,V> Map<K,V> filterByValue(Map<K,V> map,Predicate<Product> pred){
//		System.out.println("==== In filterByValue ====");
//		return map.entrySet()
//				.stream()
//				.filter(p-> map.containsValue())
//				.collect(Collectors.toMap(Map.Entry :: getKey, Map.Entry :: getValue));
//		
//		
//	}
	
	public static <K,V> Map<K,V> filterByValueByObject(Map<K,V> map,Product prod){
		System.out.println("==== In filterByValue ====");
		return map.entrySet()
				.stream()
				.filter(p -> p.getValue().equals(prod))
				.collect(Collectors.toMap(Map.Entry :: getKey, Map.Entry :: getValue));
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product p1 = new Product("P1","Mobile",1);
		Product p2 = new Product("P2","Laptop",2);
		Product p3 = new Product("P3","Desktop",3);
		Product p4 = new Product("P4","Mobile",1);
		Product p5 = new Product("P5","IoT",5);
		
		
		 Map<Integer, Product> HOSTING = new HashMap<>();
	        HOSTING.put(1, p1);
	        HOSTING.put(2, p2);
	        HOSTING.put(3, p3);
	        HOSTING.put(4, p4);
	        HOSTING.put(5, p5);	
	
	     Product locProd = new Product("P1","Mobile",1);
	
		Map<Integer , Product> filteredMap = filterByValueByObject(HOSTING ,locProd);
		System.out.println("Size of filteredMap:"+filteredMap.size());
			
		
	
	}
}
