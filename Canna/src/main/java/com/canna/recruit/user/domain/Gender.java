package com.canna.recruit.user.domain;

public enum Gender {
	M(0, "남"), W(1, "여");
	
	private final int id;
	private final String gender;
	
	private Gender(int id, String gender) {
		this.id = id;
		this.gender = gender;
	}
	
	public int getId() {
		return id;
	}
	
	public String getGender() {
		return gender;
	}
	
	public static Gender valueOf(int id) {
		switch(id) {
			case 0: return M;
			case 1: return W;
			default: throw new AssertionError("unknown value : " + id);
		}
	}
}
