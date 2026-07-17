public class view_all_product {

    public void viewAll(product_dataB productData) {

        System.out.println("ID\tNAME\t\tPRICE\tCATEGORY");

        productData.getProducts()
                .stream()
                .forEach(System.out::println);
    }

}