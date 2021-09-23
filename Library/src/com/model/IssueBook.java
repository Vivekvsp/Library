package com.model;

public class IssueBook {
	public int userid;
	public int bookid;
	public String issuedate;
	public String returndate;
	public int fine;
	
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getIssuedate() {
		return issuedate;
	}
	public void setIssuedate(String issuedate) {
		this.issuedate = issuedate;
	}
	public String getReturndate() {
		return returndate;
	}
	public void setReturndate(String returndate) {
		this.returndate = returndate;
	}
	public int getFine() {
		return fine;
	}
	public void setFine(int fine) {
		this.fine = fine;
	}
	
	public IssueBook(int userid, int bookid) {
		super();
		this.userid = userid;
		this.bookid = bookid;
	
	}
	public IssueBook(int userid, int bookid, String issuedate, String returndate) {
		super();
		this.userid = userid;
		this.bookid = bookid;
		this.issuedate = issuedate;
		this.returndate = returndate;
	}
	@Override
	public String toString() {
		return "IssueBook [userid=" + userid + ", bookid=" + bookid + ", issuedate=" + issuedate + ", returndate="
				+ returndate + ", fine=" + fine + "]";
	}
	public String getIssueDate() {
	// TODO Auto-generated method stub
		return null;
	}
	public String getReturnDate() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getIssueFine() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
		

}
