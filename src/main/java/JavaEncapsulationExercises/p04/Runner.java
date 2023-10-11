package JavaEncapsulationExercises.p04;

public class Runner {
    public static void main(String[] args) {


        Employee employee = new Employee();


        employee.setEmployee_id(15);
        employee.setEmployee_name("Ali Can");
        employee.setEmployee_salary(5900.0);


        int employeeId = employee.getEmployee_id();
        String employeeName = employee.getEmployee_name();
        String formattedSalary = employee.getFormattedSalary();


        System.out.println("Employee Details:");
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + formattedSalary);



    }
}
