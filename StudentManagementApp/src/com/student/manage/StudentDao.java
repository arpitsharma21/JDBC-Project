package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
	
	public static boolean insertStudentToDB(Student st) {
		 
		 boolean  f = false;
		 try {
			//jdbc code 
			 Connection con = ConnectionProvider.createC();
			 String q = "insert into student(sname,sphone,scity) values(?,?,?)";
			 //Prepared Statement used for dynamic queries
			 PreparedStatement pstmt = con.prepareStatement(q);
			 //set the values of params
			 pstmt.setString(1,st.getStudenName());
			 pstmt.setString(2, st.getStudentPhone());
			 pstmt.setString(3, st.getStudentCity());
			 
			 //execute
			 pstmt.executeUpdate(); // as it is not returning any data
			 f = true;
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
		 
		 return f;
	 }

	public static boolean deleteStudent(int userId) {
		 boolean  f = false;
		 try {
			//jdbc code 
			 Connection con = ConnectionProvider.createC();
			 String q = "delete from student where sid =?";
			 //Prepared Statement used for dynamic queries
			 PreparedStatement pstmt = con.prepareStatement(q);
			 //set the values of params
			 pstmt.setInt(1,userId);
			 
			 //execute
			 pstmt.executeUpdate(); // as it is not returning any data
			 f = true;
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
		 
		 return f; 
		
	}

	public static void showAllStudents() {
		
		 try {
			//jdbc code 
			 Connection con = ConnectionProvider.createC();
			 String q = "select * from student";
			//Statement is used for static queries
			 Statement stmt = con.createStatement();
			 
			  ResultSet set = stmt.executeQuery(q);
			 System.out.println("Students in database are: ");
			 while(set.next()) {
				 int id = set.getInt(1);
				 String name = set.getString(2);
				 String phone = set.getString(3);
				 String city = set.getString("scity");
				 
				 System.out.println("ID: "+ id);
				 System.out.println("Name: "+ name);
				 System.out.println("Phone: "+ phone);
				 System.out.println("City: "+ city);
				 System.out.println("+++++++++++++++++++++++++++++++++++");
				 
			 }
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }		
	}

}
