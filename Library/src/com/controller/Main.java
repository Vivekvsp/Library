package com.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.dao.AuthorDao;
import com.dao.BookDao;
import com.dao.IssueDao;
import com.dao.UserDao;
import com.model.Author;
import com.model.Book;
import com.model.IssueBook;
import com.model.User;

public class Main {
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to library details add ");
		System.out.println(" ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("Press 1 to Add new book");
			System.out.println("Press 2 to Display book");
			System.out.println("Press 3 to Delete book");
			System.out.println("Press 4 to Author");
			System.out.println("Press 5 to Update book");
			System.out.println("Press 6 to Add new member");
			System.out.println("Press 7 to Display member");
			System.out.println("Press 8 to Delete member");
			System.out.println("Press 9 to Update member");
			System.out.println("Press 10 to Issue book");
			System.out.println("Press 0 to Exit App");
			
			
			int c=Integer.parseInt(br.readLine());
			
			if(c==1) {
				System.out.println("Enter book name:");
				String name=br.readLine();
				
				System.out.println("Enter book code:");
				String code=br.readLine();
				
				System.out.println("Enter book price:");
				String price=br.readLine();
				
				System.out.println("Enter author id:");
				int authorid=Integer.parseInt(br.readLine());
				
				Book ib=new Book(name,code,price,authorid);
				
				
				boolean answer =BookDao.insertBookToDB(ib);
				if(answer) {
					System.out.println("Success add book");
				}else {
					System.out.println("not success");
				}
			}
			
			
			//Delete book
			if(c==3) {
				System.out.println("Enter tho bookId to delete:");
				int bookId=Integer.parseInt(br.readLine());
				boolean f=BookDao.deleteBooktoDB(bookId);
				if(f) {
					System.out.println("Delete");
				}else {
					System.out.println("Not delete");
				}
				
			}
			if(c==2) {
				BookDao.showAllBook();
			}
			if(c==4) {
				System.out.println("Enter author name:");
				String name=br.readLine();
				
				System.out.println("Enter author mobile:");
				String code=br.readLine();
				
				
				Author au=new Author(name, code);
				boolean answer =AuthorDao.insertAuthorToDB(au);
				if(answer) {
					System.out.println("Success add author");
				}else {
					System.out.println("not success");
				}
				System.out.println(au);
				System.out.println(" ");
			}
			else if(c==5){
				//update book
				System.out.println("Enter the book Id to update :");
				int userId =Integer.parseInt(br.readLine());
				
				
				
				System.out.println("Enter book name :");
				String name=br.readLine(); 
				
				System.out.println("Enter book code :");
				String code=br.readLine();
				
				System.out.println("Enter book price :");
				String price=br.readLine();
				
				System.out.println("Enter author id:");
				int authorid=Integer.parseInt(br.readLine());
				
				
				Book v=new Book( userId,name, code, price, authorid);
				boolean t=BookDao.updatebook(v);
				
				if(t) {
					System.out.println("up......");
				}else {
					System.out.println("not up......");
				}
				System.out.println(v);
				
			}
			if(c==6) {
				//Add student.....
				System.out.println("Enter user name :");
				String name=br.readLine(); 
				
				System.out.println("Enter user phone :");
				String phone=br.readLine();
				
				System.out.println("Enter user city :");
				String city=br.readLine();
				
				//create student object to store student
				User st=new User(name, phone, city);
				boolean answer=UserDao.insertStudentToDB(st);
				if(answer) {
					System.out.println("student is added successfully.....");
				}else {
					System.out.println("student is not addeded......");
				}
				System.out.println(st);
				
			}
			else if(c==8) {
				//Delete student
				System.out.println("Enter tho userId to delete:");
				int userId=Integer.parseInt(br.readLine());
				boolean f=UserDao.deleteUsertoDB(userId);
				if(f) {
					System.out.println("Delete");
				}else {
					System.out.println("Not delete");
				}
				
			}
			else if(c==7) {
				//Display student
				UserDao.showAllUser();
				
			}
			else if(c==9){
				//update student
				System.out.println("Enter the user Id to update :");
				int userId =Integer.parseInt(br.readLine());
				
				
				
				System.out.println("Enter user name :");
				String name=br.readLine(); 
				
				System.out.println("Enter user phone :");
				String phone=br.readLine();
				
				System.out.println("Enter user city :");
				String city=br.readLine();
				
				
				
				User v=new User( userId,name, phone, city);
				boolean t=UserDao.updateUser(v);
				
				if(t) {
					System.out.println("up......");
				}else {
					System.out.println("not up......");
				}
				System.out.println(v);
				
			}else if(c==10){
				
				System.out.println("Enter user id");
				int userid=Integer.parseInt(br.readLine());
			
				System.out.println("Enter book issuedate:");
				String issuedate=br.readLine();
				
				System.out.println("Enter book returndate:");
				String returndate=br.readLine();
				
				System.out.println("Enter book id:");
				int bookid=Integer.parseInt(br.readLine());
				
				IssueBook ib=new IssueBook(userid,bookid,issuedate,returndate);
				
				
				boolean answer =IssueDao.insertIssueBookToDB(ib);
				if(answer) {
					System.out.println("Success Issuebook");
				}else {
					System.out.println("not success issuebook");
				}
				
			
				
			}
			else if(c==0) {
				//Exit App
				break;
				
			}else {
				
			}
		}
		
			
		}
		

}
