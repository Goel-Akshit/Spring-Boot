package in.akshit.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


import in.akshit.repository.UserRepository;



@Controller
public class AdminController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/admin")
	public String admin(ModelMap model){		
		model.put("usersList", userRepository.findAll());
		return "admin";
	}
}
