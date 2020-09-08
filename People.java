package poised;

//People.java

// Function: this is a public class with methods that are to be used in 'Main.java'

public class People {
	
	// declaring variables
	String name;
	String surname;
	String telNum;
	String emailAddress;
	String address;
	
	// creating a method called 'People' with parameters
	public People(String name, String surname, String telNum, String emailAddress, String address) {
		this.name = name;
		this.surname = surname;
		this.telNum = telNum;
		this.emailAddress = emailAddress;
		this.address = address;
	}
	
	// creating a method called 'People'
	public People() {
		
	}

	// creating a method called 'setPersonsDetails' with parameters
	void setPersonsDetails(String changeTelNum, String changeEmailAddress) {
		this.telNum = changeTelNum;
		this.emailAddress = changeEmailAddress;
	}
	
	// creating a method called 'getPersonsName'
	// which returns 'name'
	public String getPersonsName() {
		return name;
	}
	
	// creating a method called 'setClientSurname' with a parameter
	void setClientSurname(String personsSurname) {
		this.surname = personsSurname;
	}
	
	// creating a method called 'getPersonsSurname'
	// which returns 'surname'
	public String getPersonsSurname() {
		return surname;
	}
	
	// creating a method called 'getPersonsTelNum'
	// which returns 'telNum'
	public String getPersonsTelNum() {
		return telNum;
	}
	
	// creating a method called 'getPersonsAddress'
	// which returns 'address'
	public String getPersonsAddress() {
		return address;
	}
	
	// creating a method called 'getPersonsEmailAddress'
	// which returns 'emailAddress'
	public String getPersonsEmailAddress() {
		return emailAddress;
	}
	
	
	// creating a toString method
	// which returns the output to the user
	
	@Override
	
	public String toString() {
		
		String output = "Name:	" + getPersonsName();
		output += "\nSurname:	" + getPersonsSurname();
		output += "\nTelephone Number:	" + getPersonsTelNum();
		output += "\nAddress:	" + getPersonsAddress();
		output += "\nEmail Address:	" + getPersonsEmailAddress();
		
		return output;
	}

	// creating a method called 'setName' with a parameter
	public void setName(String name) {

		this.name = name;

		
	}

	// creating a method called 'setTelNum' with a parameter
	public void setTelNum(String telNum) {
		
		this.telNum = telNum;
		
	}

	// creating a method called 'setEmailAddress' with a parameter
	public void setEmailAddress(String emailAddress) {
		
		this.emailAddress = emailAddress;
		
	}

	// creating a method called 'setAddress' with a parameter
	public void setAddress(String address) {
		
		this.address = address;
		
	}

}
