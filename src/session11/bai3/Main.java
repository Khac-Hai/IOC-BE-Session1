package session11.bai3;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new FullTimeEmployee(1, "Nguyen Van A", 1000);
        employees[1] = new PartTimeEmployee(2, "Tran Thi B", 10, 120);
        employees[2] = new FullTimeEmployee(3, "Le Van C", 1500);

        for (Employee emp : employees) {
            emp.showInfo();
            System.out.println("Salary: " + emp.calculateSalary());

            if (emp instanceof BonusEligible) {
                BonusEligible bonusEmp = (BonusEligible) emp;
                System.out.println("Bonus: " + bonusEmp.calculateBonus());
            }
            System.out.println("-------------------");
        }
    }
}
