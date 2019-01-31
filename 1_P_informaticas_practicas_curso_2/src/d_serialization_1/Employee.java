package d_serialization_1;

import java.io.*;
import java.util.*;

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String name;
    private double salary;
    private Date contact_date;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        GregorianCalendar calendar = new GregorianCalendar(year,month-1, day);
        contact_date = calendar.getTime();
    }

    public void raiseSalary(double raisePercentage){
        salary += (salary/100) * raisePercentage;
    }

    @Override
    public String toString() {
        return "\nName: " + name + "\nSalary: $" + salary + "\nContract date: " + contact_date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getContact_date() {
        return contact_date;
    }

    public void setContact_date(Date contact_date) {
        this.contact_date = contact_date;
    }
}
