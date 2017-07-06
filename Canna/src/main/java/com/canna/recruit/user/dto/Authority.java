/**
 * 
 *	회원 권한
 *
 */
package com.canna.recruit.user.dto;

public enum Authority {
	PERSONAL(0, "ROLE_PERSONAL"),
	COMPANY(1, "ROLE_COMPANY"),
	ADMIN(2, "ROLE_ADMIN");
	
	private final int id;
	private final String authority;
	
	private Authority(int id, String authority) {
		this.id = id;
		this.authority = authority;
	}
	
	public int getId() {
		return id;
	}
	
	public String getAuthority() {
		return authority;
	}
	
	public static Authority valueOf(int id) {
		switch(id) {
			case 0: return PERSONAL;
			case 1: return COMPANY;
			case 2: return ADMIN;
			default: throw new AssertionError("unknown value : " + id);
		}
	}

}
