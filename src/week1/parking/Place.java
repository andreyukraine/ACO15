package week1.parking;

/**
 * Created by IT on 11.08.2016.
 */
public class Place {

    int freePlaceIndex = 0;
    public Transport transport;

    public Place(Transport car) {
        this.transport = car;
    }

    public int generatePlace(Place[] places) {
        for (int i = 0; i < places.length; i++) {
            if (places[i] == null) {
                freePlaceIndex = i;
                return freePlaceIndex;
            }
        }
        return 0;
    }


}
