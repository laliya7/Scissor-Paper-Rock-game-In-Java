public class Main {

	public static void main(String[] args) {
		 
		Winner winner = new Winner();
		
		if(winner.WinnerIs().equals("computer"))
			System.out.println("Computer won!");
		if(winner.WinnerIs().equals("human"))
			System.out.println("You won!");
		if(winner.WinnerIs().equals("Draw"))
			System.out.println("Match draw!");
	}

}
