package poised;
// Main.java

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

// Function: this program is an extended program of the Poised Projects with specifications given by the client.

//importing java util, text and io
import java.util.ArrayList;
import java.util.Date;
import java.util.Formatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// creating an Array List object called 'projectObject'
		ArrayList<PoisedProject1> projectObject = getDataFromFile();
		
		// creating a Scanner object called 'scan'
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		// declaring a boolean variable called 'control'
		Boolean control = true;
		
		// a while loop that executes the following
		while (control) {
			
			// asks for user's input and input is stored in a variable called 'option'
			// and is change to lower case in a variable called 'optionLower'
			System.out.println("Please choose the following options:\n\n a - add a project\n e - edit existing project\n v - view incomplete tasks\n o - Overdue projects" );
			
			String option = scan.nextLine();
			
			String optionLower = option.toLowerCase();
		
			
			try {
				
				// if the user choose the option 'a' (add a project)
				// the client's, the architect's, the contractor and the project details is required from the user
				// the details are then stored and displayed to the user
				// which then is written to a text file
				if(optionLower.equals("a")) {
					
			        
					System.out.print("\nPlease enter the client's details:\n");
					
			        People client = new People();
			
			        Scanner clientInput = new Scanner(System.in);
			        
			        System.out.print("\nName: ");
			        
			        client.setName(clientInput.nextLine());
	
			        clientInput = new Scanner(System.in);
			        
			        System.out.print("\nSurname: ");
			        client.setClientSurname(clientInput.nextLine());
		        
			        clientInput = new Scanner(System.in);
			        System.out.print("\nTelephone/phone number: ");
				        
				    try {
			    	
				    	String input = clientInput.next();
				    	
				    	for(int count = 0; count < input.length(); count++) {
				    	
				    	if (!Character.isDigit(input.charAt(count))) {
				    		
				    		throw new Exception();
				    	}
				    	
				    }
				    	
				    	Long.parseLong(input);
				    	
				    	if (input.length() != 10) {
				    		
				    		throw new NumberFormatException();
				    	}
				    	
			        	client.setTelNum(input);
					    }
					    catch  (Exception E) { 
					    	
				        	System.out.print("Invalid information\n");
				        	
				        	boolean invalidNum = true;
			        	
			        	do {
			        		
				    		System.out.println("You have entered an incorrect telephone/phone number.");
			    		
			        		System.out.print("Telephone/phone number: ");
			        		
			        		clientInput = new Scanner(System.in);
			        		
			        		Boolean hasNext = clientInput.hasNext();
			        		
			        		String input = clientInput.next();
			        		
			        		if (hasNext) {
			        			
			        			client.setTelNum(input);
			        			
			        			invalidNum = false;
			        		}
			        		
			        		if  (input.length() != 10) {
		        			
			        			invalidNum = true;
			        		}
			        		
	                       for(int counter = 0; counter < input.length(); counter++) {
						    	
						    	if (!Character.isDigit(input.charAt(counter))) {
						    		
						    		invalidNum = true;
						    		
						    		continue;
						    	}
						    }
			        		
			        	}
			        	
			        	while(invalidNum);
				    }

				        clientInput = new Scanner(System.in);
			        
			        System.out.print("\nEmail Address: ");
			        
			        client.setEmailAddress(clientInput.nextLine());
		      
			        clientInput = new Scanner(System.in);
			        
			        System.out.print("\nAddress: ");
			        
			        client.setAddress(clientInput.nextLine());
			
			        System.out.print("\nPlease enter the Architect's details:\n");
			        
			        People architect = new People();
			       
			        Scanner architectInput = new Scanner(System.in);
			        
			        System.out.print("\nName: ");
			        
			        architect.setName(architectInput.nextLine());
	
			        
			        architectInput = new Scanner(System.in);
			        
			        System.out.print("\nSurname: ");
			        
			        architect.setClientSurname(architectInput.nextLine());
	
			        architectInput = new Scanner(System.in);
			        
			        System.out.print("\nTelephone/phone number: ");
			        
			        try {
			        	
			        	String input = architectInput.next();
			        	
			        	for(int count = 0; count < input.length(); count++) {
					    	
					    	if (!Character.isDigit(input.charAt(count))) {
					    		
					    		throw new Exception();
					    	}
					    }
			        	
				    	Long.parseLong(input);
				    	
				    	if (input.length()!=10) {
				    		
				    		throw new NumberFormatException();
				    	}
				    	
			        	architect.setTelNum(input);
			        }
		        
				    catch  (Exception error) { 
				    	
			        	System.out.print("Invalid information.\n");
			        	
			        	boolean invalidNum = true;
			        	
			        	do {
			        		
				    		System.out.println("You have entered an incorrect telephone/phone number.");
				    		
			        		System.out.print("Telephone/phone number: ");
			        		
			        		architectInput = new Scanner(System.in);
			        		
			        		Boolean hasNext = architectInput.hasNext();
			        		
			        		String input = architectInput.next();
		        		
			        		if (hasNext) {
			        			
			        			architect.setTelNum(input);
			        			
			        			invalidNum = false;
			        		}
			        		if  (input.length() != 10) {
			        			
			        			invalidNum = true;
			        		}
			        		
			        		 for(int counter = 0; counter < input.length(); counter++) {
							    	
							    	if (!Character.isDigit(input.charAt(counter))) {
							    		
							    		invalidNum = true;
							    		
							    		continue;
							    	}
			        		 }
			     
			        		}
			        	
			        	while(invalidNum);
				    }
			       
			    
			        architectInput = new Scanner(System.in);
			        
			        System.out.print("\nEmail Address: ");
		        
			        architect.setEmailAddress(architectInput.nextLine());
	
			       
			        architectInput = new Scanner(System.in);
			        
			        System.out.print("\nAddress: ");
			        
			        architect.setAddress(architectInput.nextLine());
	
			        System.out.print("\nPlease enter the contractor's details:\n");
			        
			        People contractor = new People();
			        
			        
			        Scanner contractorInput = new Scanner(System.in);
			        
			        System.out.print("\nName: ");
			        
			        contractor.setName(contractorInput.nextLine());

			       
			        contractorInput = new Scanner(System.in);
			        
			        System.out.print("\nSurname: ");
			        
			        contractor.setClientSurname(contractorInput.nextLine());
	
			        
			        contractorInput = new Scanner(System.in);
			        
			        System.out.print("\nTelephone/phone number: ");
			        
			    try {
			    	
			    	String input = contractorInput.nextLine();
			    	
	                for(int count = 0; count < input.length(); count++) {
				    	
				    	if (!Character.isDigit(input.charAt(count))) {
				    		
				    		throw new Exception();
				    	}
				    	
	                }
	                
			    	
			    	if (input.length() != 10) {
			    		
			    	throw new NumberFormatException();
			    	}
		        
		        	contractor.setTelNum(input);
		        	
			    }
			    catch (Exception error) {
			    	
			    	System.out.print("Invalid information\n");
			    	
			    	boolean invalidNum = true;
			    	do {
			    		System.out.println("You have entered an incorrect telephone/phone number.");
			    		
		        		System.out.print("Telephone/phone number: ");
		        		
		        		contractorInput = new Scanner(System.in);
		        		
		        		Boolean hasNext = contractorInput.hasNext();
		        		
		        		String input = contractorInput.next();
		        		
		        		if (hasNext) {
		        			
		        			contractor.setTelNum(input);
		        			 
		        			invalidNum = false;
		        		}
		        	
		        		if  (input.length() != 10) {
		        			
		        			invalidNum = true;
		        		}
		        		
		        		 for(int counter = 0; counter < input.length(); counter++) {
						    	
						    	if (!Character.isDigit(input.charAt(counter))) {
						    		
						    		invalidNum = true;
						    		
						    		continue;
						    	}
						    }
			    	} 
			    	
			    	while (invalidNum);
				  }
	
			      
			        contractorInput = new Scanner(System.in);
			        
			        System.out.print("\nEmail Address: ");
			        
			        contractor.setEmailAddress(contractorInput.nextLine());
			        
				 
			        contractorInput = new Scanner(System.in);
			        
			        System.out.print("\nAddress: ");
			        
			        contractor.setAddress(contractorInput.nextLine());
			        
			        
			        System.out.print("\nPlease enter the project details: \n");
			        
			        PoisedProject1 project = new PoisedProject1();
			        
			        Scanner projectInput = new Scanner(System.in);
 
			        projectInput = new Scanner(System.in);
			        
			        System.out.print("\nProject Number: ");
			        
			        try {
			        	
			        	project.setProjectNum(projectInput.nextInt());
			        }
			        catch (Exception e) {
			        	
			        	boolean invalidNum = true;
			        	
			        	do {
			        		
			        		System.out.println("You have entered an incorrect project number.");
			        		
			        		System.out.print("Project Number: ");
			        		
			        		projectInput = new Scanner(System.in);
			        		
			        		if(projectInput.hasNextInt()) {
			        			
			        			project.setProjectNum(projectInput.nextInt());
			        			
			        			invalidNum = false;
			        		}
			        		
			        	
			        	}
			        	while(invalidNum);
			        	
			        	project.setProjectNum(0);
			        }

			        projectInput = new Scanner(System.in);
			        
			        System.out.print("\nThe type of building (e.g. house, apartment, etc): ");
			        
			        project.setBuildingStructure(projectInput.nextLine());

			        projectInput = new Scanner(System.in);
			        
			        System.out.print("\nName of the project: ");
			        
			        if (projectInput.nextLine().equals("")) {
			        	
			        	String projectName = project.getBuildingStructure() + " " + client.getPersonsSurname();
				        
			        	project.setProjectName(projectName);
			        
			        }
			        else {
			        	
			        	project.setProjectName(projectInput.nextLine());
			        }
	
			        projectInput = new Scanner(System.in);
			        
			        System.out.print("\nAddress: ");
			        
			        project.setAddress(projectInput.nextLine());

			        projectInput = new Scanner(System.in);
			        
			        System.out.print("\nERF Number: ");
			        
			        try {
			        	
			        	project.setERFnum(projectInput.nextInt());
			        }
			        
			        catch (Exception E) {
			        	
			        	boolean invalidERFnum = true;
			        	do {
			        		
			        		System.out.println("You have entered an incorrect ERF number.");
			        		
			        		System.out.println("ERF Number: ");
			        	
			        		projectInput = new Scanner(System.in);
			        	
			        		if(projectInput.hasNextInt()) {
			        			
			        			invalidERFnum = false;
			        		
			        			project.setERFnum(projectInput.nextInt());
			        		}
			        		
			        	}
			        	
			        	while(invalidERFnum);
			        }

			        projectInput = new Scanner(System.in);
			        
			        System.out.print("\nProject Fee: R ");
			        
			        try {
			        	
			        	project.setTotProjectFee(projectInput.nextDouble());
			        	
			        }
			        catch (Exception E) {
			        	
			        	System.out.println("You have entered invalid digits.");
			        	
			        	project.setTotProjectFee(0);
			        	
			        }

			        projectInput = new Scanner(System.in);
			        
			        System.out.print("\nAmount paid: R ");
			        
			        try {
			        	project.setPaidAmount(projectInput.nextDouble());
			        	
			        }
			        catch (Exception E) {
			        	
			        	System.out.println("Incorrect input.");
			        	
			        	project.setPaidAmount(0);
			        
			        }
			        

			        project.setCompletion("No");

			        projectInput = new Scanner(System.in);
			        
			        System.out.print("\nProject Due Date (dd-MM-yyyy): ");
			        
			        project.setProjectDueDate(projectInput.nextLine());

			        project.setArchitect(architect);
			
			        project.setClient(client);
	
			        project.setContractor(contractor);
			        
			        projectObject.add(project);
			        
			        System.out.println("\nProject has been successfully added.\n");
	
			        System.out.println("\nTHE PROJECT DETAILS\n");
			        
			        System.out.println(project.toString());
	
			        System.out.println("\nTHE CLIENT'S DETAILS\n");
			        
			        System.out.println(client.toString());
			        
			        System.out.println("\nTHE ARCHITECT'S DETAILS\n");
			        
			        System.out.println(architect.toString());
			        
			        System.out.println("\nTHE CONTRACTOR'S DETAILS\n");
			        
			        System.out.println(contractor.toString());
			        
			        System.out.println("The project has been successfully added.");
				}
				
				// if the user chooses the 'e' (edit an existing project)
				// the user is given options to choose what part to edit of the existing project
				// once edited, the previous project details are replaced with the new project details in the invoice and project text files
				// which then they are displayed to the user
				else if (optionLower.equals("e")){

			        Boolean editControl = true;
			        
			        while (editControl) {

						System.out.print("\nPlease enter the project number of the project you would like to edit:\n");
						
						Scanner scanner = new Scanner(System.in);
						
						showProjects(projectObject);
					
						int projNum = scanner.nextInt() -1;
						
			            String projectNumEdit = "yes";

			            if (projectNumEdit.equals("yes")) {
			            	
			                Scanner input = new Scanner(System.in);
			                
			                System.out.println("\n\nPlease enter the letter of what you would like to edit:\n d - due date,\n a - amount paid,\n u - update contractor,\n f - finalize - ");
			               
			                String choiceEdit = input.nextLine();
			                
			                String choiceEditLower = choiceEdit.toLowerCase();
	 
			                switch (choiceEditLower) {
			            
			                case "d":
			                	
			                    Scanner newDeadline = new Scanner(System.in);
			                    
			                    System.out.print("Please enter the new due date in the form of (dd-MM-yyyy): ");
			                    
			                    String input1 = newDeadline.nextLine();
			                    
			                    projectObject.get(projNum).setProjectDueDate(input1);
			                    
			                    // getting the new date from the user as a string
			                    System.out.println("The new deadline is: " + projectObject.get(projNum).getProjectDueDate());
			                    
			                    System.out.print("\nThe new project details\n_______________________________________________________________\n" + projectObject.get(projNum).toString() + "\n_______________________________________________________________\n");
	
			                    editControl = true;
			                   
			                break;
			                    
			                case "a":
			                	
			                    Scanner newPaidAmount = new Scanner(System.in);
			                    
			                    System.out.print("Please enter the new paid amount: ");
			                    
			                    int input2 = newPaidAmount.nextInt();
			                    
			                    projectObject.get(projNum).setPaidAmount(input2); // adding new amount entered to not overwrite current amount paid.
			                    
			                    System.out.println(projectObject.get(projNum).getPaidAmount());
			                    
			                    System.out.print("\nThe new project details\n_______________________________________________________________\n" + projectObject.get(projNum).toString() + "\n_______________________________________________________________\n");
	
			                    editControl = true;
		    
			                break;
			                    
			                case "u":
			
			                    System.out.print("\nChanging the details of the contractor named: " + projectObject.get(projNum).getContractor().getPersonsName() + " " +projectObject.get(projNum).getContractor().getPersonsSurname() + "\n");
			                    
			                    Scanner newContrNumInput = new Scanner(System.in);
			                    
			                    System.out.print("For Contractor " + projectObject.get(projNum).getContractor().getPersonsName() + " " + projectObject.get(projNum).getContractor().getPersonsSurname() +", please enter their phone or telephone number: ");
			                    
			                    projectObject.get(projNum).getContractor().setTelNum(newContrNumInput.nextLine());
			                    
			                    Scanner newContrEmailInput = new Scanner(System.in);
			                    
			                    System.out.print("For Contractor " + projectObject.get(projNum).getContractor().getPersonsName() + " " + projectObject.get(projNum).getContractor().getPersonsSurname() +" , please enter their email address: ");
			                    
			                    projectObject.get(projNum).getContractor().setEmailAddress(newContrEmailInput.nextLine());
			                   
			
			                    System.out.print("\nThe new details of the contractor\n_______________________________________________________________\n" + projectObject.get(projNum).getContractor().toString() + "\n_______________________________________________________________\n");
			                   
			                    editControl = true;
		                break;
			                    
			                case "f":
			                	
			                    if (projectObject.get(projNum).getTotProjectFee() > projectObject.get(projNum).getPaidAmount()) {
			                    	
			                        double owedAmount = projectObject.get(projNum).getTotProjectFee() - projectObject.get(projNum).getPaidAmount();
			                        
			                        try {
			                        	
			                            Formatter file = new Formatter("invoice.txt");

			                            file.format("Invoice" + "\nClient :" + projectObject.get(projNum).getClient() + "\nProject fee: R" + projectObject.get(projNum).getTotProjectFee() + "\nPaid Amount: R" + projectObject.get(projNum).getPaidAmount() + "\nOwed Amount: R" + owedAmount);
			                            
			                            System.out.println("\nInvoice has been printed out in text file called 'invoice.txt'");
			                            
			                            file.close();
			                            
			                        }
			                        
			                        catch (Exception e) {
			                        	
			                            System.out.println("Error.");
			                        }
			                        
			                        
			                    } 
			                    else if (projectObject.get(projNum).getTotProjectFee() <= projectObject.get(projNum).getPaidAmount()) {
			                    	
			                        System.out.println("\nNo invoice to be generated, the client settled the balance.");
			                    }
			                    
			                    Scanner markComplete = new Scanner(System.in);
			                    
			                    System.out.println("\nDo you want to mark this task complete? (Yes or No): ");
			                    
			                    String taskComplete = markComplete.nextLine();
			                    
			                    String taskCompleteLower = taskComplete.toLowerCase();
			                    
			                    if (taskCompleteLower.equals("yes")) {
			                    	
			                    	projectObject.get(projNum).setCompletion("Yes");
			                        
			                    	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			                        
			                        String date = sdf.format(new Date());
			                        
			                        try {
			                        	
										sdf.parse(date);
										
										projectObject.get(projNum).setDateCompleted(date);
									} 
			                        
			                        catch (ParseException e) {
										
										e.printStackTrace();
									}
			          
			                        System.out.println(projectObject.get(projNum).toString());
			                        
			                        editControl = true;
			                        
			                    	}
				                  }
			                	}
			                   
			                    else if (projectNumEdit.equals("no")) {
			                    	
			                    	System.out.print("\nExit was successful, thank you!");
			                    	
			                    	editControl = true;
			                    	
			                
			                
			                    }
			                    else {
			                    	System.out.println("\nYou have made an invalid option");
		                    }
			            break;
		                    	
			            }
			        
			        writeToFile(projectObject);
			        
					}
				
					// if user chooses 'v' (view incomplete projects)
					// incomplete projects are displayed to the user
					else if(optionLower.equals("v")) {
		                	
		        		System.out.println("\nINCOMPLETE PROJECTS:\n");
		        				
		        		showIncompletedProjects(projectObject);
		        	
					}
				
					// if the user chooses 'o' (overdue projects)
					// overdue projects are displayed to the user
					else if(optionLower.equals("o")) {
		        				
						System.out.println("\nOVERDUE PROJECTS:\n");
		        				
						showPastDueDate(projectObject);
				        
						}
				}
			
				// an error exception that will display the message to the user
				catch(Exception error) {
				
					System.out.print("\nError.");
				}
		  }	
    }
	
	// this part of the code stored the project details in an Array List
	// which then is to be written in a text file called 'Projects.txt'
	// the information in the text file is displayed if the user chooses to view it
	static ArrayList<PoisedProject1> getDataFromFile() {
		
        ArrayList<String[]> project = new ArrayList<String[]>();
        
        ArrayList<PoisedProject1> projectObjects= new ArrayList<PoisedProject1>();

    		BufferedReader reader;
    		
    		try {
    			
    			reader = new BufferedReader(new FileReader("Projects.txt"));
    			
    			String line = reader.readLine();
    			
    			while (line != null) {
    				
    				project.add(line.split(", "));
    				
    				
    				line = reader.readLine();
    			}
    			
    			reader.close();
    			
    		} 
    		catch (IOException e) {
    			
    			e.printStackTrace();
    		}
    		
    		
    		for(int count = 0; count < project.size(); count++) {
    			
    			new People(project.get(count)[15], project.get(count)[16], (project.get(count)[17]), project.get(count)[18], project.get(count)[19]);
    			
    			new People(project.get(count)[20], project.get(count)[21], (project.get(count)[22]), project.get(count)[23], project.get(count)[24]);
    			
    			new People(project.get(count)[10], project.get(count)[11], (project.get(count)[12]), project.get(count)[13], project.get(count)[14]);
    			
    			PoisedProject1 newProject = new PoisedProject1();
        		
        		projectObjects.add(newProject);
    		}
    		
    		return projectObjects;
	 }
	
	 
	static void showProjects(ArrayList<PoisedProject1> project) {
		
		for(int counter = 0; counter < project.size(); counter++) {
		
			System.out.println(counter+1 + ": " + project.get(counter).getProjectName());
		}
	}
	
	
		static void showIncompletedProjects(ArrayList<PoisedProject1> project) {
			
			for(int count = 0; count < project.size(); count++) {
				
				String isComplete = project.get(count).getCompletion();
				
				String isCompleteLower = isComplete.toLowerCase();
				
				if(isCompleteLower.equals("no")) {
					
					System.out.println(count + 1 + "\n"+ project.get(count).toString() + "\n");
				}
			}
		}

	static void showPastDueDate(ArrayList<PoisedProject1> project) {
		
		for(int counter = 0; counter < project.size(); counter++) {
			
			try {
				
				SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	            
				String date = sdf.format(new Date());
	            
				Date today;
				
				Date duedate;
				
				today = sdf.parse(date);
				
				duedate = sdf.parse(project.get(counter).getProjectDueDate());
				  
				if(today.compareTo(duedate) > 0){
	
		            System.out.println("The due date for this project is : " + sdf.format(duedate));
		            
		            System.out.println("Today's date is: " + sdf.format(today));
					
		            System.out.println(counter +1 + "\n" + project.get(counter).toString() + "\n");
			}
		}
			
		catch (ParseException e1) {
			
				e1.printStackTrace();
			}
		}
	}
	

	static void writeToFile(ArrayList<PoisedProject1> project) {
		
		String line = "";
		
		for(int counter = 0; counter < project.size(); counter++) {
			
    		line = line += project.get(counter).getProjectName() + ", " + project.get(counter).getProjectNum() + ", " + project.get(counter).getBuildingStructure() + ", " + 
		           project.get(counter).getAddress() + ", " + project.get(counter).getERFnum() + ", " + project.get(counter).getTotProjectFee() + ", " + project.get(counter).getPaidAmount() + ", " +
		           project.get(counter).getCompletion() + ", " + project.get(counter).getProjectDueDate() + ", " + project.get(counter).getDateCompleted() + ", " + 
		           project.get(counter).getClient().getPersonsName()  + ", " + project.get(counter).getClient().getPersonsSurname() + ", " + project.get(counter).getClient().getPersonsTelNum() + ", " + 
		           project.get(counter).getClient().getPersonsEmailAddress() + ", " + project.get(counter).getClient().getPersonsAddress() + ", " + project.get(counter).getArchitect().getPersonsName() + ", " + 
		           project.get(counter).getArchitect().getPersonsSurname() + ", " + project.get(counter).getArchitect().getPersonsTelNum() + ", " + project.get(counter).getArchitect().getPersonsEmailAddress() + ", " + 
		           project.get(counter).getArchitect().getPersonsAddress() + ", " + project.get(counter).getContractor().getPersonsName() + ", " + 
		           project.get(counter).getContractor().getPersonsSurname() + ", " + project.get(counter).getContractor().getPersonsTelNum() + ", " + 
		           project.get(counter).getContractor().getPersonsEmailAddress() + ", " + project.get(counter).getContractor().getPersonsAddress()  + "\n";
		}
		
	    try {
	    	
		    FileWriter fileWrite = new FileWriter("Projects.txt");
		    
		    fileWrite.write(line);
		    
		    fileWrite.close();
	    	
	    } 
	    catch(Exception error) {
	    	
	    	System.out.println(error.getMessage());
	    	
	    }	
	}	   
}

