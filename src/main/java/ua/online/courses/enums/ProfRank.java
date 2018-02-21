package ua.online.courses.enums;

public enum ProfRank {
	COURSE_LISTENER("listener"), JUNIOR("junior"), MIDDLE("middle"), SENIOR("senior");
	
	private String rank;
	
	private ProfRank(String rank) {
		this.rank = rank;
	}
	
	public String getRank() {
		return rank;
	}
}
