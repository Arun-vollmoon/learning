import java.awt.geom.Area;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class generic{

/*    private T t;

    public void Add(T t) {
        this.t=t;
    }*/

   static double print(List<? extends Number> list){
       double sum = 0.0;
       for (Number i : list) {
           sum += i.doubleValue();
       }

       return sum;

   }
    public void getarea(){}

    public static void main(String[] args) {

       List<Integer> num= Arrays.asList(1,2,3,4,5);
        System.out.println("Total sum is:" + print(num));

        /*generic <Integer> rectangle=new generic<Integer>();
        generic<Double> circle=new generic<Double>();

        rectangle.Add(10);
        circle.Add(2.4);*/


    }
}
