+package check;

import constants.Constants;

public class Main {

	public static void main(String[] args) {
	    
	    Main printName = new Main();
	    printName.printName(firstName,lastName);
	    	    
	    Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
	    pet.introduce();
	    
	    RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
	    robotPet.introduce();

	}
	
	private static String firstName = "shida";
	private static String lastName = "kouki";
	    
	private void printName(String firstName,String lastName) {
		String fullName = firstName + lastName;
		System.out.println("printNameメソチE�� ↁE" + fullName);
	}

}
