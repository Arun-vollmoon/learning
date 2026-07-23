import java.io.*;

class person1 implements Serializable {

    private static final long serialVersionUID = 1L;

    int id;
    String name;

    person1(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
public class deserialization {

    public static void main(String[] args) {

        try {
            FileInputStream fos = new FileInputStream("D://myfile.ser");
            ObjectInputStream oos = new ObjectInputStream(fos);
            person p=(person) oos.readObject();
            oos.close();
            fos.close();
            System.out.println("ID   : " + p.id);
            System.out.println("Name : " + p.name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}