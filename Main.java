public class Main
{
    public static void main(String[] args)
    {
        //creating the car objects with speed, fuel, and number of doors
        Car myCar = new Car(70, 80.0, 4);
        Car secondCar = new Car(55, 90.0, 2);
        //These test my car objects
        myCar.start();
        myCar.displayFuel();
        System.out.println("Number of doors: " + myCar.getNumberOfDoors());
        myCar.honk();
        myCar.stop();
        //this tests my second car object
        secondCar.start();
        secondCar.displayFuel();
        System.out.println("Number of doors: " + secondCar.getNumberOfDoors());
        secondCar.honk();
        secondCar.stop();
        //this creates my bike objects with speed, fuel, and whether or not it has a bell
        Bicycle myBike = new Bicycle(15, 0.0, true);
        Bicycle secondBike = new Bicycle(20, 0.0, false);
        //this tests my bike object
        myBike.start();
        myBike.displayFuel();
        System.out.println("Bicycle speed: " + myBike.getSpeed() + " km/h");
        myBike.ringBell();
        myBike.stop();

        //this tests my second bike object
        secondBike.start();
        secondBike.displayFuel();
        System.out.println("Bicycle speed: " + secondBike.getSpeed() + " km/h");
        secondBike.ringBell();
        secondBike.stop();

    //this changes and displays the speed of My car
    System.out.println("Original speed of My Car: " + myCar.getSpeed());
    myCar.setSpeed(75);
    System.out.println("Updated speed of My Car: " + myCar.getSpeed());
    //this displays the number of doors on My car
    System.out.println("Number of doors on My Car: " + myCar.getNumberOfDoors());

    }
}