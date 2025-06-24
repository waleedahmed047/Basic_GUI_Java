/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labpractice.javaframe;

import javax.swing.*;
import java.awt.event.*;
public class Check_Password implements ActionListener {


    JLabel userLabel, passLabel;
    JTextField userText,passText;
    JButton signInButton;
    JTextField resultField;
    
    Check_Password() {
        JFrame frame = new JFrame("Login GUI");
        frame.setSize(350, 250);
        frame.setLayout(null);

        userLabel = new JLabel("Username:");
        userLabel.setBounds(30, 30, 80, 25);
        frame.add(userLabel);

        userText = new JTextField();
        userText.setBounds(120, 30, 165, 25);
        frame.add(userText);

        passLabel = new JLabel("Password:");
        passLabel.setBounds(30, 70, 80, 25);
        frame.add(passLabel);

        passText = new JTextField();
        passText.setBounds(120, 70, 165, 25);
        frame.add(passText);
        signInButton = new JButton("Sign In");
        signInButton.setBounds(120, 110, 100, 30);
        signInButton.addActionListener(this);
        frame.add(signInButton);

        resultField = new JTextField();
        resultField.setBounds(30, 160, 270, 25);
        resultField.setEditable(false);
        frame.add(resultField);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String username = userText.getText();
        String password = passText.getText();


        if (username.equals("admin") && password.equals("Employee")) {
            new Employee();
        } 
        else if (username.equals("admin") && password.equals("Train")) {
              new Train_Gui();
        }
        else {
            resultField.setText("Wrong Username or Password!");
        }
    }
}

