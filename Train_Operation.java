
package labpractice.javaframe;
import javax.swing.*;

public class Train_Operation {
    

    String name;
    String route;
    int price;
    String totalseats;

    public Train_Operation(String name, String route,String totalseats, int price) {
        this.name = name;
        this.route = route;
        this.price = price;
        this.totalseats=totalseats;
    }

    public String getName() {
        return name;
    }

    public String getRoute() {
        return route;
    }

    public int getPrice() {
        return price;
    }

    public String getTotalseats() {
        return totalseats;
    }

    @Override
    public String toString() {
        return  "name=" + name + ", route=" + route + ", price=" + price + ", totalseats=" + totalseats +"\n";
    }
    
    

    
}