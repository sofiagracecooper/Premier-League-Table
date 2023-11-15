import java.util.ArrayList;
import java.util.Scanner;
public class Team
	{
	private String name;
	private int matchesPlayed;
	private int wins;
	private int draws;
	private int losses;
	private int goalsFor;
	private int goalsAgainst;
	private int goalDifferential; 
	private int points;
	
	public Team(String n, int mp, int w, int d, int l, int gf, int ga, int gd, int p)
	{
		name=n;
		matchesPlayed=mp;
		wins=w;
		draws=d;
		losses=l;
		goalsFor=gf;
		goalsAgainst=ga;
		goalDifferential=gd;
		points=p;
		
	}

	public String getName()
		{
			return name;
		}

	public void setName(String name)
		{
			this.name = name;
		}

	public int getMatchesPlayed()
		{
			return matchesPlayed;
		}

	public void setMatchesPlayed(int matchesPlayed)
		{
			this.matchesPlayed = matchesPlayed;
		}

	public int getWins()
		{
			return wins;
		}

	public void setWins(int wins)
		{
			this.wins = wins;
		}

	public int getDraws()
		{
			return draws;
		}

	public void setDraws(int draws)
		{
			this.draws = draws;
		}

	public int getLosses()
		{
			return losses;
		}

	public void setLosses(int losses)
		{
			this.losses = losses;
		}

	public int getGoalsFor()
		{
			return goalsFor;
		}

	public void setGoalsFor(int goalsFor)
		{
			this.goalsFor = goalsFor;
		}

	public int getGoalsAgainst()
		{
			return goalsAgainst;
		}

	public void setGoalsAgainst(int goalsAgainst)
		{
			this.goalsAgainst = goalsAgainst;
		}

	public int getGoalDifferential()
		{
			return goalDifferential;
		}

	public void setGoalDifferential(int goalDifferential)
		{
			this.goalDifferential = goalDifferential;
		}

	public int getPoints()
		{
			return points;
		}

	public void setPoints(int points)
		{
			this.points = points;
		}
	
	}
