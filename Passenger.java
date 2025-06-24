package labpractice.javaframe;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Passenger implements ActionListener {
    JLabel fName;
    JTextField fNametxt;
    JLabel cnic;
    JTextField cnictxt;
    JLabel travelLabel;
    JTextField travelField;
    JLabel classLabel;
    JTextField classField;

    JLabel ticket;
    JTextField tickettxt;
    JLabel tax;
    JTextField taxtxt;
    JButton addButton;
    JButton viewButton;
    JTextField displayField;
    ArrayList<Passenger_Data> array = new ArrayList<>();

    Passenger() {
        JFrame jframe = new JFrame("Passenger");
        jframe.setLayout(null);
        jframe.setSize(450, 500);

        fName = new JLabel("Enter Your Name");
        fName.setBounds(10, 50, 150, 20);
        fNametxt = new JTextField("");
        fNametxt.setBounds(170, 50, 150, 20);

        cnic = new JLabel("Enter Your CNIC");
        cnic.setBounds(10, 90, 150, 20);
        cnictxt = new JTextField("");
        cnictxt.setBounds(170, 90, 150, 20);
        travelLabel = new JLabel("Where you want to travel");
        travelLabel.setBounds(10, 130, 180, 20);
        travelField = new JTextField("");
        travelField.setBounds(168, 130, 150, 20);
        classLabel = new JLabel("Train Class");
        classLabel.setBounds(10, 170, 150, 20);
        classField = new JTextField("");
        classField.setBounds(170, 170, 150, 20);
        ticket = new JLabel("Enter Tickets");
        ticket.setBounds(10, 210, 150, 20);
        tickettxt = new JTextField("");
        tickettxt.setBounds(170, 210, 150, 20);
        tax = new JLabel("Tax");
        tax.setBounds(10, 250, 150, 20);
        taxtxt = new JTextField("");
        taxtxt.setBounds(170, 250, 150, 20);
        taxtxt.setEditable(false);
        addButton = new JButton("Add");
        addButton.setBounds(10, 290, 150, 30);
        viewButton = new JButton("View");
        viewButton.setBounds(180, 290, 150, 30);
        addButton.addActionListener(this);
        viewButton.addActionListener(this);

        displayField = new JTextField("");
        displayField.setBounds(10, 340, 380, 230);

        jframe.add(fName);
        jframe.add(fNametxt);
        jframe.add(cnic);
        jframe.add(cnictxt);
        jframe.add(travelLabel);
        jframe.add(travelField);
        jframe.add(classLabel);
        jframe.add(classField);
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

            passenger = new Passenger_Data(fNametxt.getText(),classField.getText(),travelField.getText(),a,b);
            array.add(passenger);

            fNametxt.setText("");
            cnictxt.setText("");
            travelField.setText("");
            classField.setText("");
            tickettxt.setText("");

        } else if (e.getSource() == viewButton) {
            displayField.setText(array.toString());
        }
    }
}
