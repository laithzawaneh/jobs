package bean;

public class City {
	
	private int countryId;
	private int cityId;
	private String aName;
	private String eName;
	public City() {
		super();
	}
	public City(int countryId, int cityId, String aName, String eName) {
		super();
		this.countryId = countryId;
		this.cityId = cityId;
		this.aName = aName;
		this.eName = eName;
	}
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	@Override
	public String toString() {
		return "City [countryId=" + countryId + ", cityId=" + cityId + ", aName=" + aName + ", eName=" + eName + "]";
	}
	
	
}
