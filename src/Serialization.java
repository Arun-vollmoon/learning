import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


import java.io.Serializable;

class person implements Serializable {

    private static final long serialVersionUID = 1L;

    int id;
    String name;

    person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
public class Serialization {

    public static void main(String[] args) {

        try {
            person p = new person(16, "Arun");

            FileOutputStream fos = new FileOutputStream("D://myfile.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(p);


            oos.close();
            fos.close();

            System.out.println("Serializable succesfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}