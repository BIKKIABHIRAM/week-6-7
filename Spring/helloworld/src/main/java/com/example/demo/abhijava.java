package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class abhijava {
	    @GetMapping("/ram")
        public String nee() {
   
        	return "Hello BridzeLab"+" <a href='/ram/into'>Click here to see details</a>";
        }
}
