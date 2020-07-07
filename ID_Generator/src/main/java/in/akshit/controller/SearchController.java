package in.akshit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import in.akshit.model.User;
import in.akshit.repository.UserRepository;

@Controller
public class SearchController {

	@Autowired
	private UserRepository repository;
	
	@Autowired
	private User tempUser;

	
	@RequestMapping(method=RequestMethod.POST, value="/search")
	public String searchUser(@RequestParam String email, ModelMap model) {
		tempUser = repository.findByEmail(email);
		
		if(tempUser != null) {
			model.put("user", tempUser);
			return "ID";
			
		}else {
			model.put("message", "User not found");
			return "search";
			
		}
	}
	
	@GetMapping("/find")
	public String getSearchView() {
		return"search";
	}
}
