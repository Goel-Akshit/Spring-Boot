package in.akshit.model;

import java.io.File;


import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import in.akshit.service.BaseEncoder;

@Component
public class FormModel {
	
	private String name;
	private String email;
	private String department;
	private String phoneNo;
	private MultipartFile image;
	private String fileName;


	public FormModel() {
		super();
	}

	public FormModel(String name, String email, String department, String phoneNo, MultipartFile image) {
		super();
		this.name = name;
		this.email = email;
		this.department = department;
		this.phoneNo = phoneNo;
		this.image = image;
	}
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public MultipartFile getImage() {
		return image;
	}

	public void setImage(MultipartFile image) {
		this.image = image;
	}
	
	private String Imagehandler(String uploadedFileName, MultipartFile image) {
		
		
		
		//Making Directory
		String uploadedImagePathName = System.getProperty("user.dir") + File.separator + "UploadedImages";
		File uploadedImagePath = new File(uploadedImagePathName);
		if(!uploadedImagePath.exists()) {
			uploadedImagePath.mkdir();
		}
		
		//saving image in folder with its original name
		String uploadedImageName = uploadedFileName.split("\\\\")[4];
		try {
			image.transferTo(new File(uploadedImagePathName + File.separator + uploadedImageName));
		}catch(Exception e) {
			System.out.println("Error While Saving Multipart file : " + e.getMessage());
		}
		
	    String imageDbName = null;
		try {
			 imageDbName = BaseEncoder.base64Encoder(uploadedImagePath.getAbsolutePath() + File.separator + uploadedImageName);
		}catch(Exception e) {
			System.out.println("File Encoding Failed");
		}
		
		return imageDbName;
		
	}

	public User getUser(FormModel formData) {
		String imageDbName = Imagehandler(formData.getFileName(), formData.getImage());
		
		User newUser = new User();		
		newUser.setDepartment(formData.getDepartment());
		newUser.setEmail(formData.getEmail());
		newUser.setImage(imageDbName);
		newUser.setName(formData.getName());
		newUser.setPhoneNo(formData.getPhoneNo());
		
		return newUser;
	}
	
	public User getUser(String name, String department, String email, String phoneNo, String filename, MultipartFile image, long id) {
		String imageDbName = Imagehandler(filename, image);
		
		User newUser = new User();		
		newUser.setDepartment(department);
		newUser.setEmail(email);
		newUser.setImage(imageDbName);
		newUser.setName(name);
		newUser.setPhoneNo(phoneNo);
		newUser.setId(id);
		
		return newUser;
	}
}
