
package labpractice.javaframe;

public class Passenger_Data {
    String name;
     int id;
    int ticket;
    String TrainClass;
    String travel;
    public Passenger_Data(String name,String Class,String travel, int id, int ticket) {
        this.name = name;
        this.id = id;
        this.ticket = ticket;
        this.TrainClass=Class;
        this.travel=travel;
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

    public String getTrainClass() {
        return TrainClass;
    }

    public String getTravel() {
        return travel;
    }

    public String toString() {
        return  "name=" + name + ", id=" + id + ", ticket=" + ticket + ", TrainClass=" + TrainClass + ", travel=" + travel + "\n" ;
    }



 
    
}
