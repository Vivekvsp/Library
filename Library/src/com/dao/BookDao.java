package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.connect.CP;
import com.model.Book;

public class BookDao {

	public static boolean insertBookToDB(Book bk) {
		// TODO Auto-generated method stub
		boolean f=false;
		try {
			Connection con=CP.createC();
			String q="insert into book (bname,bcode) values(?,?)";
			PreparedStatement pstmt=con.prepareStatement(q);
			pstmt.setString(1,  bk.getBookName());
			pstmt.setString(2, bk.getBookCode());
			
			pstmt.executeUpdate();
			f=true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static boolean deleteBooktoDB(int bookId) {
		// TODO Auto-generated method stub
		boolean f= false;
		try {
		Connection con=CP.createC();
		String q="delete from book where bid=?";
		PreparedStatement pstmt=con.prepareStatement(q);
		try {
			pstmt.setInt(1, bookId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		pstmt.executeUpdate();
		f=true;
		}catch(Exception e){
			e.printStackTrace();
		}
		return f;

	}

	public static void showAllBook() {
		// TODO Auto-generated method stub
		boolean f=false;
		try {
			//jdbc code....
			Connection con=CP.createC();
			String q="select * from book ";
			Statement stmt=con.createStatement();
			
			ResultSet set=stmt.executeQuery(q);
			while(set.next()) {
				int id =set.getInt(1);
				String name=set.getString(2);
				String code=set.getNString(3);
				
				System.out.println("ID : "+id);
				System.out.println("Name : "+name);
				System.out.println("Phone : "+code);
				System.out.println("++++++++++++++++++++++++++++++++");
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}

	public static boolean updatebook(Book v) {
		// TODO Auto-generated method stub
		boolean t= false;
		try {
			//jdbc code....
			Connection con=CP.createC();
			String q="update students set bname=? , bcode=?  where bid=?";
			//preparedStatement
			PreparedStatement pstmt=con.prepareStatement(q);
			//set the values parameters
			pstmt.setString(1, v.getBookName());
			pstmt.setString(2, v.getBookCode());
			
			//execute
			pstmt.executeUpdate();
			t=true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return t;
	}

}
