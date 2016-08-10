package week1.parking;

/**
 * Created by IT on 07.08.2016.
 */
public class Driver {
    private String name;
    private String licenseId;

    public void init(String name, String licenseId){
        this.name = name;
        this.licenseId = licenseId;
    }

    public String asString(){
        return String.format("name : %s, licenseId %s",
                name,licenseId);
    }
}
