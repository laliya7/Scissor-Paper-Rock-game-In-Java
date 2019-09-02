public class Human {

	
	Scanner input = new Scanner(System.in);
	
	ArrayList<String> objects = new ArrayList<>();
	
	public String HumanChoice() {
		
	objects.add("Rock");
	objects.add("Paper");
	objects.add("Scissor");
		
	System.out.print("Objects: ");
	for(String objs: objects)
		System.out.print(objs +", ");
	
	System.out.println();
	
	System.out.print("Enter your choice: ");
	String humanChoice = input.nextLine();
	
	if(!objects.contains(humanChoice)) {
		System.out.print("Wrong input!\nOr maybe you entered object name in small form\nEnter again: ");
		humanChoice = input.nextLine();
	}
	
	return humanChoice;
	}
}
