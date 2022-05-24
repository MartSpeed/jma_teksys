package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// need to inform spring that this is a RESTcontroller
@RestController
public class FirstController {
	// ('/') is probably a reference to the root folder
	@GetMapping("/")
	public String home() {
		return "Hello from the controller";
	}
}
