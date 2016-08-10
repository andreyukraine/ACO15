package week1.parking;

/**
 * Created by IT on 07.08.2016.
 */
public class Parking {

    private Car[] places;
    private int freePlaceIndex; // default 0

    private Ticket[] tickets;
    private int freeTicketIndex;

    public void build(int placesCount){
        places = new Car[placesCount];
        tickets = new Ticket[1000];
    }

    public Ticket acceptCar(Car car){

        if(freePlaceIndex >= places.length){
            System.out.println("Sorry, No free places");
            return null;
        }

        places[freePlaceIndex] = car;

        Ticket ticket = new Ticket();
        ticket.open(freePlaceIndex);

        freePlaceIndex++;

        ensureCapacity();

        tickets[freeTicketIndex++] = ticket;

        return ticket;
    }


    public Car takeCar(Ticket ticket){

        if(!hasTicket(ticket)){
            System.out.println("No ticket!");
            return null;
        }

        ticket.close();
        long duration = ticket.getDuration();
        double price = duration * 15;
        System.out.println("Where is my " + price + "hrn");

        Car forRet = places[ticket.getPlaceId()];

        // fix problem
        places[ticket.getPlaceId()] = null;

        return forRet;
    }

    private boolean hasTicket(Ticket ticket) {
        for (int i = 0; i < tickets.length; i++) {
            if(tickets[i].getNumber() == ticket.getNumber()){
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
