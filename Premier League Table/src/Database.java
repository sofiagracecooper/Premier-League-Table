import java.util.ArrayList;
import java.util.Scanner;

public class Database
	{
			

				static ArrayList<Team> teams=new ArrayList<Team>();
				public static void fillTeams() {
				
					teams.add(new Team("Man City",12,9,1,2,32,12,20,28));
					teams.add(new Team("Liverpool",12,8,3,1,27,10,17,27));
					teams.add(new Team("Arsenal",12,8,3,1,26,10,16,27));
					teams.add(new Team("Tottenham",12,8,2,2,24,15,9,26));
					teams.add(new Team("Aston Villa",12,8,1,3,29,17,12,25));
					teams.add(new Team("Manchester United",12,7,0,5,13,16,-3,21));
					teams.add(new Team("Newcastle",12,6,2,4,27,13,14,20));
					teams.add(new Team("Brighton",12,5,4,3,25,21,4,19));
					teams.add(new Team("West Ham",12,5,2,5,21,22,-1,17));
					teams.add(new Team("Chelsea",12,4,4,4,21,16,5,16));
					teams.add(new Team("Brentford",12,4,4,4,19,17,2,16));
					teams.add(new Team("Wolves",12,4,3,5,16,20,-4,15));
					teams.add(new Team("Crystal Palace",12,4,3,5,12,16,-4,15));
					teams.add(new Team("Everton",12,4,2,6,14,17,-3,14));
					teams.add(new Team("Nottm Forest",12,3,4,5,14,18,-4,13));
					teams.add(new Team("Fulham",12,3,3,6,10,20,-10,12));
					teams.add(new Team("Bournemouth",12,2,3,7,11,27,-16,9));
					teams.add(new Team("Luton Town",12,1,3,8,10,22,-12,6));
					teams.add(new Team("Sheffield United",12,1,2,9,10,31,-21,5));
					teams.add(new Team("Burnley",12,1,1,10,9,30,-21,4));
				}
	}
				
			    
				