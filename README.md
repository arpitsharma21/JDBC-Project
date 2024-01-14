## To connect Java application with the MySQL database, we need to follow 5 following step:
 - Load the driver class.
       Class.forName("com.mysql.cj.jdbc.Driver");
 - Create Connection using DriverManager.
        String user = "root";
			 String password = "password";
			 String url = "jdbc:mysql://localhost:3306/student_manage";
			 con = DriverManager.getConnection(url,user,password); 
 - Use connection to fire queries{Statement is used for static queies and PreparedStatement is used for dynamic queries).
 - Process the result (comes in ResultSet i.e in display or getting all data.
 - Close the Connection
