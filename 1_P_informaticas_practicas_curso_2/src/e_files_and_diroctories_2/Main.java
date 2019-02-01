package e_files_and_diroctories_2;

import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("G:/JAVA_POWER");
        File file2 = new File("G:/JAVA_POWER_2");

        file.mkdir();

        try {
            file2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        file2.delete();
    }
}
