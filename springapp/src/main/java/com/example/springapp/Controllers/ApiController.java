package com.example.springapp.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
@RequestMapping("/welcome")
public class ApiController {
    @GetMapping("/welcome")
    public String welcome()
	{
		return "Welcome";
	}
}
