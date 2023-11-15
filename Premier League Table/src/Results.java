
public class Results
	{

		public static void main(String[] args)
			{
				Database.fillTeams();
				displayMenu();
				int selectedTeamNumber = UserInput.askQuestions();
		        UserInput.displayTeamDetails(selectedTeamNumber);


			}

		private static void displayMenu()
			{
				System.out.println(" Welcome. This is an informational program about the Premier League Teams of 2023."  + "\n" + " Here are the current standings for the 2023 Premier League Table: "  + "\n" );
				int menuNumber=1;
				for(Team t: Database.teams)
					{
						
						System.out.println(menuNumber + ") " + t.getName());
						menuNumber++;
					}
				
				
			}

	}

