package showdown;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException {
		
		PostgresHelper client = new PostgresHelper(
				DbContract.HOST, 
				DbContract.DB_NAME,
				DbContract.USERNAME,
				DbContract.PASSWORD);
		
		try {
			if (client.connect()) {
				System.out.println("DB connected");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		ResultSet rs = client.execQuery("SELECT * FROM weather");

		while(rs.next()) {
			
			System.out.printf("%s\t%d\t%d\t%d\n",
					
					rs.getString(1),
					rs.getInt(2),
					rs.getInt(3),
					rs.getInt(4));
		}

	}

}