public class Bicycle extends Vehicle
{
    //attribute specific to bicycle to determine if it has a bell or not
    private boolean hasBell;
    //constructor for bicycle that calls the parent constructor and intializes the bell attribute
    public Bicycle(int speed, double fuel, boolean hasBell)
        {
            //calls the superclass constructor to set the speed and fuel
            super(speed, fuel);
            //this initializes the bell attribute
            this.hasBell= hasBell;
        }
//this is an overriden method for the starting of the bicycle
public void start()
{
    System.out.println("Pedal to the metal!");
}
//a method to check the bicycle if it has a bell or not and prints the appropriate message
public void ringBell()
{
    if (hasBell)
    {
        System.out.println("Ring Ring!");
    }
    else
    {
        System.out.println("No Bell on the Bicycle!");
    }
}
//These are the getter and setter methods for the bell attribute
public boolean getHasBell()
{
    return hasBell;
}

public void setHasBell(boolean hasBell)
{
    this.hasBell = hasBell;
}


}