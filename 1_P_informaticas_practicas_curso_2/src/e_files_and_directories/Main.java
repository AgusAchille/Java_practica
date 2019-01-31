package e_files_and_directories;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("src");

        String file_path = file.getAbsolutePath();
        System.out.println(file_path);

        boolean file_exists = file.exists();
        System.out.println(file_exists);

        Path path = new Path();
        path.printFiles();
        path.printFolders();
        path.printList();
    }
}
