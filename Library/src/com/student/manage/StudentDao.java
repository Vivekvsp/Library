package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
	
	public static boolean insertStudentToDB(Student st) {
		
		boolean f=false;
		try {
			//jdbc code....
			Connection con=CP.createC();
			String q="insert into students(sname,sphone,scity) values(?,?,?)";
			//preparedStatement
			PreparedStatement pstmt=con.prepareStatement(q);
			//set the values parameters
			pstmt.setString(1, st.getStudentName());
			pstmt.setString(2, st.getStuedentPhone());
			pstmt.setNString(3, st.getStudentCity());
			
			//execute
			pstmt.executeUpdate();
			f=true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static boolean deleteStudent(int userId) {
		boolean f=false;
		try {
			//jdbc code....
			Connection con=CP.createC();
			String q="delete from students where sid=?";
			//preparedStatement
			PreparedStatement pstmt=con.prepareStatement(q);
			//set the values parameters
			pstmt.setInt(1, userId);
			
			//execute
			pstmt.executeUpdate();
			f=true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
		
	}

	public static void showAllStudent() {
		
		boolean f=false;
		try {
			//jdbc code....
			Connection con=CP.createC();
			String q="select * from students ";
			Statement stmt=con.createStatement();
			
			ResultSet set=stmt.executeQuery(q);
			while(set.next()) {
				int id =set.getInt(1);
				String name=set.getString(2);
				String phone=set.getNString(3);
				String city=set.getNString("scity");
				
				System.out.println("ID : "+id);
				System.out.println("Name : "+name);
				System.out.println("Phone : "+phone);
				System.out.println("City : "+city);
				System.out.println("++++++++++++++++++++++++++++++++");
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean updateStudent(Student v) {
		boolean t=false;
		try {
			//jdbc code....
			Connection con=CP.createC();
			String q="update students set sname=? , sphone=? , scity=?  where sid=?";
			//preparedStatement
			PreparedStatement pstmt=con.prepareStatement(q);
			//set the values parameters
			pstmt.setString(1, v.getStudentName());
			pstmt.setString(2, v.getStuedentPhone());
			pstmt.setNString(3, v.getStudentCity());
			pstmt.setInt(4, v.getStudentId());
			
			//execute
			pstmt.executeUpdate();
			t=true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return t;
		
	}

	
}
