package JavaInheritanceExercises.p04;

public class HRManager extends Employee {

    public HRManager(double salary) {
        super(salary);
    }

    @Override
    public void work() {
        System.out.println("\nManaging employees");
    }

    public void addEmployee() {
        System.out.println("\nAdding new employee!");
    }

}
