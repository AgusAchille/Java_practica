package c_streams_2_write_files;

import java.io.FileWriter;
import java.io.IOException;

public class File_write {
    public File_write() {
        try {

            //Creo un archivo para escritura, si existía lo borra
            FileWriter writer = new FileWriter("chau.txt");

            writer.write("Agustín");
            writer.close();

            //Abro un archivo para escritura y se agrega al final
            FileWriter writer_append = new FileWriter("chau.txt", true);

            writer_append.write(" Achille");
            writer_append.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
