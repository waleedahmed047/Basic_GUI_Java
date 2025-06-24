package labpractice.javaframe;

import javax.swing.*;
import java.awt.event.*;

public class JavaFrame implements ActionListener {
    JFrame frame;
    JButton employee;
    JButton passenger;
    JButton Train_Gui;
    JavaFrame() {
        frame = new JFrame("Main Menu");
        frame.setSize(400, 300);
        frame.setLayout(null);
        JLabel header = new JLabel("Train Management System");
        header.setBounds(100, 10, 250, 30);
        frame.add(header);
        JLabel empLabel = new JLabel("Employee:");
        empLabel.setBounds(30, 60, 100, 30);
        frame.add(empLabel);
        employee = new JButton("Employee");
        employee.setBounds(140, 60, 120, 30);
        employee.addActionListener(this);
        frame.add(employee);
        JLabel passLabel = new JLabel("Passenger:");
        passLabel.setBounds(30, 100, 100, 30);
        frame.add(passLabel);
        passenger = new JButton("Passenger");
        passenger.setBounds(140, 100, 120, 30);
        passenger.addActionListener(this);
        frame.add(passenger);
        JLabel trainLabel = new JLabel("Train:");
        trainLabel.setBounds(30, 140, 100, 30);
        frame.add(trainLabel);
        Train_Gui = new JButton("Train");
        Train_Gui.setBounds(140, 140, 120, 30);
        Train_Gui.addActionListener(this);
        frame.add(Train_Gui);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == employee) {
            new Check_Password();
        } else if (e.getSource() == passenger) {
            Passenger p1 = new Passenger();
        } else if (e.getSource() == Train_Gui) {
            new Check_Password();
        }
    }

    public static void main(String[] args) {
        new JavaFrame();
    }
}
