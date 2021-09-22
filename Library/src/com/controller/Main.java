package com.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.dao.BookDao;
import com.dao.UserDao;
import com.model.Book;
import com.model.User;

public class Main {
	
	private static final Main bk=null;
	public Main(String name, String code, String price) {
		
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to student library details add ");
		System.out.println(" ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("Press 1 to Add new book");
			System.out.println("Press 2 to Delete book");
			System.out.println("Press 3 to Display book");
			System.out.println("Press 4 to Update book");
			System.out.println("Press 5 to Add new member");
			System.out.println("Press 6 to Delete member");
			System.out.println("Press 7 to Display member");
			System.out.println("Press 8 to Update member");
			System.out.println("Press 9 to Issue book");
			System.out.println("Press 0 to Exit App");
			int c=Integer.parseInt(br.readLine());
			
			if(c==1) {
				System.out.println("Enter book name:");
				String name=br.readLine();
				
				System.out.println("Enter book code:");
				String code=br.readLine();
				
				System.out.println("Enter book price:");
				String price=br.readLine();
				
				Book bk=new Book(name, code, price);
				boolean answer =BookDao.insertBookToDB(bk);
				if(answer) {
					System.out.println("Success add book");
				}else {
					System.out.println("not success");
				}
				System.out.println(bk);
			}
			
			
			//Delete book
			if(c==2) {
				System.out.println("Enter tho bookId to delete:");
				int bookId=Integer.parseInt(br.readLine());
				boolean f=BookDao.deleteBooktoDB(bookId);
				if(f) {
					System.out.println("Delete");
				}else {
					System.out.println("Not delete");
				}
				
			}
			if(c==3) {
				BookDao.showAllBook();
			}
			else if(c==4){
				//update book
				System.out.println("Enter the book Id to update :");
				int userId =Integer.parseInt(br.readLine());
				
				
				
				System.out.println("Enter book name :");
				String name=br.readLine(); 
				
				System.out.println("Enter book code :");
				String code=br.readLine();
				
				System.out.println("Enter book price :");
				String price=br.readLine();
				
				
				Book v=new Book( userId,name, code, price);
				boolean t=BookDao.updatebook(v);
				
				if(t) {
					System.out.println("up......");
				}else {
					System.out.println("not up......");
				}
				System.out.println(v);
				
			}
			if(c==5) {
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
			else if(c==6) {
				//Delete student
				System.out.println("Enter the user Id to delete :");
				int userId=Integer.parseInt(br.readLine());
				boolean f=UserDao.deleteUser(userId);
				if(f) {
					System.out.println("Delete......");
				}else {
					System.out.println("not Delete......");
				}
				
			}
			else if(c==7) {
				//Display student
				UserDao.showAllUser();
				
			}
			else if(c==8){
				//update student
				System.out.println("Enter the student Id to update :");
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
				
			}
			else if(c==0) {
				//Exit App
				break;
				
			}else {
				
			}
		}
		
			
		}
		

}
