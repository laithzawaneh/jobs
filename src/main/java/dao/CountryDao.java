package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.Country;
import database.Database;

public class CountryDao {

	private Database db = null;
	private Connection connection = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	private int row = 0;
	private List<Country> countryTable;

	public List<Country> selectAll() {
		countryTable = new ArrayList<Country>();

		try {
			db = new Database();
			connection = db.getConnection();
			ps = connection.prepareStatement(
					"select COUNTRY_ID,COUNTRY_ANAME,COUNTRY_ENAME from country order by COUNTRY_ID");
			rs = ps.executeQuery();
			while (rs.next()) {
				Country country = new Country(rs.getInt("COUNTRY_ID"), rs.getString("COUNTRY_ANAME"), rs.getString("COUNTRY_ENAME"));
				countryTable.add(country);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Database.close(rs);
			Database.close(ps);
			Database.close(connection);
		}

		return countryTable;
	}
}
