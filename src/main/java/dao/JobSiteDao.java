package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.Jobsite;
import database.Database;

public class JobSiteDao {
	private Database db = null;
	private Connection connection = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	private int row = 0;
	private List<Jobsite> jobSiteTable;

	public List<Jobsite> selectAll() {
		jobSiteTable = new ArrayList<Jobsite>();

		try {
			db = new Database();
			connection = db.getConnection();
			ps = connection.prepareStatement(
					"select id,JTITLE,JDESCRIPTION,INDUSTRY,COUNTRY,CITY,JTYPE,ONSITEREMOTE,ELEVEL,companyname,email from jobsite order by id");
			rs = ps.executeQuery();
			while (rs.next()) {
				Jobsite jobsite = new Jobsite(rs.getInt("id"), rs.getString("JTITLE"), rs.getString("JDESCRIPTION"),
						rs.getString("INDUSTRY"), rs.getString("COUNTRY"), rs.getString("CITY"), rs.getString("JTYPE"),
						rs.getString("ONSITEREMOTE"), rs.getString("ELEVEL"), rs.getString("companyname"),
						rs.getString("email"));
				jobSiteTable.add(jobsite);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Database.close(rs);
			Database.close(ps);
			Database.close(connection);
		}

		return jobSiteTable;
	}

	public int selectedMaxId(Connection connection) {

		try {

			ps = connection.prepareStatement("select nvl(max(id),0) AS id from jobsite");
			rs = ps.executeQuery();
			if (rs.next()) {
				return rs.getInt("id");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finally");
			Database.close(rs);
			// Database.close(ps);

		}

		return 0;
	}

	public int insert(Jobsite jobsite) {

		try {
			db = new Database();
			connection = db.getConnection();
			int maxId = selectedMaxId(connection);
			ps = connection.prepareStatement(
					"insert into jobsite(id,JTITLE,JDESCRIPTION,INDUSTRY,COUNTRY,CITY,JTYPE,ONSITEREMOTE,ELEVEL,companyname,email) values(?,?,?,?,?,?,?,?,?,?,?)");
			int counter = 1;
			ps.setInt(counter++, maxId + 1);
			ps.setString(counter++, jobsite.getjTitle());
			ps.setString(counter++, jobsite.getjDescription());
			ps.setString(counter++, jobsite.getIndusrty());
			ps.setString(counter++, jobsite.getCountry());
			ps.setString(counter++, jobsite.getCity());
			ps.setString(counter++, jobsite.getjType());
			ps.setString(counter++, jobsite.getOnsiteRemote());
			ps.setString(counter++, jobsite.geteLevel());
			ps.setString(counter++, jobsite.getCompanyName());
			ps.setString(counter++, jobsite.getEmail());

			row = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Database.close(ps);
			Database.close(connection);
		}
		return row;
	}
	
	public List<String> selectNameIndustry() {
		List<String> nameIndustryTable = new ArrayList<String>();
		try {
			db = new Database();
			jobSiteTable = new ArrayList<Jobsite>();
			connection = db.getConnection();
			ps = connection.prepareStatement("select distinct industry_ename from industry where industry_ename is not null order by industry_ename");
			rs = ps.executeQuery();

			while (rs.next()) {
				nameIndustryTable.add(rs.getString("industry_ename"));	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Database.close(rs);
			Database.close(ps);
			Database.close(connection);
		}

		return nameIndustryTable;

	}
	
	public List<String> selectNameCountry() {
		List<String> nameCountryTable = new ArrayList<String>();
		try {
			db = new Database();
			jobSiteTable = new ArrayList<Jobsite>();
			connection = db.getConnection();
			ps = connection.prepareStatement("select distinct country_ename from country where COUNTRY_ENAME is not null order by COUNTRY_ENAME");
			rs = ps.executeQuery();

			while (rs.next()) {
				nameCountryTable.add(rs.getString("COUNTRY_ENAME"));	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Database.close(rs);
			Database.close(ps);
			Database.close(connection);
		}

		return nameCountryTable;

	}
	
	public List<String> selectNameCity() {
		List<String> nameCityTable = new ArrayList<String>();
		try {
			db = new Database();
			jobSiteTable = new ArrayList<Jobsite>();
			connection = db.getConnection();
			ps = connection.prepareStatement("select distinct city_ename from city where city_ename is not null order by city_ename");
			rs = ps.executeQuery();

			while (rs.next()) {
				nameCityTable.add(rs.getString("city_ename"));	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Database.close(rs);
			Database.close(ps);
			Database.close(connection);
		}

		return nameCityTable;

	}

}
