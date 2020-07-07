package in.akshit.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String name;
	private String department;
	private String email;
	private String phoneNo;
	
	@Column(columnDefinition="LONGTEXT")
	private String image;

	public User() {
		super();
	}
	
	public User(String name, String department, String email, String phoneNo, String image, long id) {
		super();
		this.name = name;
		this.department = department;
		this.email = email;
		this.phoneNo = phoneNo;
		this.image = image;
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public void setImage(String image) {
		this.image = image;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public String getEmail() {
		return email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public String getImage() {
		return image;
	}

	public long getId() {
		return id;
	}

}

