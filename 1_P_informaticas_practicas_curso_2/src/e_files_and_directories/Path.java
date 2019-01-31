package e_files_and_directories;

import java.io.File;

public class Path {

    private File path = new File("C:/Users/Agustin/IdeaProjects/P_informaticas_intelliJ");
    private String[] file_list = path.list();

    void printList() {
        System.out.println("\nFiles and Folders:");
        for (String file : file_list)
            System.out.println(file);
    }

    void printFolders(){
        System.out.println("\nFolders:");
        for (String file : file_list)
            if (new File(path.getAbsolutePath(), file).isDirectory())
                System.out.println(file);
    }

    void printFiles(){
        System.out.println("\nFiles:");
        for (String file : file_list)
            if (new File(path.getAbsolutePath(), file).isDirectory() == false)
                System.out.println(file);
    }
}
