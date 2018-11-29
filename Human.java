
/**
 * The Human class, which is the super class of Coach and Player
 *
 * @author Wei Liu, Zubair
 * @version 2018.11.15
 */
public class Human
{
    // instance variables - replace the example below with your own
    private String name;

    /**
     * Constructor for objects of class Human
     */
    public Human(String name)
    {
        // initialise instance variables
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    
    public void display()
    {
        System.out.println(name);
    }
}
