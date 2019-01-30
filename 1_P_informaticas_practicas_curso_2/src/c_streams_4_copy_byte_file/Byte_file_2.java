package c_streams_4_copy_byte_file;

import java.io.*;

public class Byte_file_2 {
    long file_size=0;
    byte[] file_copy;

    public Byte_file_2() {

        try {
            //Creamos stream de lectura
            FileInputStream input_byte = new FileInputStream("assets/anota.jpg");

            //Creamos stream de escritura
            FileOutputStream output_byte = new FileOutputStream("assets/anota3.jpg");

            //Obtenemos la cantidad de bytes del archivo de lectura
            file_size = input_byte.getChannel().size();

            //Creamos un array del tamaño que averiguamos antes
            file_copy = new byte [(int)file_size];

            //Copiamos el archivo de lectura al array
            for (int i =0; i<file_size; i++)
                file_copy[i] = (byte)input_byte.read();

            //Escribimos el array en el stream de escritura
            output_byte.write(file_copy);

            input_byte.close();
            output_byte.close();

        } catch (FileNotFoundException e) {
            System.out.println("No se pudo cargar el archivo");
        } catch (IOException e) {
            System.out.println("Error al leer");
        }
    }
}
