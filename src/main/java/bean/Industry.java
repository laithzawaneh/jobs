package bean;

public class Industry {

	private int industryId;
	private String aName;
	private String eName;
	public Industry() {
		super();
	}
	public Industry(int industryId, String aName, String eName) {
		super();
		this.industryId = industryId;
		this.aName = aName;
		this.eName = eName;
	}
	public int getIndustryId() {
		return industryId;
	}
	public void setIndustryId(int industryId) {
		this.industryId = industryId;
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
		return "Industry [industryId=" + industryId + ", aName=" + aName + ", eName=" + eName + "]";
	}
	
	
}
