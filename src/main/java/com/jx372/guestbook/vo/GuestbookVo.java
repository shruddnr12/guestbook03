package com.jx372.guestbook.vo;

public class GuestbookVo {
	private Long no;
	private String name;
	private String passwd;
	private String message;
	private String date;
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "GuestbookVo [no=" + no + ", name=" + name + ", passwd=" + passwd + ", message=" + message + ", date="
				+ date + "]";
	}

}
