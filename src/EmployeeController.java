import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeController {
    private EmployeeForm view;
    private Employee model;

    public EmployeeController(EmployeeForm view, Employee model) {
        this.view = view;
        this.model = model;

        this.view.addSubmitListener(new SubmitListener());
    }

    class SubmitListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            model.setFirstName(view.getFirstName());
            model.setLastName(view.getLastName());
            model.setAddress(view.getAddress());
            model.setPhoneNumber(view.getPhoneNumber());
            model.setEmail(view.getEmail());
            model.setNIK(view.getNIK());

            System.out.println("Employee Information:");
            System.out.println("First Name: " + model.getFirstName());
            System.out.println("Last Name: " + model.getLastName());
            System.out.println("Address: " + model.getAddress());
            System.out.println("Phone Number: " + model.getPhoneNumber());
            System.out.println("Email: " + model.getEmail());
            System.out.println("NIK: " + model.getNIK());

            if(model.getFirstName().isBlank() || model.getFirstName().isEmpty()){
                JOptionPane.showMessageDialog(null, "PLEASE FILL THE FORM \nMinimum requirement is first name!");
            }else {
                String message = "Hello " + model.getFirstName() + " " + model.getLastName();
                JOptionPane.showMessageDialog(null, message);
                view.dispose();
            }
        }
    }
}
