package ua.online.courses.enums;

public enum Degree {

	Bachelor("Bachelor") , Master("Master") , Aspirant("Master");
	
	
	private String name;
	
	private Degree(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
