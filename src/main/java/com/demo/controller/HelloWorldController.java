package com.demo.controller;
import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping({ "/hello" })
	public HashMap<String, String> firstPage() {
		HashMap<String, String> map = new HashMap<>();
	    map.put("hello", "bhaiya");
	    map.put("ʕ•́ᴥ•̀ʔ", "hehee");
	    return map;
	}
	
	@RequestMapping({ "/hi" })
	public String hi() {
		return "Namaskar World";
	}

}

