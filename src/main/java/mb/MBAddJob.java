package mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import bean.City;
import bean.Country;
import bean.Industry;
import bean.Jobsite;
import dao.CityDao;
import dao.CountryDao;
import dao.IndustryDao;
import dao.JobSiteDao;

@ManagedBean(name = "mbAddJob")
@ViewScoped
public class MBAddJob {

	private Jobsite jobsite;
	private List<Jobsite> jobSiteTable;
	private JobSiteDao jobDao;
	private List<Industry> industryTable;
	private List<String> nameIndustryTable;
	private List<Country> countryTable;
	private List<String> nameCountryTable;
	private List<City> cityTable;
	private List<String> nameCityTable;

	@PostConstruct
	public void init() {
		jobDao = new JobSiteDao();
		jobSiteTable = jobDao.selectAll();
		
		nameIndustryTable = jobDao.selectNameIndustry();
		nameCountryTable = jobDao.selectNameCountry();
		nameCityTable = jobDao.selectNameCity();

		IndustryDao industryDao = new IndustryDao();
		industryTable = industryDao.selectAll();
		
		CountryDao countryDao = new CountryDao();
		countryTable = countryDao.selectAll();
				
		CityDao cityDao = new CityDao();
		cityTable = cityDao.selectAll();
		
		
		
	}
	
	public String save() {

		jobDao.insert(jobsite);
		// Message.addMessage("INFO", "Adding Employee", "Employee added successfully");

		jobsite = new Jobsite();
//		jobsite.setJobsite(new Jobsite());
		return null;
	}
	
//	public void onCountryChenged() {
//		nameCityTable
//	}

	public Jobsite getJobsite() {
		if (jobsite == null) {
			jobsite = new Jobsite();
		}
		return jobsite;
	}

	public void setJobsite(Jobsite jobsite) {
		this.jobsite = jobsite;
	}

	public List<Jobsite> getJobSiteTable() {
		return jobSiteTable;
	}

	public void setJobSiteTable(List<Jobsite> jobSiteTable) {
		this.jobSiteTable = jobSiteTable;
	}

	public JobSiteDao getJobDao() {
		return jobDao;
	}

	public void setJobDao(JobSiteDao jobDao) {
		this.jobDao = jobDao;
	}

	public List<Industry> getIndustryTable() {
		return industryTable;
	}

	public void setIndustryTable(List<Industry> industryTable) {
		this.industryTable = industryTable;
	}

	public List<String> getNameIndustryTable() {
		return nameIndustryTable;
	}

	public void setNameIndustryTable(List<String> nameIndustryTable) {
		this.nameIndustryTable = nameIndustryTable;
	}

	public List<Country> getCountryTable() {
		return countryTable;
	}

	public void setCountryTable(List<Country> countryTable) {
		this.countryTable = countryTable;
	}

	public List<String> getNameCountryTable() {
		return nameCountryTable;
	}

	public void setNameCountryTable(List<String> nameCountryTable) {
		this.nameCountryTable = nameCountryTable;
	}

	public List<City> getCityTable() {
		return cityTable;
	}

	public void setCityTable(List<City> cityTable) {
		this.cityTable = cityTable;
	}

	public List<String> getNameCityTable() {
		return nameCityTable;
	}

	public void setNameCityTable(List<String> nameCityTable) {
		this.nameCityTable = nameCityTable;
	}	

}
