import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Name implements Comparable<Name> {
    int id;
    String name;

    Name(int id,String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public int compareTo(Name other) {

        if (other==null){
            throw new NullPointerException("Connot compare with null");
        }
        return Integer.compare(this.id,other.id);
    }
    public String toString(){
        return id+"-"+name;
    }
}
   public class compare {
       public static void main(String[] args) {
           List<Name> name=new ArrayList<>();
           name.add(new Name(3,"Arun"));
           name.add(new Name(1,"kumar"));
           name.add(new Name(2,"siva"));

           Collections.sort(name);
           System.out.println(name);
       }
}
