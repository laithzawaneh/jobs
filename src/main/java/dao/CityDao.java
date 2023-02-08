package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.City;
import database.Database;

public class CityDao {

	private Database db = null;
	private Connection connection = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	private int row = 0;
	private List<City> cityTable;

	public List<City> selectAll() {
		cityTable = new ArrayList<City>();

		try {
			db = new Database();
			connection = db.getConnection();
			ps = connection.prepareStatement(
					"select COUNTRY_ID,CITY_ID,CITY_ANAME,CITY_ENAME from city order by COUNTRY_ID");
			rs = ps.executeQuery();
			while (rs.next()) {
				City city = new City(rs.getInt("COUNTRY_ID"),rs.getInt("CITY_ID"), rs.getString("CITY_ANAME"), rs.getString("CITY_ENAME"));
				cityTable.add(city);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Database.close(rs);
			Database.close(ps);
			Database.close(connection);
		}

		return cityTable;
	}
}
