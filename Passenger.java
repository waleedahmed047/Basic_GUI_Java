package labpractice.javaframe;

import javax.swing.*;
import java.awt.event.*;

public class Passenger implements ActionListener {
    JLabel fName;
    JTextField fNametxt;
    JLabel cnic;
    JTextField cnictxt;
    JLabel ticket;
    JTextField tickettxt;
    JLabel tax;
    JTextField taxtxt;
    JButton addButton;
    JButton viewButton;
    JTextField displayField;

    Passenger() {
        JFrame jframe = new JFrame("Passenger");
        jframe.setLayout(null);
        jframe.setSize(400, 400);
        fName = new JLabel("Enter Your Name");
        fName.setBounds(10, 50, 150, 20);
        fNametxt = new JTextField("");
        fNametxt.setBounds(170, 50, 150, 20);
        cnic = new JLabel("Enter Your CNIC");
        cnic.setBounds(10, 90, 150, 20);
        cnictxt = new JTextField("");
        cnictxt.setBounds(170, 90, 150, 20);
        ticket = new JLabel("Enter Tickets");
        ticket.setBounds(10, 130, 150, 20);
        tickettxt = new JTextField("");
        tickettxt.setBounds(170, 130, 150, 20);
        tax = new JLabel("Tax");
        tax.setBounds(10, 170, 150, 20);
        taxtxt = new JTextField("");
        taxtxt.setBounds(170, 170, 150, 20);
        addButton = new JButton("Add");
        addButton.setBounds(10, 210, 150, 30);
        viewButton = new JButton("View");
        viewButton.setBounds(180, 210, 150, 30);
        addButton.addActionListener(this);
        viewButton.addActionListener(this);
        displayField = new JTextField("");
        displayField.setBounds(10, 260, 350, 30);

        jframe.add(fName);
        jframe.add(fNametxt);
        jframe.add(cnic);
        jframe.add(cnictxt);
        jframe.add(ticket);
        jframe.add(tickettxt);
        jframe.add(tax);
        jframe.add(taxtxt);
        jframe.add(addButton);
        jframe.add(viewButton);
        jframe.add(displayField);

        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setVisible(true);
    }

    Passenger_Data passenger;

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            int a = Integer.parseInt(cnictxt.getText());
            int b = Integer.parseInt(tickettxt.getText());

            int taxValue = b * 50;
            taxtxt.setText(String.valueOf(taxValue));

            passenger = new Passenger_Data(fNametxt.getText(), a, b);
        } else if (e.getSource() == viewButton) {
                displayField.setText(passenger.toString());
             
        }
    }
}
