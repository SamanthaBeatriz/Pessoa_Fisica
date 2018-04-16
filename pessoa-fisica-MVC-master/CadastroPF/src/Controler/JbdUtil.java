package Controler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JbdUtil {
	private static String connectionDriverClass = "com.mysql.jdbc.Driver";
	private static String connectionUrl = "jdbc:mysql://localhost/atividadepf";
	private static String connectionUsername = "root";
	private static String connectionPassword = "";
	private static Connection conn;

	public static Connection getConnection() throws SQLException, ClassNotFoundException {

		if (JbdUtil.conn != null) {
			return JbdUtil.conn;
		} else {
			Class.forName(connectionDriverClass);
			return DriverManager.getConnection(JbdUtil.connectionUrl, JbdUtil.connectionUsername,
					JbdUtil.connectionPassword);
		}
	}

}
