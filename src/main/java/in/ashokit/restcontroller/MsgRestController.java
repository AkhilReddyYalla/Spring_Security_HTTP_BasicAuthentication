package in.ashokit.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	@GetMapping("/")
	public String welocmeMsg() {
		return "welcome to ashokit";
	}

}
