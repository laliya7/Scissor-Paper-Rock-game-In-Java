public class Computer {
	
	ArrayList<String> objects = new ArrayList<>();
	
	public String ComputerChoice() {
		
		objects.add("Rock");
		objects.add("Paper");
		objects.add("Scissor");
		
		Random randomObject = new Random();
		int finalChoice = randomObject.nextInt(objects.size());
		
		String returnObject = objects.get(finalChoice);
		
		System.out.println("Computer's choice: " + objects.get(finalChoice));
		
		return returnObject;
	}

}
