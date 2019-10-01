package Javapackage.dbconnectivity;

public class ReadMeFirst {
	
	/*


	 * JDBC :: 5 steps
	 * 
	 * 1. Register with database driver class ::
	 *
	 * 		Class.forName(String driverClass);

	 * Oracle :: oracle.jdbc.driver.OracleDriver
	 * MySQL :: com.mysql.jdbc.Driver
	 * 
	 * 2. get connection with database ::
	 *
	 * 		Connection con = DriverManager.getConnection(url, username, paswword);
	 * 
	 * url :: jdbc:oracle:thin:username@/hostname:port/servicename
	 * oracle db url :: jdbc:oracle:thin:hr@/localhost:1521/orclpdb
	 * username :: hr
	 * password :: hr
	 * 
	 * Mysql ::
	 * String url = "jdbc:mysql://localhost:3306/mysql";
		String userName = "root";
		String password = "root";
	 * 
	 * 3. Create a statement ::
	 *
	 * 		Statement stmt = con.createStatement();
	 * 
	 * 4. execute query ::

	 * 		ResultSet rs = stmt.executeQuery(sqlquery);
	 * 
	 * 		while(rs.next()){
	 *          System.out.println();
	 * 		}
	 * 
	 * 5. close db connection
	 * 		con.close();
	 *  	
	 *  
	 */
	
	

}
