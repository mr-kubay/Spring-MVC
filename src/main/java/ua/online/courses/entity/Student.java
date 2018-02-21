package ua.online.courses.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import ua.online.courses.enums.Degree;


@Entity
@Table(name = "student")

public class Student extends BaseEntity{

	private String name;
	private String country;
	
	@Column(name = "favorite_language")
	private String favoriteLanguage;
	
	private String[] os;

	@Enumerated(EnumType.STRING)
	private Degree studentDegree;
	
	
	public Degree getStudentDegree() {
		return studentDegree;
	}

	public void setStudentDegree(Degree studentDegree) {
		this.studentDegree = studentDegree;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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

	public Student() {
	}
	
	
}
