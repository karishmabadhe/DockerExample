package com.example.ExampleDocker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/docker")
public class ExampleController
{
	@GetMapping("/home")
	public @ResponseBody String home()
	{
		return "THIS IS PRACTICE SESSION";
	}
}