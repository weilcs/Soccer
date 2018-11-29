/**
 * The Division class creates Division objects with division name and several team objects
 *
 * @author Wei Liu, Zubair
 * @version 2018.11.15
 */

import java.util.HashSet;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Division
{
    private String divisionName;
    //use a set to store the teams to make sure no duplicate elements
    private HashSet<Team> teamSet;
    //use an arraylist to store teams so the users can search the team by index
    //also, it's used when we need to rank the teams
    private ArrayList<Team> teamList; 

    /**
     * Constructor for objects of class Division
     */
    public Division(String divisionName)
    {
        this.divisionName = divisionName;
        teamSet = new HashSet<>();
        ArrayList<Team> teamList= new ArrayList<>();
    }
    
    /**
     * get division name, return a String
     */
    public String getDivisionName()
    {
        return divisionName;
    }
    
    /**
     * get a Team object by searching with index
     */
    public Team getTeam(int indexOfTeam)
    {
        return teamList.get(indexOfTeam);
    }
    
    /**
     * print the team name and the coach name of each team in the division
     */
    public void printTeam()
    {
        for (Team team: teamSet){
            System.out.println("Team name: " + team.getTeamName() 
            + ", coach: " + team.getCoach().getName() + "\n");
        }
    }
    
    /**
     * set a new name for the division
     */
    public void setDivisionName(String divisionName)
    {
        this.divisionName = divisionName;
    }

    /**
     * enroll new team to the division
     */
    public void enrollTeam(Team newTeam)
    {
        teamSet.add(newTeam);
    }
        
    /**
     * set up the division by adding 5 teams to it
     * generate the team name by using division name as prefix
     */
    public void divisionSetup()
    {
        Team team1, team2, team3, team4, team5;
        team1 = new Team(divisionName + "team1");
        team2 = new Team(divisionName + "team2");
        team3 = new Team(divisionName + "team3");
        team4 = new Team(divisionName + "team4");
        team5 = new Team(divisionName + "team5");
        teamSet.add(team1);
        teamSet.add(team2);
        teamSet.add(team3);
        teamSet.add(team4);
        teamSet.add(team5);
        teamList = new ArrayList<Team>(teamSet);
    }
    
    /**
     * set up games among each team, allow teams play once with each other
     * generate random game results
     * and make sure when team A has x goalFor and y goalAgainst,
     * the team it play against should have x goalAgainst and y goalFor.
     */
    public void setRandomGame()
    {
        Random rand = new Random();
        ArrayList<Team> teamListCopy = new ArrayList<>(teamSet);  
        
        teamList = new ArrayList<>();    
        Iterator<Team> it1 = teamListCopy.iterator();
        while (it1.hasNext()){
            Team teamA = it1.next();
            it1.remove();
            Iterator<Team> it2 = teamListCopy.iterator();
            while (it2.hasNext()){
                Team teamB = it2.next();
                int goalFor = rand.nextInt(5);
                int goalAgainst = rand.nextInt(5);
                teamA.play(goalFor, goalAgainst);
                teamB.play(goalAgainst, goalFor);  
            }
            teamList.add(teamA);

        }
    }
    
    /**
     * rank the teams, return an ArrayList with the order same as their ranks
     * print the rank of teams with their points, 
     * # of wins, draws, losses and goal differences
     */
    public ArrayList<Team> getRank()
    {
        Collections.sort(teamList);
        for (int i = 0; i < teamList.size(); i ++){
            System.out.println("Rank " + (i + 1) + ": " + teamList.get(i).getTeamName()
            + " point: " + teamList.get(i).getPoint()
            + " win: " + teamList.get(i).getWin()
            + " draw: " + teamList.get(i).getDraw()
            + " loss: " + teamList.get(i).getLoss()
            + " goal differences: " + teamList.get(i).getNetGoal() + "\n");
        }
        return teamList;
    }

    
}
