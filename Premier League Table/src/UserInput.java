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
		 static void  displayTeamDetails(int selectedTeamNumber)
		 {
			       if(selectedTeamNumber >= 1 && selectedTeamNumber <= 20)
			        {
				     int selectedTeamIndex = selectedTeamNumber-1;
				     Team selectedTeam= Database.teams.get(selectedTeamIndex);
				 
				    System.out.println("\n" + "Team Name: " + selectedTeam.getName());
				    System.out.println("Matches Played: " + selectedTeam.getMatchesPlayed());
			        System.out.println("Wins: " + selectedTeam.getWins());
			        System.out.println("Draws: " + selectedTeam.getDraws());
			        System.out.println("Losses: " + selectedTeam.getLosses());
			        System.out.println("Goals For: " + selectedTeam.getGoalsFor());
			        System.out.println("Goals Against: " + selectedTeam.getGoalsAgainst());
			        System.out.println("Goal Differential: " + selectedTeam.getGoalDifferential());
			        System.out.println("Points: " + selectedTeam.getPoints());
			        }
			       else 
			       {
			    	   System.out.println("Invalid team selection. Please enter a number between 1 and 20.");


			       }



			     
	}
	}