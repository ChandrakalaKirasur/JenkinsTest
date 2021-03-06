package com.bridgelabz.jenkinstest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class JenkinsTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsTestApplication.class, args);
	}

}
@RestController
class JenkinsTestController {
	/*
	 * welcome page
	 */
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome ";
	}
	@GetMapping("/")
	public String emptyPage() {
		return "testing jenkins";
	}
}