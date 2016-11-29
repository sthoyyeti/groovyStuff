package com.bosch.bsj.srini.groovyex;

import java.util.HashMap;
import java.util.Map;

public class GMapTest {
	
	public static void main(String[] args) {
		GMap map = new GMap();
		 Object http = map.getHttp();
		 Map<Integer, String> javaMap= (HashMap<Integer,String>)http;
		 
		 for(Integer key: javaMap.keySet()){
			 
			 System.out.println(key + " : "+ javaMap.get(key));
		 }
	}

}
