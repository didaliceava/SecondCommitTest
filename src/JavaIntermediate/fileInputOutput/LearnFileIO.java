package JavaIntermediate.fileInputOutput;


import java.io.*;

public class LearnFileIO {

    /*
    we have to give java a path to find a file and there are two types of paths:
    1-Absolute path; provide the path from the root
    2-relative path

     */

    static String absolutePath;
    static String relaPath;
    static String filePath;

    public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("user.dir"));
        absolutePath = System.getProperty("user.dir");
        relaPath = "\\src\\JavaIntermediate\\fileInputOutput/\\example.txt";
        filePath = absolutePath + relaPath;

        File newfile = new File(filePath);
        FileInputStream fis = new FileInputStream(newfile);//this opens a channel that will take the data from the file(example.txt) and bring it to JVM
        InputStreamReader isr= new InputStreamReader(fis);
        BufferedReader br= new BufferedReader(isr);
        String line;
        while(  (line=br.readLine()) !=null  ){
            System.out.println(line);
        }

    }


}
