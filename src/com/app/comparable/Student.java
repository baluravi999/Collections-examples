package com.app.comparable;

public class Student implements Comparable<Student>{

	private int sid;
	private String sname;
	private String sadd;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSadd() {
		return sadd;
	}
	public void setSadd(String sadd) {
		this.sadd = sadd;
	}
	public Student(int sid, String sname, String sadd) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sadd = sadd;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sadd=" + sadd
				+ "]";
	}
	@Override
	public int compareTo(Student o) {
		
		return this.sid-o.sid;
	}
	
	
	
}
