package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.connect.CP;
import com.model.Author;

public class AuthorDao {
	public static boolean insertAuthorToDB(Author au) {
		// TODO Auto-generated method stub
		boolean f= false;
		try {
			Connection con=CP.createC();
			String q="insert into author(aname, amobile) values(?,?)";
			PreparedStatement pstmt=con.prepareStatement(q);
	
			pstmt.setString(1,au.getaName());
			pstmt.setString(2,au.getaMoblie());
			
			System.out.println(" "+au);
			int i=pstmt.executeUpdate();
			System.out.println("result "+i);
			f=true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return f;

	}

}
