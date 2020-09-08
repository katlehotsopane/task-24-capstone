package poised;

// projectDetails.java

// Function: this is a public class with methods that are to be used in 'Main.java'


public class projectDetails {
	
	// declaring private variables
	private String projectName;
	private int projectNum;
	private String buildingStructure;
	private String address;
	private int ERFnum;
	private double totprojectFee;
	private double paidAmount;
	private String completion;
	private String projectDueDate;
	private String dateCompleted;
	private People architect;
	private People client;
	private People contractor;
	
	// creating a method called 'projectDetails'
	public projectDetails() {}
	
	// creating a method called 'getProjectName'
	// that returns 'projectName'
	public String getProjectName() {
		return projectName;
	}
	
	// creating a method called 'setProjectName' with a parameter
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	// creating a method called 'getProjectNum'
	// that returns 'projectNum' 
	public int getProjectNum() {
		return projectNum;
	}
	
	// creating a method called 'setProjectNum' with a parameter
	public void setProjectNum(int projectNum) {
		this.projectNum = projectNum;
	}

	// creating a method called 'getBuildingStructure'
	// that returns 'buildingStructure'
	public String getBuildingStructure() {
		return buildingStructure;
	}

	// creating a method called 'setBuildingStructure' with a parameter
	public void setBuildingStructure(String buildingStructure) {
		this.buildingStructure = buildingStructure;
	}

	// creating a method called 'getAddress'
	// that returns 'address'
	public String getAddress() {
		return address;
	}

	// creating a method called 'setAddress' with a parameter
	public void setAddress(String address) {
		this.address = address;
	}

	// creating a method called 'getERFnum'
	// that returns 'ERFnum'
	public int getERFnum() {
		return ERFnum;
	}

	// creating a method called 'setERFnum' with a parameter
	public void setERFnum(int ERFnum) {
		this.ERFnum = ERFnum;
	}

	// creating a method called 'getTotProjectFee'
	// that returns 'totProjectFee'
	public double getTotProjectFee() {
		return totprojectFee;
	}

	// creating a method called 'setTotProjectFee' with a parameter
	public void setTotProjectFee(double totProjectFee) {
		this.totprojectFee = totProjectFee;
	}

	// creating a method called 'getPaidAmount'
	// that returns 'paidAmount'
	public double getPaidAmount() {
		return paidAmount;
	}

	// creating a method called 'setPaidAmount' with a parameter
	public void setPaidAmount(double paidAmount) {
		this.paidAmount = paidAmount;
	}

	// creating a method called 'getCompletion'
	// that returns 'completion'
	public String getCompletion() {
		return completion;
	}

	// creating a method called 'setCompletion' with a parameter
	public void setCompletion(String completion) {
		this.completion = completion;
	}

	// creating a method called 'getProjectDueDate'
	// that returns 'projectDueDate'
	public String getProjectDueDate() {
		return projectDueDate;
	}

	// creating a method called 'setProjectDueDate' with a parameter
	public void setProjectDueDate(String projectDueDate) {
		this.projectDueDate = projectDueDate;
	}

	// creating a method called 'getDateCompleted'
	// that returns 'dateCompleted'
	public String getDateCompleted() {
		return dateCompleted;
	}

	// creating a method called 'setDateCompleted' with a parameter
	public void setDateCompleted(String dateCompleted) {
		this.dateCompleted = dateCompleted;
	}

	// creating a method called 'getAchitect'
		// that returns 'architect'
	public People getArchitect() {
		return architect;
	}

	// creating a method called 'setArchitect' with a parameter
	public void setArchitect(People architect) {
		this.architect = architect;
	}

	// creating a method called 'getClient'
	// that returns 'client'
	public People getClient() {
		return client;
	}

	// creating a method called 'setClient' with a parameter
	public void setClient(People client) {
		this.client = client;
	}

	// creating a method called 'getContractor'
	// that returns 'contractor'
	public People getContractor() {
		return contractor;
	}

	// creating a method called 'setContractor' with a parameter
	public void setContractor(People contractor) {
		this.contractor = contractor;
	}

	


}
