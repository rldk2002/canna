package com.canna.recruit.user.dto;

public enum Industy {
	MANAGEMENT(0, "경영"),
	OFFICEWORK(1, "사무"),
	MARKETING(2, "마케팅"),
	TRADE(3, "무역"),
	DISTRIBUTION(4, "유통"),
	BUSINESS(5, "영업"),
	CS(6, "고객상담"),
	IT(7, "IT"),
	COMMUNICATION(8, "통신"),
	RND(9, "연구개발/설계"),
	MANUFACTURE(10, "생산/제조"),
	PROFESSION(11, "전문직"),
	DESIGN(12, "디자인"),
	MEDIA(13, "미디어"),
	SERVICE(14, "서비스"),
	CONSTRUCTION(15, "건설");
	
	private final int id;
	private final String industry;
	
	private Industy(int id, String industry) {
		this.id = id;
		this.industry = industry;
	}
	
	public int getId() {
		return id;
	}
	
	public String getIndusty() {
		return industry;
	}
	
	public static Industy valueOf(int id) {
		switch(id) {
			case 0: return MANAGEMENT;
			case 1: return OFFICEWORK;
			case 2: return MARKETING;
			case 3: return TRADE;
			case 4: return DISTRIBUTION;
			case 5: return BUSINESS;
			case 6: return CS;
			case 7: return IT;
			case 8: return COMMUNICATION;
			case 9: return RND;
			case 10: return MANUFACTURE;
			case 11: return PROFESSION;
			case 12: return DESIGN;
			case 13: return MEDIA;
			case 14: return SERVICE;
			case 15: return CONSTRUCTION;
			default: throw new AssertionError("unknown value : " + id);
		}
	}
}
