import java.util.ArrayList;
import java.util.List;

public class product_dataB  {

    List<product> products = new ArrayList<>();

    public product_dataB() {

        products.add(new product(101, "Laptop", 65000,"hardwares"));
        products.add(new product(102, "Mouse", 700, "hardwares"));
        products.add(new product(103, "Keyboard", 1200, "hardwares"));
        products.add(new product(104, "Shoes", 2500, "accessories"));
        products.add(new product(105, "Bag", 1800, "accessories"));

    }

    public List<product> getProducts() {
        return products;
    }

}