package bean;

public class Country {
	private int id;
	private String aName;
	private String eName;
	public Country() {
		super();
	}
	public Country(int id, String aName, String eName) {
		super();
		this.id = id;
		this.aName = aName;
		this.eName = eName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
		return "Country [id=" + id + ", aName=" + aName + ", eName=" + eName + "]";
	}

	

}
