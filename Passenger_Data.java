
package labpractice.javaframe;

public class Passenger_Data {
    String name;
     int id;
    int ticket;

    public Passenger_Data(String name, int id, int ticket) {
        this.name = name;
        this.id = id;
        this.ticket = ticket;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getTicket() {
        return ticket;
    }

    @Override
    public String toString() {
        return  "  Name: "+name +"  CNIC: "+ id+"  Tickets: " + ticket;
    }
    
}
