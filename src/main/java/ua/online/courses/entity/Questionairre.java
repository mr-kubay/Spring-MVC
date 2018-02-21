package ua.online.courses.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import ua.online.courses.enums.Degree;
import ua.online.courses.enums.Gender;
import ua.online.courses.enums.ProfRank;

@Entity
@Table(name = "questionairre")
public class Questionairre extends BaseEntity{
	
	@Column(name = "full_name")
	private String fullName;
	
	private int age;
	
	private String country;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	private String email;
	
	@Enumerated(EnumType.STRING)
	private Degree degree;
	
	@Column(name = "social_networks") 
	private String[] socialNetworks;
	
	@Column(name = "favorite_language")
	private String favoriteLanguage;

	@Column(name = "operation_systems")
	private String[] os;
	
	private String experience;
	
	@Enumerated(EnumType.STRING)
	private ProfRank rank;
	
	private String[] technologies;
	
	public Questionairre() {}

	
	public Gender getGender() {
		return gender;
	}


	public void setGender(Gender gender) {
		this.gender = gender;
	}


	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Degree getDegree() {
		return degree;
	}


	public void setDegree(Degree degree) {
		this.degree = degree;
	}


	public String[] getSocialNetworks() {
		return socialNetworks;
	}


	public void setSocialNetworks(String[] socialNetworks) {
		this.socialNetworks = socialNetworks;
	}


	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}


	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}


	public String[] getOs() {
		return os;
	}


	public void setOs(String[] os) {
		this.os = os;
	}


	public String getExperience() {
		return experience;
	}


	public void setExperience(String experience) {
		this.experience = experience;
	}


	public ProfRank getRank() {
		return rank;
	}


	public void setRank(ProfRank rank) {
		this.rank = rank;
	}


	public String[] getTechnologies() {
		return technologies;
	}


	public void setTechnologies(String[] technologies) {
		this.technologies = technologies;
	}
	
	
	
}
