package com.aws.samples;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


	@GetMapping("/")
	public String getHello()
	{
		return "Hello world container app";
	}
	
	@GetMapping("/date")
	public String getTime()
	{
		return LocalDateTime.now().toString();
	}
}
