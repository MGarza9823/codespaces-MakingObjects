public class Car extends Vehicle
{
    //An attribute for Cars
    private int numberOfDoors;
    //Constructor for Cars to initialize speed, fuel, and number of doors
    public Car(int speed, double fuel, int numberOfDoors)
    {
        //calls the superclass constructor to set speed and fuel
        super(speed, fuel);
        //this initializes the number of doors
        this.numberOfDoors = numberOfDoors;
    }
    //Overridden method for car starting and prints message for the car starting
    public void start()
    {
        System.out.println("Car is starting...Let's drive!");
    }
    //method to show car honking
    public void honk()
    {
        System.out.println("Beep Beep!");
    }
    //getter and setter for number of doors on the car
    public int getNumberOfDoors()
    {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors)
    {
        this.numberOfDoors = numberOfDoors;
    }


}