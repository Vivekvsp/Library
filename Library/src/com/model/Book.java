package com.model;

public class Book {
	private int bookId;
	private String bookName;
	private String bookCode;
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
	public Book(int bookId, String bookName, String bookCode) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookCode = bookCode;
	}
	public Book(String bookName, String bookCode) {
		super();
		this.bookName = bookName;
		this.bookCode = bookCode;
	}
	@Override
	public String toString() {
		return "UserBook [bookId=" + bookId + ", bookName=" + bookName + ", bookCode=" + bookCode + "]";
	}
	

}
