package com.src.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RestController
@SpringBootApplication
public class MainApplication {
  @GetMapping("/")
  public String myString()  {
    return "hello, World!!!!!";
  }

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}

}
