package week1.parking;

/**
 * Created by IT on 07.08.2016.
 */
public class Transport {

    private String transport;
    private String number;
    private String model;
    private Driver driver;


    public Transport(String transport, String number, String model, Driver driver) {
        this.transport = transport;
        this.number = number;
        this.model = model;
        this.driver = driver;
    }

    public String getNumber() {
        return number;
    }

    public String getTransport() {

        return transport;
    }

    public Driver getDriver() {
        return driver;
    }

    public String getModel() {
        return model;
    }

    public String asString(){
        return String.format("number : %s, model %s, driver %s",
                number,model,driver.asString());
    }


}
