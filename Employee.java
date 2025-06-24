package labpractice.javaframe;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class Employee implements ActionListener {
    JLabel fName;
    JTextField fNametxt;
    JLabel stuEmail;
    JTextField stuEmailtxt;
    JLabel salary;
    JTextField salarytxt;
    JLabel netSalary;      
    JTextField netSalarytxt;
    JButton addButton;
    JButton viewButton;
    JTextField displayField;
    ArrayList<Employee_Operation> array=new ArrayList<>(); 
    Employee() {
        JFrame jframe = new JFrame("Employee Class");
        jframe.setLayout(null);
        jframe.setSize(400, 400);
        fName = new JLabel("Enter Your Name");
        fName.setBounds(10, 50, 150, 20);
        fNametxt = new JTextField("");
        fNametxt.setBounds(170, 50, 150, 20);
        stuEmail = new JLabel("Enter Email");
        stuEmail.setBounds(10, 90, 150, 20);
        stuEmailtxt = new JTextField("");
        stuEmailtxt.setBounds(170, 90, 150, 20);
        salary = new JLabel("Enter Salary");
        salary.setBounds(10, 130, 150, 20);
        salarytxt = new JTextField("");
        salarytxt.setBounds(170, 130, 150, 20);
        netSalary = new JLabel("Net Salary");
        netSalary.setBounds(10, 170, 150, 20);
        netSalarytxt = new JTextField("");
        netSalarytxt.setBounds(170, 170, 150, 20);
        netSalarytxt.setEditable(false);
        addButton = new JButton("Add");
        addButton.setBounds(10, 210, 150, 30);
        viewButton = new JButton("View");
        viewButton.setBounds(180, 210, 150, 30);
        addButton.addActionListener(this);
        viewButton.addActionListener(this);
        displayField = new JTextField("");
        displayField.setBounds(10, 260, 360, 230);

        jframe.add(fName);
        jframe.add(fNametxt);
        jframe.add(stuEmail);
        jframe.add(stuEmailtxt);
        jframe.add(salary);
        jframe.add(salarytxt);
        jframe.add(netSalary);
        jframe.add(netSalarytxt);
        jframe.add(addButton);
        jframe.add(viewButton);
        jframe.add(displayField);

        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setVisible(true);
    }

    Employee_Operation employee;

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            int b = Integer.parseInt(salarytxt.getText());
            int net = b * 12;
            netSalarytxt.setText(String.valueOf(net));
            employee = new Employee_Operation(fNametxt.getText(), stuEmailtxt.getText(), b);
            array.add(employee);
            fNametxt.setText("");
            stuEmailtxt.setText("");
            salarytxt.setText("");
            
        } else if (e.getSource() == viewButton) {
                displayField.setText(array.toString());
        }
    }
}
