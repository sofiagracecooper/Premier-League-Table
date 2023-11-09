import java.util.Scanner;
public class UserInput
	{

		public static void main(String[] args)
			{
				    
				    Database.fillTeams();
			        askQuestions();
			    }

		 static void askQuestions()
			{
				 Scanner userIntInput = new Scanner(System.in);
			        System.out.println("Select your first team by entering a number:");
			        
				
			        if (selectedTeamNumberOne >= 1 && selectedTeamNumberOne <= 20) {
			            int selectedTeamIndex = selectedTeamNumberOne - 1; 
			            String selectedTeamNameOne = Database.teams.get(selectedTeamIndex).getName();
			            System.out.println("You have selected: " + selectedTeamNameOne);
			        } else {
			            System.out.println("Invalid team selection. Please enter a number between 1 and 20.");
			        }
			       
			        System.out.println("Select your second team by entering a number:");
			        
				
			        if (selectedTeamNumberTwo >= 1 && selectedTeamNumberTwo <= 20) {
			            int selectedTeamIndex = selectedTeamNumberTwo - 1; 
			            String selectedTeamNameTwo = Database.teams.get(selectedTeamIndex).getName();
			            System.out.println("You have selected: " + selectedTeamNameTwo);
			        } else {
			            System.out.println("Invalid team selection. Please enter a number between 1 and 20.");
			        }
                    System.out.println("How many goals did "+ selectedTeamNameOne+  " score?");
                    int goalsScored = userIntInput.nextInt();
				
			}
	}
	
