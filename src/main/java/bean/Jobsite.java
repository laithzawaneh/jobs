package bean;

public class Jobsite {

	private int id;
	private String jTitle;
	private String jDescription;
	private String indusrty;
	private String country;
	private String city;
	private String jType;
	private String onsiteRemote;
	private String eLevel;
	private String companyName;
	private String email;
	private Jobsite jobsite;
	private Industry Industry;
	private Country countries;
	private City cities;

	public Jobsite() {
		super();
	}

	public Jobsite(int id, String jTitle, String jDescription, String indusrty, String country, String city,
			String jType, String onsiteRemote, String eLevel, String companyName, String email) {
		super();
		this.id = id;
		this.jTitle = jTitle;
		this.jDescription = jDescription;
		this.indusrty = indusrty;
		this.country = country;
		this.city = city;
		this.jType = jType;
		this.onsiteRemote = onsiteRemote;
		this.eLevel = eLevel;
		this.companyName = companyName;
		this.email = email;

	}

	public Jobsite getJobsite() {
		return jobsite;
	}

	public void setJobsite(Jobsite jobsite) {
		this.jobsite = jobsite;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getjTitle() {
		return jTitle;
	}

	public void setjTitle(String jTitle) {
		this.jTitle = jTitle;
	}

	public String getjDescription() {
		return jDescription;
	}

	public void setjDescription(String jDescription) {
		this.jDescription = jDescription;
	}

	public String getIndusrty() {
		return indusrty;
	}

	public void setIndusrty(String indusrty) {
		this.indusrty = indusrty;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getjType() {
		return jType;
	}

	public void setjType(String jType) {
		this.jType = jType;
	}

	public String getOnsiteRemote() {
		return onsiteRemote;
	}

	public void setOnsiteRemote(String onsiteRemote) {
		this.onsiteRemote = onsiteRemote;
	}

	public String geteLevel() {
		return eLevel;
	}

	public void seteLevel(String eLevel) {
		this.eLevel = eLevel;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Industry getIndustry() {
		return Industry;
	}

	public void setIndustry(Industry industry) {
		this.Industry = industry;
	}

	public Country getCountries() {
		return countries;
	}

	public void setCountries(Country countries) {
		this.countries = countries;
	}

	public City getCities() {
		return cities;
	}

	public void setCities(City cities) {
		this.cities = cities;
	}

	@Override
	public String toString() {
		return "Jobsite [id=" + id + ", jTitle=" + jTitle + ", jDescription=" + jDescription + ", indusrty=" + indusrty
				+ ", country=" + country + ", city=" + city + ", jType=" + jType + ", onsiteRemote=" + onsiteRemote
				+ ", eLevel=" + eLevel + ", companyName=" + companyName + ", email=" + email + ", jobsite=" + jobsite
				+ "]";
	}

}
