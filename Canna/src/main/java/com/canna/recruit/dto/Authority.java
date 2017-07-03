/**
 * 
 *	회원 권한
 *
 */
package com.canna.recruit.dto;

public enum Authority {
	NORMAL(0, "ROLE_NORMAL_USER"),
	ENTERPRISE(1, "ROLE_ENTERPRISE_USER"),
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
			case 0: return NORMAL;
			case 1: return ENTERPRISE;
			case 2: return ADMIN;
			default: throw new AssertionError("unknown value : " + id);
		}
	}

}
