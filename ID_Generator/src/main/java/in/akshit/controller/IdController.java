package in.akshit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import in.akshit.model.FormModel;
import in.akshit.model.User;
import in.akshit.repository.UserRepository;

@Controller
public class IdController {

	@Autowired
	private FormModel myFormModel;	
	
	@Autowired
	private UserRepository userRepository;

	
	@GetMapping("/register")
	public String register(ModelMap model) {
		model.put("formModel", new FormModel());
		return "register";
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/ID")
	public String generateId(@ModelAttribute("formModel")FormModel formData, ModelMap model){
		
		User fetchedUser = new User();
		
		// handle Image uploaded and in return get User Object that can be directly stored in DB
		User user = myFormModel.getUser(formData);
			
		//checking and then saving and also then Fetching ID.
		if(userRepository.existsByEmail(user.getEmail())) {
			fetchedUser = userRepository.findByEmail(user.getEmail());
		}else {
			fetchedUser = userRepository.save(user);
		}

		model.put("user", fetchedUser);
		return"ID";
	}
	
	@GetMapping("/ID")
	public String redirectToRegister() {
		return "redirect:/register";
	}
}
