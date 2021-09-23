package com.model;

public class Book {
	private int bookId;
	private String bookName;
	private String bookCode;
	private String bookPrice;
	private int authorId;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookCode() {
		return bookCode;
	}
	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}
	public String getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(String bookPrice) {
		this.bookPrice = bookPrice;
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public Book(int bookId, String bookName, String bookCode, String bookPrice, int authorId) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookCode = bookCode;
		this.bookPrice = bookPrice;
		this.authorId = authorId;
	}
	public Book(String bookName, String bookCode, String bookPrice, int authorId) {
		super();
		this.bookName = bookName;
		this.bookCode = bookCode;
		this.bookPrice = bookPrice;
		this.authorId = authorId;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookCode=" + bookCode + ", bookPrice="
				+ bookPrice + ", authorId=" + authorId + "]";
	}

	
	
	//	public String getIssueDate() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	public String getReturnDate() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	public String getIssueFine() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	

}
