package week1.Service;

/**
 * Created by IT on 16.08.2016.
 */
public class Technics {

    private int id;
    private String model;
    private double price;
    private double repairPrice = 0;
    private int statusRepare = 0;
    private long idCode;

    public double getRepairPrice() {
        return repairPrice;
    }

    public long getIdCode() {
        return idCode;
    }

    public int getStatusRepare() {
        return statusRepare;
    }

    public void setStatusRepare(int statusRepare) {
        this.statusRepare = statusRepare;
    }

    public void setRepairPrice(double repairPrice) {
        this.repairPrice = repairPrice;
    }

    public double getPrice() {

        return price;
    }

    public Technics(int id, String model, double price, int status, long idCode) {
        this.id = id;
        this.model = model;
        this.price = price;
        this.statusRepare = status;
        this.idCode = idCode;
    }
}
