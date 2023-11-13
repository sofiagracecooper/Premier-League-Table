import java.util.Scanner;
public class UserInput
	{

		public static void main(String[] args)
			{

				    Database.fillTeams();
			        Scanner userIntInput = new Scanner(System.in);
			       
			        askQuestions();
			    }

		 static void askQuestions()
			{
				 Scanner userIntInput = new Scanner(System.in);
			        System.out.println( "\n" +"Select a team you would like to learn about by entering a number:");
			        int selectedTeamNumber = userIntInput.nextInt();
			        
			        if (selectedTeamNumber >= 1 && selectedTeamNumber <= 20) {
			            int selectedTeamIndex = selectedTeamNumber - 1; 
			            String selectedTeamName = Database.teams.get(selectedTeamIndex).getName();
			            System.out.println(  "\n" +"You have selected: " + selectedTeamName);
			            //System.out.println( selectedTeamName " has " + p + "points.");
			       
			        } else {
			            System.out.println("Invalid team selection. Please enter a number between 1 and 20.");
			        }
			    

			       

			}
		 static void reportFeedback() {
			 
		 

	}
	}