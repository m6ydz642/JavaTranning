package com.itwillbs.Model;

public class CustomerDTO {


	/*
	 * 자바빈 개념 
	 * DTO -> Data Transfer Object (데이터 전송 객체) 
	 * 사용할 테이블 참조해서 생성
	 * 
	 */
	
	private int idx;
	private String name;
	private String id;
	private String passwd;
	private String jumin;
	

	public CustomerDTO () {
		
	}
	
	
	@Override
	public String toString() { // 값 확인용
		return "CustomerDTO [idx=" + idx + ", name=" + name + ", id=" + id + ", passwd=" + passwd + ", jumin=" + jumin
				+ "]";
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getJumin() {
		return jumin;
	}
	public void setJumin(String jumin) {
		this.jumin = jumin;
	}

	

}
