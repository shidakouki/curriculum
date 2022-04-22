package check;

public class Main {

	public static void main(String[] args) {
	    
	    Main printName = new Main();
	    System.out.println("printNameメソッド → " + printName);
	    
	    Pet pet = new Pet(constants.CHECK_CLASS_JAVA, constants.CHECK_CLASS_HOGE);
	    System.out.println(pet);
	    
	    RobotPet robotPet = new RobotPet(CHECK_CLASS_R2D2, CHECK_CLASS_LUKE);
	    System.out.println(robotPet);

	}
	
	private String firstName = "shida";
	private String lastName = "kouki";
	
	private void printName(String firstName,String lastName) {
		String fullName = firstName + lastName;
		System.out.println(fullName);
	}

}
