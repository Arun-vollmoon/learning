@FunctionalInterface
interface inter{
    int add(int a, int b);
}

public class functional_interface {
    public static void main(String[] args) {
        inter in=(a,b) -> a+b ;
        System.out.println(in.add(3,4));

    }
}
