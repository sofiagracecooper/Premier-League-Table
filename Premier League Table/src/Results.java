
public class Results
	{

		public static void main(String[] args)
			{
				Database.fillTeams();
				displayMenu();
				UserInput userInput = new UserInput();
			    userInput.askQuestions();

			}

		private static void displayMenu()
			{
				int menuNumber=1;
				for(Team t: Database.teams)
					{
						
						System.out.println(menuNumber + ") " + t.getName());
						menuNumber++;
					}
				
			}

	}
//comment for pulling/pushing for GitHub.
