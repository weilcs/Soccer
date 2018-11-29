/**
 * The League Class can create soccer league object with 4 divisions
 * and setup the league by creating teams and adding them to the divisions
 *
 * @author Wei Liu, Zubair
 * @version 2018.11.15
 */
import java.util.ArrayList;

public class League
{
    // instance variables - replace the example below with your own
    private ArrayList<Division> divisions;
    private Division division1, division2, division3, division4;

    /**
     * Constructor for objects of class League
     */
    public League()
    {
        // Every time create a new league object, 
        // create and add 4 divisions to the league.
        divisions = new ArrayList<>();
        division1 = new Division("d1");
        division2 = new Division("d2");
        division3 = new Division("d3");
        division4 = new Division("d4");
        divisions.add(division1);
        divisions.add(division2);
        divisions.add(division3);
        divisions.add(division4);
        
    }
    
    /**
     * Get the division by searching with its index
     */
    public Division getDivision(int IndexOfDivision)
    {
        return divisions.get(IndexOfDivision);
    }
    
    /**
     * Set up the league by setting up the divisions
     */
    public void leagueSetup()
    {
        division1.divisionSetup();
        division2.divisionSetup();
        division3.divisionSetup();
        division4.divisionSetup();
    }

    
    
}
