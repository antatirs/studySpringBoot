package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	@RequestMapping("/getData")
	public Data getData(@RequestParam(value="name", defaultValue="hyunwoo") String name){
		return new Data(name, 10, "010-37");
	}
}
