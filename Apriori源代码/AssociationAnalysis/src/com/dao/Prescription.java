package com.dao;

public class Prescription {
	public int getMedid() {
		return medid;
	}
	public void setMedid(int medid) {
		this.medid = medid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private int medid;
	private String name;
}
