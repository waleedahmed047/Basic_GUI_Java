
package labpractice.javaframe;


import javax.swing.*;
import java.awt.event.*;
public class JavaFrame  implements ActionListener{
    JFrame frame;
    JButton employee;
    JButton passenger;
    
    JavaFrame(){
        frame = new JFrame("Main Menu");
         frame.setSize(300, 200);
         frame.setLayout(null);
         
        employee = new JButton("Employee");
        employee.setBounds(50, 50, 100, 30);
        employee.addActionListener(this);        
        passenger = new JButton("Passenger");
        passenger.setBounds(160, 50, 100, 30);
        passenger.addActionListener(this);
        frame.add(employee);
        frame.add(passenger);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == employee) {
                 Employee e1=new Employee();
        } else if (e.getSource() == passenger) {
                   Passenger p1=new Passenger();

        }
    }
    public static void main(String[] args) {
     
     // calling
     
      new JavaFrame();
       
    }
}
