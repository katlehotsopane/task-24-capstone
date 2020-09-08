package poised;

/*
 *
 * writen by wilson
 */
// Function: this is a public class with methods that are to be used in 'Main.java'

public class PoisedProject{
	
	// creating a 'projectDetails' object called 'info'
	private projectDetails info = new projectDetails();
	
	// creating a method called 'PoisedProject'
	void PoisedPoject(){}
	
	// creating a method called 'PoisedProject' with parameters
	public PoisedProject(String projectName, int projectNum, String buildingStructure, String address, int ERFnum, double totProjectFee, double paidAmount, String completion, String projectDueDate, String dateCompleted, People client, People architect, People contractor) {
		
		this.info.setProjectNum(projectNum);
		this.info.setProjectName(projectName);
		this.info.setBuildingStructure(buildingStructure);
		this.info.setAddress(address);
		this.info.setERFnum(ERFnum);
		this.info.setTotProjectFee(totProjectFee);
		this.info.setPaidAmount(paidAmount);
		this.info.setCompletion(completion);
		this.info.setProjectDueDate(projectDueDate);
		this.info.setDateCompleted(dateCompleted);
		this.info.setClient(client);
		this.info.setArchitect(architect);
		this.info.setContractor(contractor);
		
	}
	
	// creating a method called 'PoisedProject'
	public PoisedProject() {
		
	}

	// creating a method called 'getProjectName'
	// which returns 'info.getProjectName'
	public String getProjectName() {
		return info.getProjectName();
	}
	
	public void setProjectName(String projectName) {
		this.info.setProjectName(projectName);
	}
	
	// creating a method called 'getProjectNum'
	// which returns 'info.getProjectNum'
	public int getProjectNum() {
		return info.getProjectNum();
	}
	
	public void setProjectNum(int projectNum) {
		this.info.setProjectNum(projectNum);
	}
	
	// creating a method called 'getBuildingStructure'
	// which returns 'info.getBuildingStructure'
	public String getBuildingStructure() {
		return info.getBuildingStructure();
	}
	
	public void setBuildingStructure(String buildingStructure) {
		this.info.setBuildingStructure(buildingStructure);
	}
	
	// creating a method called 'getAddress'
	// which returns 'info.getAddress'
	public String getAddress() {
		return info.getAddress();
	}
	
	public void setAddress(String address) {
		this.info.setAddress(address);
	}
	
	// creating a method called 'getERFnum'
	// which returns 'info.getERFnum'
	public int getERFnum() {
		return info.getERFnum();
	}
	
	public void setERFnum(int ERFnum) {
		this.info.setERFnum(ERFnum);
	}
	
	// creating a method called 'getTotProjectFee'
	// which returns 'info.getTotProjectFee'
	public double getTotProjectFee() {
		return info.getTotProjectFee();
	}
	
	public void setTotProjectFee(double totProjectFee) {
		this.info.setTotProjectFee(totProjectFee);
	}
	
	// creating a method called 'getPaidAmount'
	// which returns 'info.getPaidAmount'
	public double getPaidAmount() {
		return info.getPaidAmount();
	}
	
	public void setPaidAmount(double paidAmount) {
		this.info.setPaidAmount(paidAmount);
	}
	
	// creating a method called 'getCompletion'
	// which returns 'info.getCompletion'
	public String getCompletion() {
		return info.getCompletion();
	}
	
	public void setCompletion(String completion) {
		this.info.setCompletion(completion);
	}
	
	// creating a method called 'getProjectDueDate'
	// which returns 'info.getProjectDueDate'
	public String getProjectDueDate() {
		return info.getProjectDueDate();
	}
	
	public void setProjectDueDate(String projectDueDate) {
		this.info.setProjectDueDate(projectDueDate);
	}
	
	// creating a method called 'getDateCompleted'
	// which returns 'info.getDateCompleted'
	public String getDateCompleted() {
		return info.getDateCompleted();
	}
	
	public void setDateCompleted(String dateCompleted) {
		this.info.setDateCompleted(dateCompleted);
	}
	
	// creating a method called 'getClient'
	// which returns 'info.getClient'
	public People getClient() {
		return info.getClient();
	}
	
	public void setClient(People client) {
		this.info.setClient(client);
	}
	
	// creating a method called 'getArchitect'
	// which returns 'info.getArchitect'
	public People getArchitect() {
		return info.getArchitect();
	}
	
	public void setArchitect(People architect) {
		this.info.setArchitect(architect);
	}
	
	// creating a method called 'getContractor'
		// which returns 'info.getContractor'
	public People getContractor() {
		return info.getContractor();
	}
	
	public void setContractor(People contractor) {
		this.info.setContractor(contractor);
	}
	
	
	@Override
	
	// creating a toString method
	// which returns the project details to the user
	public String toString() {
		return "Project Name:	" + info.getProjectName() + 
				"\nProject Number:	" + info.getProjectNum() +
				"\nType of Building:	" + info.getBuildingStructure() +
				"\nAddress:	" + info.getAddress() +
				"\nERF Number:	" + info.getERFnum() +
				"\nTotal Project Fee:	" + info.getTotProjectFee() +
				"\nPaid Amount:	" + info.getPaidAmount() + 
				"\nCompletion:	" + info.getCompletion() +
				"\nProject's Due Date:	" + info.getProjectDueDate() +
				"\nDate Completed:	" + info.getDateCompleted();
	}
	
}