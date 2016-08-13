package week1.parking;

/**
 * Created by IT on 07.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        Parking parking = new Parking();

        parking.build("Київ, вул. Старокиївська, 10", 100, "Открыто");

        Driver driver = new Driver();
        driver.init("Oleg","DF121232323");

        Transport transport = new Transport("car","AN2343","Audi TT",driver);
        Place place = new Place(transport);
        Transport transport1 = new Transport("bike","AN1233", "harley davidson", driver);
        Place place1 = new Place(transport1);


        //car = null;


        Ticket ticket = parking.acceptCar(place, transport);

        Place myCar = parking.takeCar(ticket, transport, place);

        Ticket ticket1 = parking.acceptCar(place1, transport1);

        Place myCar1 = parking.takeCar(ticket1, transport1, place1);

        //parking.takeBikePlaceNumber(transport1);
        //parking.clearParkingPlaces();
        //parking.showAllInParking();
        //parking.changeAddressParking("Киев, ул. Кольцевая дорога 22");
        parking.workingTime();
    }
}
