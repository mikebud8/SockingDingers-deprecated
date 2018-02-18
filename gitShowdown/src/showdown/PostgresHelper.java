package showdown;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PostgresHelper {

	private Connection conn;
	private String host;
	private String dbName;
	private String user;
	private String pass;
	
	//we don't like this constructor
	protected PostgresHelper() {}
	
	public PostgresHelper(String host, String dbName, String user, String pass) {
		this.host = host;
		this.dbName = dbName;
		this.user = user;
		this.pass = pass;
	}
	
	public boolean connect() throws SQLException, ClassNotFoundException {
		if (host.isEmpty() || dbName.isEmpty() || user.isEmpty() || pass.isEmpty()) {
			throw new SQLException("Database credentials missing");
		}
		
		Class.forName("org.postgresql.Driver");
		this.conn = DriverManager.getConnection(
				this.host + this.dbName,
				this.user, this.pass);
		return true;
	}
	
	public ResultSet execQuery(String query) throws SQLException {
		return this.conn.createStatement().executeQuery(query);
	}
}