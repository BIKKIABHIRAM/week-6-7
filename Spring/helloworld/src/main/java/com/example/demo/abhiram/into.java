package com.example.demo.abhiram;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class into {
	    @GetMapping("/ram/into")
        public String ram() {
   
        	return "you bridzelab mentor was arpit";
        }
}