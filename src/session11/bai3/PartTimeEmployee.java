package session11.bai3;

public class PartTimeEmployee extends Employee implements BonusEligible {
    private double hourlyRate;
    private int workingHour;

    public PartTimeEmployee(int id, String name, double hourlyRate, int workingHour) {
        super(id, name);
        this.hourlyRate = hourlyRate;
        this.workingHour = workingHour;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * workingHour;
    }

    @Override
    public double calculateBonus() {
        return workingHour > 100 ? 500 : 0; // Ví dụ: nếu làm >100h thì thưởng 500
    }
}
