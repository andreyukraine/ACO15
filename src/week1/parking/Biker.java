package week1.parking;

/**
 * Created by IT on 11.08.2016.
 */
public class Biker {

    private String number;
    private String model;
    private Driver driver;

    public void init(String number, String model, Driver driver) {
        this.number = number;
        this.model = model;
        this.driver = driver;
    }
}
