package com.model;

public class Author {
	public int aId;
	public String aName;
	public String aMoblie;
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getaMoblie() {
		return aMoblie;
	}
	public void setaMoblie(String aMoblie) {
		this.aMoblie = aMoblie;
	}
	public Author( String aName, String aMoblie) {
		
		this.aName = aName;
		this.aMoblie = aMoblie;
	}
	public Author() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Author [aId=" + aId + ", aName=" + aName + ", aMoblie=" + aMoblie + "]";
	}
	

}
