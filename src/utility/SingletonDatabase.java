package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import model.company.Company;
import model.engine.EngineType;
import model.manufacturer.Manufactures;

public class SingletonDatabase {

	private static Connection connection;

	private static String jdbcUrl;
	private static String jdbcDriver;
	private static String dbUserName;
	private static String dbPassword;

	private SingletonDatabase() {
	}

	private static Connection getDBConnection() {

		Connection connection = null;

		try {
			Class.forName(jdbcDriver);
			connection = DriverManager.getConnection(jdbcUrl, dbUserName, dbPassword);
		} catch (ClassNotFoundException cfne) {
			System.err.println(cfne.getMessage());
		} catch (SQLException sqle) {
			System.err.println(sqle.getMessage());
		}
		return connection;
	}

	public static Connection getConnection() {
		return ((connection != null) ? connection : getDBConnection());
	}

	public static void insertRecord(Manufactures manufacturer, Company company, EngineType engineType, String driver,
			String url, String userName, String password) {

		jdbcUrl = url;
		jdbcDriver = driver;
		dbUserName = userName;
		dbPassword = password;

		try {
			connection = getDBConnection();

			if (connection != null) {

				String sql = "insert into myaircraft"
						+ "(companyName, companyICAO, manufacturer, aircraftType, engineType, aircraftPrice) "
						+ "values (?,?,?,?,?,?)";

				PreparedStatement prep = connection.prepareStatement(sql);

				prep.setString(1, company.viewCompanyName());
				prep.setString(2, company.viewICAO());
				prep.setString(3, manufacturer.viewManufacturer());
				prep.setString(4, manufacturer.getAircraft().viewAircraftType());
				prep.setString(5, engineType.viewEngine());
				prep.setDouble(6, manufacturer.getAircraft().viewAircraftPrice());

				prep.executeUpdate();

			}

		} catch (SQLException sqle) {
			System.err.println(sqle.getMessage());
		}

	}

	public static void deleteRecord(String driver, String url, String userName, String password) {

		jdbcUrl = url;
		jdbcDriver = driver;
		dbUserName = userName;
		dbPassword = password;

		try {
			connection = getDBConnection();

			if (connection != null) {

				Statement stmt = connection.createStatement();

				String sql;

				sql = "TRUNCATE myaircraft";
				stmt.executeUpdate(sql);

				sql = "DELETE FROM myaircraft";
				stmt.executeUpdate(sql);

			}

		} catch (SQLException sqle) {
			System.err.println(sqle.getMessage());
		}

	}

}
