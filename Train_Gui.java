package labpractice.javaframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;

public class Train_Gui implements ActionListener {

    JLabel fName;
    JTextField fNametxt;
    JLabel Route;
    JTextField Routetxt;
    JLabel price;
    JTextField pricetxt;
    JLabel totalSeats;
    JTextField totalSeatstxt;
    JLabel netamount;
    JTextField netamounttxt;
    JButton addButton;
    JButton viewButton;
    JTextField displayField;
    ArrayList<Train_Operation> array = new ArrayList<>();

    Train_Gui() {
        JFrame jframe = new JFrame("Train Class");
        jframe.setLayout(null);
        jframe.setSize(400, 450);

        fName = new JLabel("Enter Train Name:");
        fName.setBounds(10, 50, 150, 20);
        fNametxt = new JTextField("");
        fNametxt.setBounds(170, 50, 150, 20);

        Route = new JLabel("Enter Total Route:");
        Route.setBounds(10, 90, 150, 20);
        Routetxt = new JTextField("");
        Routetxt.setBounds(170, 90, 150, 20);

        price = new JLabel("Enter Per Seat Price:");
        price.setBounds(10, 130, 150, 20);
        pricetxt = new JTextField("");
        pricetxt.setBounds(170, 130, 150, 20);

        totalSeats = new JLabel("Total Seats:");
        totalSeats.setBounds(10, 170, 150, 20);
        totalSeatstxt = new JTextField("");
        totalSeatstxt.setBounds(170, 170, 150, 20);

        netamount = new JLabel("Total Amount Genrate:");
        netamount.setBounds(10, 210, 150, 20);
        netamounttxt = new JTextField("");
        netamounttxt.setBounds(170, 210, 150, 20);
        netamounttxt.setEditable(false);

        addButton = new JButton("Add");
        addButton.setBounds(10, 250, 150, 30);
        viewButton = new JButton("View");
        viewButton.setBounds(180, 250, 150, 30);
        addButton.addActionListener(this);
        viewButton.addActionListener(this);

        displayField = new JTextField("");
        displayField.setBounds(10, 300, 360, 230);

        jframe.add(fName);
        jframe.add(fNametxt);
        jframe.add(Route);
        jframe.add(Routetxt);
        jframe.add(price);
        jframe.add(pricetxt);
        jframe.add(totalSeats);
        jframe.add(totalSeatstxt);
        jframe.add(netamount);
        jframe.add(netamounttxt);
        jframe.add(addButton);
        jframe.add(viewButton);
        jframe.add(displayField);

        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setVisible(true);
    }

    Train_Operation train;

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            int pricePerSeat = Integer.parseInt(pricetxt.getText());
            int seats = Integer.parseInt(totalSeatstxt.getText());
            int net = pricePerSeat * seats;
            netamounttxt.setText(String.valueOf(net));

            train = new Train_Operation(fNametxt.getText(), Routetxt.getText(),totalSeatstxt.getText(), pricePerSeat);
            array.add(train);

            fNametxt.setText("");
            Routetxt.setText("");
            pricetxt.setText("");
            totalSeatstxt.setText("");
        } else if (e.getSource() == viewButton) {
            displayField.setText(array.toString());
        }
    }
}
