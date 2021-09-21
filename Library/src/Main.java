//package com.student.manage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.StudentDao;

public class Main {

	private static final Main st = null;

	public Main(String name, String phone, String city) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to student management app");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("Press 1 to Add student");
			System.out.println("Press 2 to Delete student");
			System.out.println("Press 3 to Display student");
			System.out.println("Press 4 to Update student");
			System.out.println("Press 5 to Exit App");
			int c=Integer.parseInt(br.readLine());
			
			if(c==1) {
				//Add student.....
				System.out.println("Enter user name :");
				String name=br.readLine(); 
				
				System.out.println("Enter user phone :");
				String phone=br.readLine();
				
				System.out.println("Enter user city :");
				String city=br.readLine();
				
				//create student object to store student
				Student st=new Student(name, phone, city);
				boolean answer=StudentDao.insertStudentToDB(st);
				if(answer) {
					System.out.println("student is added successfully.....");
				}else {
					System.out.println("student is not addeded......");
				}
				System.out.println(st);
				
			}else if(c==2) {
				//Delete student
				System.out.println("Enter the student Id to delete :");
				int userId=Integer.parseInt(br.readLine());
				boolean f=StudentDao.deleteStudent(userId);
				if(f) {
					System.out.println("Delete......");
				}else {
					System.out.println("not Delete......");
				}
				
			}else if(c==3) {
				//Display student
				StudentDao.showAllStudent();
				
			}else if(c==4){
				//update student
				System.out.println("Enter the student Id to update :");
				int userId =Integer.parseInt(br.readLine());
				
				
				
				System.out.println("Enter user name :");
				String name=br.readLine(); 
				
				System.out.println("Enter user phone :");
				String phone=br.readLine();
				
				System.out.println("Enter user city :");
				String city=br.readLine();
				
				
				
				Student v=new Student( userId,name, phone, city);
				boolean t=StudentDao.updateStudent(v);
				
				if(t) {
					System.out.println("up......");
				}else {
					System.out.println("not up......");
				}
				System.out.println(v);
				
			}else if(c==5) {
				//Exit App
				break;
				
			}else {
				
			}
		}
		System.out.println("Thanku for using my application........");
	}

}
