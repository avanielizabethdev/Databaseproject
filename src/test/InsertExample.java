package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class InsertExample {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Manage the connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "root");  
		
		Statement stm = con.createStatement();
		
		//To insert data
		
	
		stm.executeUpdate("insert into eproduct(name, price, date_added) values('Tablet', 1500, now())");
		ResultSet result = stm.executeQuery("select * from eproduct");
		
		while(result.next()) {
			System.out.println(result.getString("name"));
		}
		
		con.close();

	}

}
