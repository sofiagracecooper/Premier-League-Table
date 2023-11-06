
public class Results
	{

		public static void main(String[] args)
			{
				Database.fillTeams();
				displayMenu();

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
