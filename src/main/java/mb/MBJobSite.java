package mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import bean.Jobsite;
import dao.JobSiteDao;

@SessionScoped
@ManagedBean(name = "mbJobSite")
public class MBJobSite {
	private List<Jobsite> jobSiteTable; 
	private List<Jobsite> filterdJobTable;
	private JobSiteDao jobSiteDAO;
	private Jobsite selectedJobSite;
	private List<Jobsite> multipleSlectedjobsite;
	
	
	@PostConstruct
	public void init() {
		jobSiteDAO = new JobSiteDao();
		jobSiteTable = jobSiteDAO.selectAll();
		selectedJobSite = new Jobsite();
	}

	public List<Jobsite> getJobSiteTable() {
		return jobSiteTable;
	}

	public void setJobSiteTable(List<Jobsite> jobSiteTable) {
		this.jobSiteTable = jobSiteTable;
	}

	public JobSiteDao getJobSiteDAO() {
		return jobSiteDAO;
	}

	public void setJobSiteDAO(JobSiteDao jobSiteDAO) {
		this.jobSiteDAO = jobSiteDAO;
	}

	public Jobsite getSelectedJobSite() {
		return selectedJobSite;
	}

	public void setSelectedJobSite(Jobsite selectedJobSite) {
		this.selectedJobSite = selectedJobSite;
	}

	public List<Jobsite> getMultipleSlectedjobsite() {
		return multipleSlectedjobsite;
	}

	public void setMultipleSlectedjobsite(List<Jobsite> multipleSlectedjobsite) {
		this.multipleSlectedjobsite = multipleSlectedjobsite;
	}

	public List<Jobsite> getFilterdJobTable() {
		return filterdJobTable;
	}

	public void setFilterdJobTable(List<Jobsite> filterdJobTable) {
		this.filterdJobTable = filterdJobTable;
	}
	


}
