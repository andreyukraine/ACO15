package week1.parking;

/**
 * Created by IT on 07.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        Parking parking = new Parking();
        parking.build(100);

        Driver driver = new Driver();
        driver.init("Oleg","DF121232323");

        Car car = new Car();
        car.init("AN2343","Audi TT",driver);

        //car = null;


        Ticket ticket = parking.acceptCar(car);

        Car myCar = parking.takeCar(ticket);

    }
}
