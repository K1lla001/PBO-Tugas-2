import javax.swing.*;
import java.awt.event.ActionListener;

public class EmployeeForm extends JFrame {
    private JLabel firstNameLabel;
    private JLabel lastNameLabel;
    private JLabel addressLabel;
    private JLabel phoneNumberLabel;
    private JLabel emailLabel;
    private JLabel NIKLabel;
    private JTextField firstNameTextField;
    private JTextField lastNameTextField;
    private JTextField addressTextField;
    private JTextField phoneNumberTextField;
    private JTextField emailTextField;
    private JTextField NIKTextField;

    private JButton submitButton;

    public EmployeeForm() {
        setTitle("Employee Information Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(400, 300);
        setLocationRelativeTo(null);

        setVisible(true);

        firstNameLabel = new JLabel("First Name:");
        firstNameLabel.setBounds(20, 20, 80, 25);
        add(firstNameLabel);

        lastNameLabel = new JLabel("Last Name:");
        lastNameLabel.setBounds(20, 50, 80, 25);
        add(lastNameLabel);

        addressLabel = new JLabel("Address:");
        addressLabel.setBounds(20, 80, 80, 25);
        add(addressLabel);

        phoneNumberLabel = new JLabel("Phone Number:");
        phoneNumberLabel.setBounds(20, 110, 100, 25);
        add(phoneNumberLabel);

        emailLabel = new JLabel("Email:");
        emailLabel.setBounds(20, 140, 80, 25);
        add(emailLabel);

        NIKLabel = new JLabel("NIK:");
        NIKLabel.setBounds(20, 170, 80, 25);
        add(NIKLabel);

        // Text Fields
        firstNameTextField = new JTextField();
        firstNameTextField.setBounds(120, 20, 160, 25);
        add(firstNameTextField);

        lastNameTextField = new JTextField();
        lastNameTextField.setBounds(120, 50, 160, 25);
        add(lastNameTextField);

        addressTextField = new JTextField();
        addressTextField.setBounds(120, 80, 160, 25);
        add(addressTextField);

        phoneNumberTextField = new JTextField();
        phoneNumberTextField.setBounds(120, 110, 160, 25);
        add(phoneNumberTextField);

        emailTextField = new JTextField();
        emailTextField.setBounds(120, 140, 160, 25);
        add(emailTextField);

        NIKTextField = new JTextField();
        NIKTextField.setBounds(120, 170, 160, 25);
        add(NIKTextField);

        submitButton = new JButton("Submit");
        submitButton.setBounds(120, 220, 80, 25);
        add(submitButton);

        setSize(320, 300);
        setVisible(true);
    }

    public String getFirstName() {
        return firstNameTextField.getText().trim();
    }

    public String getLastName() {
        return lastNameTextField.getText().trim();
    }

    public String getAddress() {
        return addressTextField.getText().trim();
    }

    public String getPhoneNumber() {
        return phoneNumberTextField.getText().trim();
    }

    public String getEmail() {
        return emailTextField.getText().trim();
    }

    public String getNIK() {
        return NIKTextField.getText().trim();
    }

    public void addSubmitListener(ActionListener submitListener) {
        submitButton.addActionListener(submitListener);
    }
}
