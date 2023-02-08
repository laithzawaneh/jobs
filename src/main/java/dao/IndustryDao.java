package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.Industry;
import database.Database;

public class IndustryDao {
	private Database db = null;
	private Connection connection = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	private int row = 0;
	private List<Industry> industryTable;

	public List<Industry> selectAll() {
		industryTable = new ArrayList<Industry>();

		try {
			db = new Database();
			connection = db.getConnection();
			ps = connection.prepareStatement(
					"select INDUSTRY_ID,INDUSTRY_ANAME,INDUSTRY_ENAME from INDUSTRY order by INDUSTRY_ID");
			rs = ps.executeQuery();
			while (rs.next()) {
				Industry industry = new Industry(rs.getInt("INDUSTRY_ID"), rs.getString("INDUSTRY_ANAME"),
						rs.getString("INDUSTRY_ENAME"));
				industryTable.add(industry);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Database.close(rs);
			Database.close(ps);
			Database.close(connection);
		}

		return industryTable;
	}
}
