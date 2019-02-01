package e_files_and_directories;

import java.io.*;

public class MainExperiment {
    public static void main(String[] args) {
        PathRecursive path_1 = new PathRecursive("D:/Agustin");

        path_1.showFolders();
    }
}

class PathRecursive {
    String path;
    public PathRecursive(String path) {
         this.path = path;
    }

    public void showFolders(){
        showFolders(new File(path), 0);
    }

    private void showFolders(File file, int level){
        String[] list = file.list();

        for(String item : list){
            File temp_file = new File(file.getAbsolutePath(), item);
            if (temp_file.isDirectory()){
                System.out.println(ConsoleColor.ALL[level%8]+tabs(level)+item);
                showFolders(temp_file, level+1);
            }
        }
    }

    private String tabs(int num){
        String s = "";
        for(int i=0; i<num; i++)
            s = s +"\t";

        return s;
    }
}






