package week1.parking;



/**
 * Created by IT on 07.08.2016.
 */
public class Parking {

    private Place[] places;
    private Ticket[] tickets;
    private int freeTicketIndex;
    private String address;
    private boolean working;


    public void build(String address, int placesCount){
        this.address = address;
        places = new Place[placesCount];
        tickets = new Ticket[1000];
    }

    public void addMotoOnLastFreePlace(Transport transport){
        if (transport.getTransport() == "bike"){
            for (int i = 0; i < places.length ; i++) {
                if (transport.getTransport() == places[i].transport.getTransport()){
                    System.out.println(i);
                }
            }
        }
    }

    public void changeAddressParking(String newAddress){
        if (newAddress != null){
            this.address = newAddress;
        }
    }

    public void showAllInParking(){
        for (int i = 0; i < places.length && places[i].transport != null; i++) {
            System.out.println(String.format("place № : %s, transport : %s, number : %s, driver: %s, ",
                    i,places[i].transport.getTransport(),places[i].transport.getNumber(),places[i].transport.getDriver()));
        }
    }
    public void clearParkingPlaces(){
        for (int i = 0; i < places.length && places[i].transport != null; i++) {
            places[i] = null;
            tickets[i]= null;
        }
    }

    public void takeBikePlaceNumber(Transport transport){
        if (transport.getTransport() == "bike"){
            for (int i = 0; i < places.length ; i++) {
                if (transport.getTransport() == places[i].transport.getTransport()){
                    System.out.println(i);
                }
            }
        }
    }

    public Ticket acceptCar(Place place, Transport transport){


        int freePlace = place.generatePlace(places);

        freeTicketIndex = freePlace;

        if(freePlace >= places.length){
            System.out.println("Sorry, No free places");
            return null;
        }

        places[freePlace] = place;


        Ticket ticket = new Ticket();
        ticket.open(freePlace);

        ensureCapacity();

        tickets[freePlace] = ticket;

        return ticket;
    }

    public Place takeCar(Ticket ticket, Transport transport, Place place){

        if(!hasTicket(ticket)){
            System.out.println("No ticket!");
            return null;
        }

        ticket.close();
        long duration = ticket.getDuration();
        double price = duration * 15;
        System.out.println("Where is my " + price + "hrn");

        place = places[ticket.getPlaceId()];

        // fix problem
        //places[ticket.getPlaceId()] = null;

        place.transport = transport;
        return place;
    }

    private boolean hasTicket(Ticket ticket) {
        for (int i = 0; i < tickets.length; i++) {
            if(tickets[freeTicketIndex].getNumber() == ticket.getNumber()){
                return true;
            }
        }

        return false;
    }

    private void ensureCapacity() {
        if(freeTicketIndex >= tickets.length){
            Ticket[] newTickets = new Ticket[tickets.length * 2];
            System.arraycopy(tickets,0,newTickets,0,tickets.length);
            tickets = newTickets;
        }
    }

}
