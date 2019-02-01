package d_serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Administrator boss = new Administrator("Agustín", 50000, 2018, 03, 8);
        boss.setIncentive(7500);

        Employee[] personal = new Employee[3];
        Employee[] personal_loaded = {};

        personal[0] = boss;
        personal[1] = new Employee("Ana", 2500, 2008, 8, 03);
        personal[2] = new Employee("Luis", 18000, 2012, 9, 24);

        //guardar objeto
        try {
            FileOutputStream output = new FileOutputStream("file");
            ObjectOutputStream object_output = new ObjectOutputStream(output);
            object_output.writeObject(personal);
            output.close();
            System.out.println("El objeto se grabó exitosamente");
        } catch (IOException e) {
            e.printStackTrace();
        }

        //cargar objeto
        try {
            FileInputStream input = new FileInputStream("file");
            ObjectInputStream object_input = new ObjectInputStream(input);
            personal_loaded = (Employee[]) object_input.readObject();
            input.close();
            System.out.println("El objeto se cargó exitosamente");
        } catch (FileNotFoundException e) {
            System.out.println("no se encontró el archivo");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("no se pudo cargar el objeto");
        }

        for(Employee employee : personal_loaded)
            System.out.println(employee);
    }
}