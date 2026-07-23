import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class file_handling {

        public static void main(String[] args){
            try{

                File f = new File("myfile.txt");
                /*Scanner sc = new Scanner(f);

                while(sc.hasNextLine()){
                    String data =sc.nextLine();
                    System.out.println(data);
                }
                sc.close();*/
               /* FileWriter f =new FileWriter("D://myfile.txt");
                f.write("This file are written");
                f.close();
                System.out.println("file has wirrten");*/
                if (f.createNewFile()){
                    System.out.println("file created:"+f.getName());
                }else {
                    System.out.println("file already created");
                }
                if (f.delete()){
                    System.out.println("file is deleted");
                }
                if (f.canRead()){
                    System.out.println("this file is readable");
                }else {
                    System.out.println("this file not readable ");
                }
                System.out.println(f.getAbsolutePath());
            }catch (IOException e){
                System.out.println("Error:"+e);
            }
        }
    }

