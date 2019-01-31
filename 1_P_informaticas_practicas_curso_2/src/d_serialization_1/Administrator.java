package d_serialization_1;

public class Administrator extends Employee{
    double incentive=0;
    public Administrator(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
    }

    @Override
    public double getSalary() {
        return super.getSalary() + incentive;
    }

    @Override
    public String toString() {
        return super.toString() + "\nInventive: " + incentive;
    }

    public double getIncentive() {
        return incentive;
    }

    public void setIncentive(double incentive) {
        this.incentive = incentive;
    }
}
