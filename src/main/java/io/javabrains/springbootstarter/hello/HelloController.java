package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bmshamsnahid on 7/21/17.
 */
@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi";
	}
	
}
