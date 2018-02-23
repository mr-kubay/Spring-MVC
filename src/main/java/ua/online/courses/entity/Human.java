package ua.online.courses.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table (name = "human")
public class Human extends BaseEntity{

	@NotEmpty(message = "shoul not be easdgdsfy")
	private String name;
	
	@Min(value = 15, message = ">15")
	@Max(value = 25, message = "<25")
	private int age;
	
	@Email(message = "email should be valid")
	private String email;
	
//	@AssertTrue(message = "asdgfhd")
//	@Column(name = "is_student")
//	private boolean isStudent;
	
	@Size(min = 2, max  = 5, message ="2<x<5")
	@Column(name = "about_me")
	private String aboutMe;
	
	public Human() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

//	public boolean isStudent() {
//		return isStudent;
//	}
//
//	public void setStudent(boolean isStudent) {
//		this.isStudent = isStudent;
//	}

	public String getAboutMe() {
		return aboutMe;
	}

	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}
	
	
}

