import javax.xml.namespace.QName;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        boolean running = true;
//        object creation
        product_dataB productData = new product_dataB();
        view_all_product viewProducts = new view_all_product();
        search_product search_product=new search_product();
        Add_cart add_cart = new Add_cart();
        generateBill gb=new generateBill();

        while (running) {
            System.out.println(""" 
                    ===== ONLINE SHOPPING CART =====
                    1. View products
                    2. Search product
                    3. Add to cart
                    4. View cart
                    5. Remove product
                    6. Generate bill
                    7. Exit
                    Enter your choice:""");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    viewProducts.viewAll(productData);
                    System.out.println("you want to continue Y/N");
                    char i = sc.next().charAt(0);
                    if (i == 'y' || i == 'Y') {
                        System.out.println("-----***--***-----");
                    } else {
                        running = false;
                    }
                    break;
                case 2:
                    System.out.println("Search..");
                    String search_item = sc.next();
                    search_product.s_product(productData,search_item);
                    System.out.println("you want to continue Y/N");
                    char j = sc.next().charAt(0);
                    if (j == 'y' || j == 'Y') {
                        System.out.println("-----***--***-----");
                    } else {
                        running = false;
                    }
                    break;
                case 3:
                    char h;
                    do {
                        System.out.println("-----ADD TO CART-----");
                        viewProducts.viewAll(productData);
                        System.out.println("Which Product you add to cart? enter thet name..");
                        String addcartName = sc.next();
                        add_cart.addToCart(productData, addcartName);
                        System.out.println("you want to add a more product on cart Y/N");
                        h= sc.next().charAt(0);
                    }while (h == 'y' || h == 'Y');
                        System.out.println("you want to continue Y/N");
                        char k = sc.next().charAt(0);
                        if (k == 'y' || k == 'Y') {
                            System.out.println("-----***--***-----");
                        } else {
                            running = false;
                        }

                    break;
                case 4:
                    System.out.println("Your cart product");
                    add_cart.viewcart();
                    System.out.println("you want to continue Y/N");
                    char l = sc.next().charAt(0);
                    if (l == 'y' || l == 'Y') {
                        System.out.println("-----***--***-----");
                    } else {
                        running = false;
                    }
                    break;
                case 5:
                    System.out.println("------You added product--------");
                    add_cart.viewcart();
                    System.out.println("------wich one you remove?/enter product name-----");
                    String rename=sc.next();
                    add_cart.remove_product_cart(productData,rename);
                    System.out.println("you want to continue Y/N");
                    char m = sc.next().charAt(0);
                    if (m == 'y' || m == 'Y') {
                        System.out.println("-----***--***-----");
                    } else {
                        running = false;
                    }
                    break;
                case 6:
                    System.out.println("--------your bill-------");
                    gb.gBill(productData);
                    System.out.println("you want to continue Y/N");
                    char a = sc.next().charAt(0);
                    if (a == 'y' || a == 'Y') {
                        System.out.println("-----***--***-----");
                    } else {
                        running = false;
                    }
                    break;
                case 7:
                    System.out.println(".....Thanks for visiting.....");
                    running = false;
                    break;
                default:
                    System.out.println("......please entered valid character......");
            }


        }
    }
}