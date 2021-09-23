package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.connect.CP;
import com.controller.Main;
import com.model.Author;
import com.model.Book;
import com.model.IssueBook;

public class BookDao {

	public static boolean insertBookToDB(Book bk) {
		// TODO Auto-generated method stub
		boolean f=false;
		try {
			Connection con=CP.createC();
			String q="insert into book (bname,bcode,bprice,authorid) values(?,?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(q);
			pstmt.setString(1,  bk.getBookName());
			pstmt.setString(2, bk.getBookCode());
			pstmt.setString(3, bk.getBookPrice());
			pstmt.setInt(4, bk.getAuthorId());
			
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
				String price=set.getNString(4);
				int authorid =set.getInt(5);
				
				System.out.println("Book ID : "+id);
				System.out.println("Book Name : "+name);
				System.out.println("Book Code : "+code);
				System.out.println("Book Price : "+price);
				System.out.println("Author ID : "+authorid);
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
			String q="update user set bname=? , bcode=? ,bprice=? , authorid=? where bid=?";
			//preparedStatement
			PreparedStatement pstmt=con.prepareStatement(q);
			//set the values parameters
			pstmt.setString(1, v.getBookName());
			pstmt.setString(2, v.getBookCode());
			pstmt.setString(3, v.getBookPrice());
			pstmt.setInt(4, v.getAuthorId());
			
			//execute
			pstmt.executeUpdate();
			t=true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return t;
	}

//	public static boolean insertBookToDB(Main bk) {
//		// TODO Auto-generated method stub
//		return false;
//	}
	
//	public static boolean issuebook(IssueBook is)
//	{
//		boolean s= false;
//  	}

	
//	public static boolean insertAuthorToDB(Author au) {
//		// TODO Auto-generated method stub
//		boolean f= false;
//		try {
//			Connection con=CP.createC();
//			String q="insert into author (aname, amobile) values(?,?)";
//			PreparedStatement pstmt=con.prepareStatement(q);
//			//pstmt.setInt(1, au.getAuthorid());
//			pstmt.setString(1, au.getAuthorName());
//			pstmt.setString(2, au.getAuthormobile());
//			
//			
//			pstmt.executeUpdate();
//			f=true;
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		return f;
//
//	}
	

}
