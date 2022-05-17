package transport;

import java.util.* ;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	private static String Titre;
	private static String prix;
	private static String Id;
	 static final String DB_URL = "jdbc:mysql://localhost:3306/transportdb";
	   static final String USER = "root";
	   static final String PASS = "Sousou54181140@";
	   static final String QUERY = "SELECT *  FROM modetransport";

	public static void main(String[] args)  {
	
		 // Open a connection
	      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	         Statement stmt = conn.createStatement();
	      ) {		      
	         // Execute a query
	         System.out.println("Inserting records into the table...");          
	         String sql = "INSERT INTO modetransport VALUES (100, 'Car', 20)";
	         stmt.executeUpdate(sql);
	         sql = "INSERT INTO modetransport VALUES (101, 'Bus', 45)";
	         stmt.executeUpdate(sql);
	         sql = "INSERT INTO modetransport VALUES (102, 'Taxi', 25)";
	         stmt.executeUpdate(sql);
	         sql = "INSERT INTO modetransport VALUES(103, 'Avion', 400)";
	         stmt.executeUpdate(sql);
	         System.out.println("Inserted records into the table...");   	  
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } 
	      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	    	         Statement stmt = conn.createStatement();
	    	         ResultSet rs = stmt.executeQuery(QUERY);
	    	      ) {		      
	    	         while(rs.next()){
	    	            //Display values
	    	            System.out.println("Id: " + rs.getInt("id"));
	    	            System.out.println("");
	    	            System.out.println("Titre: " + rs.getString("Titre"));
	    	            System.out.println("");
	    	            System.out.println("prix : " + rs.getInt("prix"));
	    	            System.out.println("");
	    	         }
	    	      } catch (SQLException e) {
	    	         e.printStackTrace();
	    	      } 
	}
	
}
