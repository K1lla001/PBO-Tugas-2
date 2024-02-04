public class Main {
    public static void main(String[] args) {
        Employee model = new Employee();
        EmployeeForm view = new EmployeeForm();
        EmployeeController controller = new EmployeeController(view, model);
    }
}
