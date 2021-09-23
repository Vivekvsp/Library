package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.connect.CP;
import com.model.User;

public class UserDao {

	public static boolean insertStudentToDB(User st) {
		// TODO Auto-generated method stub
		boolean f= false;
		try {
			//jdbc code....
			Connection con=CP.createC();
			String q="insert into user(uname,uphone,ucity) values(?,?,?)";
			//preparedStatement
			PreparedStatement pstmt=con.prepareStatement(q);
			//set the values parameters
			pstmt.setString(1, st.getUserName());
			pstmt.setString(2, st.getUserPhone());
			pstmt.setNString(3, st.getUserCity());
			
			//execute
			pstmt.executeUpdate();
			f=true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static boolean deleteUser(int userId) {
		// TODO Auto-generated method stub
		boolean f= false;
		try {
			//jdbc code....
			Connection con=CP.createC();
			String q="delete from user where sid=?";
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

	public static void showAllUser() {
		// TODO Auto-generated method stub
		boolean f=false;
		try {
			//jdbc code....
			Connection con=CP.createC();
			String q="select * from user ";
			Statement stmt=con.createStatement();
			
			ResultSet set=stmt.executeQuery(q);
			while(set.next()) {
				int id =set.getInt(1);
				String name=set.getString(2);
				String phone=set.getNString(3);
				String city=set.getNString("ucity");
								
				System.out.println("User ID : "+id);
				System.out.println("User Name : "+name);
				System.out.println("User Phone : "+phone);
				System.out.println("USer City : "+city);
				System.out.println("++++++++++++++++++++++++++++++++");
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static boolean updateUser(User v) {
		// TODO Auto-generated method stub
		boolean t= false;
		try {
			//jdbc code....
			Connection con=CP.createC();
			String q="update user set uname=? , uphone=? , ucity=?  where uid=?";
			//preparedStatement
			PreparedStatement pstmt=con.prepareStatement(q);
			//set the values parameters
			pstmt.setString(1, v.getUserName());
			pstmt.setString(2, v.getUserPhone());
			pstmt.setNString(3, v.getUserCity());
			pstmt.setInt(4, v.getUserId());
			
			//execute
			pstmt.executeUpdate();
			t=true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return t;
	}

	
	

}
