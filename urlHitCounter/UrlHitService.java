package com.urlhitcounter.urlHitCounter;

import java.util.HashMap;

import org.springframework.stereotype.Service;

@Service
public class UrlHitService {
	
	HashMap<String, Integer>  map = new HashMap<>();
	
	public UrlHit getCount(String name) {
		int count = map.getOrDefault(name, 0)+1;
		
		map.put(name,count);
		
		UrlHit url = new UrlHit(name,count);
		
		return url;
	}
	
	//get all user name and count
	public HashMap<String,Integer> getAllCount() {
		return map;
	}

}
