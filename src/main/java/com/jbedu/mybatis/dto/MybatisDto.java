package com.jbedu.mybatis.dto;

import java.sql.Timestamp;

public class MybatisDto {
	
	private int fbnum;
	private String fbname;
	private String fbtitle;
	private String fbcontent;
	private int fbhit;
	private Timestamp fbdate;
	
	public MybatisDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MybatisDto(int fbnum, String fbname, String fbtitle, String fbcontent, int fbhit, Timestamp fbdate) {
		super();
		this.fbnum = fbnum;
		this.fbname = fbname;
		this.fbtitle = fbtitle;
		this.fbcontent = fbcontent;
		this.fbhit = fbhit;
		this.fbdate = fbdate;
	}
	public int getFbnum() {
		return fbnum;
	}
	public void setFbnum(int fbnum) {
		this.fbnum = fbnum;
	}
	public String getFbname() {
		return fbname;
	}
	public void setFbname(String fbname) {
		this.fbname = fbname;
	}
	public String getFbtitle() {
		return fbtitle;
	}
	public void setFbtitle(String fbtitle) {
		this.fbtitle = fbtitle;
	}
	public String getFbcontent() {
		return fbcontent;
	}
	public void setFbcontent(String fbcontent) {
		this.fbcontent = fbcontent;
	}
	public int getFbhit() {
		return fbhit;
	}
	public void setFbhit(int fbhit) {
		this.fbhit = fbhit;
	}
	public Timestamp getFbdate() {
		return fbdate;
	}
	public void setFbdate(Timestamp fbdate) {
		this.fbdate = fbdate;
	}
	
	

}
