package c_streams_1_read_files;

import java.io.*;

public class Read_file {

    public void read(){
        try {
            FileReader input = new FileReader("G:/hola.txt");

            int c = input.read();

            while(c != -1){
                System.out.print((char)c);
                c = input.read();
            }

            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo");
        } catch (IOException e) {
            System.out.println("algún error");
        }
    }
}
