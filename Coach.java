/**
 * The Coach class stores the name and the gender of coach
 *
 * @author Wei Liu, Zubair
 * @version 2018.11.15
 */
public class Coach extends Human
{
    // instance variables - replace the example below with your own
    private String gender;

    /**
     * Constructor for objects of class Coach
     */
    public Coach(String name, String gender)
    {
        super(name);
        this.gender = gender;
    }
    
    /**
     * An override method display the information of the coach
     */
    public void display()
    {
        System.out.println("Coach name: " + super.getName()
        + ", gender: "+ gender);
    }
    

   
}
