package c_streams_3_buffer;

import java.io.*;

public class Buffer_read {
    FileReader input;
    String line;

    public Buffer_read() {
        try {
            input = new FileReader("masterplan.txt");
            BufferedReader my_buffer = new BufferedReader(input);

            line = my_buffer.readLine();

            while (line != null){
                System.out.println(line);
                line = my_buffer.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo");
        } catch (IOException e) {
            System.out.println("otro problema");
        }
    }
}
