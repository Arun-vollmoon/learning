import java.util.ArrayList;
import java.util.List;

public class Add_cart {

    static List<product>  Addcart = new ArrayList<>();

    public void addToCart(product_dataB productdata,String Cname) {
        product cart= productdata.getProducts()
                .stream()
                .filter(AddCart -> AddCart.getName().toLowerCase().contains(Cname.toLowerCase()))
                .findAny()
                .orElse(null);
        if (cart!=null){
            Addcart.add(cart);
            System.out.println(cart.getName() + " added to cart succesfully.");
        }else {
            System.out.println("This product not in your cart");
        }
    }
    void viewcart(){
        if (Addcart.isEmpty()){
            System.out.println("cart is empty");
        }else {
            Addcart.forEach(System.out::println);
        }
    }

    public void remove_product_cart(product_dataB productdata,String Rname) {
        product cart= productdata.getProducts()
                .stream()
                .filter(AddCart -> AddCart.getName().toLowerCase().contains(Rname.toLowerCase()))
                .findAny()
                .orElse(null);
        if (cart!=null){
            Addcart.remove(cart);
            System.out.println(cart.getName() + " Remove to cart succesfully.");
        }else {
            System.out.println("This product not in your cart");
        }
    }
}
