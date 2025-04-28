public class Vehicle
{
    //These are the vehicle attributes
    protected int speed;
    private double fuel;

//This is the constructor for the vehicle that initializes the speed and fuel
public Vehicle (int speed, double fuel)
    {
        this.speed = speed;
        this.fuel = fuel;
    }
//Method for the vehicle starting
public void start()
    {
        System.out.println("Vehicle is starting...Let's drive!");
    }

//Method for the vehicle stopping
public void stop()
    {
        System.out.println("Vehicle Stopping...You have arrived!");
    }
//The final method that displays vehicle fuel that cannot be overrriden by subclasses
public final void displayFuel()
    {
        System.out.println("Fuel level: " + fuel + " liters");
    }
//These are setter and getters for speed and fuel
public int getSpeed()
    {
        return speed;
    }

public void setSpeed(int speed)
    {
        this.speed = speed;
    }

public double getFuel()
    {
        return fuel;
    }

public void setFuel(double fuel)
    {
        this.fuel = fuel;
    }


}