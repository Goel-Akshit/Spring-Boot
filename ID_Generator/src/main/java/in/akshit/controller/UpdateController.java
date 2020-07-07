package in.akshit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import in.akshit.model.FormModel;
import in.akshit.model.User;
import in.akshit.repository.UserRepository;

@Controller
public class UpdateController {
	
	@Autowired
	UserRepository repo;
	
	@Autowired
	FormModel formModel;
	


	@GetMapping("/update")
	public String updateView() {
		return "update";
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/updateRequest")
	public String updatingValidation(@RequestParam String email, ModelMap model) {
		User user = repo.findByEmail(email);
		if(user != null) {
			model.put("user", user);
			return "updateUserForm";
		}
		model.put("message", "user not found try generating new ID");
		return "/update";
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/updateUser")
	public String updateComplete(
			@RequestParam String email,
			@RequestParam String id,
			@RequestParam String name,
			@RequestParam String department,
			@RequestParam String phoneNo,
			@RequestParam String filename,
			@RequestParam MultipartFile image, 
			ModelMap model) {
		//String name, String department, String email, String phoneNo, String image, long id
		User updatedUser = null;
		if(!image.isEmpty()) {
			 updatedUser = formModel.getUser(name, department, email, phoneNo, filename, image, Long.parseLong(id));
		}else {
			
			User found = repo.findByEmail(email);
			updatedUser = new User(name, department, email, phoneNo,found.getImage(), Long.parseLong(id));
		}
		
		User fetchedUpdatedUser = repo.save(updatedUser);
		
		model.put("user", fetchedUpdatedUser);
		return "ID";
	}
}
