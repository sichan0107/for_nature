package coronaMall.web;

import java.io.IOException;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import coronaMall.customer.Customer;


@Controller
public class CoronaMallController {
	
	@GetMapping("findUserId")
	public String findUserId() {
		return "findUserId";
	}
	
	@GetMapping("phoneAuthorizing")
	public String phoneAuthorizing() {
		return "phoneAuthorizing";
	}
	
	@GetMapping("cart")
	public String cart() {
		return "shopping-cart";
	}
	@GetMapping("login")
	public String login() {
		return "login";
	}
	
//	@GetMapping("order")
//	public String order() {
//		return "shopping-cart";
//	}
//	
	@GetMapping("/login?error")
	public String loginFail() throws IOException{
		return "redirect:/loginError";
	}
	
}
