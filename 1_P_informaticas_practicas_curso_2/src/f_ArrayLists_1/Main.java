package f_ArrayLists_1;

import java.lang.instrument.Instrumentation;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int array_size = 0;

        ArrayList<Employee> employee_list = new ArrayList<Employee>();

        employee_list.add(new Employee("Ana", 25000, 2008, 8, 07));
        employee_list.add(new Employee("Juan", 46000, 2010, 9, 05));
        employee_list.add(new Employee("Nancy", 85000, 1992, 2, 01));



        employee_list.set(0, new Employee("Lohana", 9500, 2005,6,15));

        for(Employee ele : employee_list){
            System.out.println(ele);
        }

        array_size = employee_list.size();
        System.out.println("\nCantidad de elementos: " + array_size);

        employee_list.trimToSize();

        System.out.println(employee_list.get(2));

        // Copiar arrayList a un array
        Employee[] employee_array = new Employee[employee_list.size()];
        employee_list.toArray(employee_array);
    }
}
