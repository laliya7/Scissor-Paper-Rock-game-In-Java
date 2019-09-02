public class Winner {

	Computer computer = new Computer();
	Human human = new Human();
	
	String Human = human.HumanChoice();
	String Computer = computer.ComputerChoice();
	String Winner;
	
	public String WinnerIs() {
		
		//deciding computers move
		if(Human.equals("rock") || Human.equals("Rock") && Computer.equals("Paper")) {
			Winner = "computer";
		}
		if(Human.equals("paper") || Human.equals("Paper") && Computer.equals("Scissor")) {
			Winner = "computer";
		}
		if(Human.equals("scissor") || Human.equals("Scissor") && Computer.equals("Rock")) {
			Winner = "computer";
		}
		
		//deciding humans move
		if(Human.equals("rock") || Human.equals("Rock") && Computer.equals("Scissor")) {
			Winner = "human";
		}
		if(Human.equals("paper") || Human.equals("Paper") && Computer.equals("Rock")) {
			Winner = "human";
		}
		if(Human.equals("scissor") || Human.equals("Scissor") && Computer.equals("Paper")) {
			Winner = "human";
		}
		if(Human.equals(Computer) || Computer.equals(Human))
			Winner = "Draw";
		
		return Winner;
	}

}
