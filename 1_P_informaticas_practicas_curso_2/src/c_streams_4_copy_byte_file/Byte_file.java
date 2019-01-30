package c_streams_4_copy_byte_file;

import java.io.*;

public class Byte_file {
    int unit=0;

    public Byte_file() {

        try {
            FileInputStream input_byte = new FileInputStream("assets/anota.jpg");
            FileOutputStream output_byte = new FileOutputStream("assets/anota2.jpg");

            unit = input_byte.read();

            while(unit != -1){
                output_byte.write(unit);

                unit = input_byte.read();
            }

            input_byte.close();
            output_byte.close();

        } catch (FileNotFoundException e) {
            System.out.println("No se pudo cargar el archivo");
        } catch (IOException e) {
            System.out.println("Error al leer");
        }
    }
}
