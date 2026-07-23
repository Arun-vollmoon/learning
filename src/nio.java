import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class nio {


           public static void main(String[] args) throws Exception {

               try {
                   Path path = Paths.get("student.txt");
                   Scanner sc =new Scanner(path);

//                   Files.createFile(path);
//                   System.out.println("File Created");
//                   System.out.println(path.getRoot());
                   if (path.toFile().createNewFile()){
                       System.out.println("file name"+path.getFileName());
                   }else {
                       System.out.println("file is already created");
                   }
                   while(sc.hasNextLine()){
                       String data =sc.nextLine();
                       System.out.println(data);
                   }
                   Files.write(path, List.of("Hello", "Welcome to Java"));
                   System.out.println("file is write");
               }catch (Exception e){
                   System.out.println("Error:"+e);
               }
            }
        }
