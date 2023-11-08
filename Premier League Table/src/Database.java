import java.util.ArrayList;
import java.util.Scanner;

public class Database
	{
			

				static ArrayList<Team> teams=new ArrayList<Team>();
				public static void fillTeams() {
				
					teams.add(new Team("Man City",11,9,0,2,28,8,21,27));
					teams.add(new Team("Tottenham",11,8,2,1,23,13,10,26));
					teams.add(new Team("Arsenal",11,7,3,0,23,8,15,24));
					teams.add(new Team("Liverpool",11,7,2,1,23,9,14,23));
					teams.add(new Team("Aston Villa",11,7,1,2,26,14,12,22));
					teams.add(new Team("Newcastle",11,5,2,3,26,11,15,17));
					teams.add(new Team("Brighton",11,5,2,3,23,19,4,17));
					teams.add(new Team("Manchester United",11,5,0,5,11,16,-5,15));
					teams.add(new Team("West Ham",11,4,2,4,22,9,13,26));
					teams.add(new Team("Brentford",11,3,4,3,16,12,4,13));
					teams.add(new Team("Chelsea",11,3,3,4,13,11,2,12));
					teams.add(new Team("Wolves",11,3,3,2,13,17,-4,12));
					teams.add(new Team("Crystal Palace",11,3,3,4,8,13,-5,12));
					teams.add(new Team("Fulham",11,3,3,4,9,16,-7,12));
					teams.add(new Team("Everton",11,3,1,6,10,14,-4,10));
					teams.add(new Team("Nottm Forest",11,2,4,4,10,15,-5,10));
					teams.add(new Team("Bournemouth",11,1,3,6,8,21,-13,6));
					teams.add(new Team("Luton Town",11,1,2,7,9,20,-11,5));
					teams.add(new Team("Burnley",11,1,1,8,8,25,-17,4));
					teams.add(new Team("Sheffield United",11,0,1,9,7,29,-22,10));
				}
	}
				
			    
				