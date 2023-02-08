package com.urlhitcounter.urlHitCounter;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlHitController {
	@Autowired
	UrlHitService urlhit;
	
	@GetMapping("/user/{user}/count")
	public UrlHit getCount(@PathVariable String user) {
		return urlhit.getCount(user);
	}
	
	//get all username and count
	@GetMapping("/all-user")
	public HashMap<String, Integer> getAllUser() {
		return urlhit.getAllCount();
	}

}
