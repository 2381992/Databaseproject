package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver"); //java database connection 
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "root");
//root =username;root=password		
		Statement stm = con.createStatement();//import from mysql
		
		ResultSet result = stm.executeQuery("select * from eproduct");//give throws
		
		while(result.next()) {
			
			System.out.println(result.getInt("ID"));
			System.out.println(result.getString("name"));
			System.out.println(result.getDouble("price"));
			System.out.println(result.getTimestamp("date_added"));
			
		}


	}

}
