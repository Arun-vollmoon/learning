public class generateBill extends Add_cart {
    public void gBill(product_dataB productData){

        if (Addcart.isEmpty()){
            System.out.println("cart is empty");
        }else {
            System.out.println("ID\tProduct\t\tPrice");
            Addcart.forEach(product ->
                    System.out.printf("%-5d %-15s ₹%.2f%n",
                      product.getId(),
                      product.getName(),
                      product.getPrice()));
            double total=Addcart.stream()
                    .mapToDouble(product::getPrice)
                    .sum();
            System.out.println("Total \t "+total);


        }
    }
}
