public class search_product {
    void s_product(product_dataB productdata,String Sname){

       product result= productdata.getProducts()
                .stream()
                .filter(product -> product.getName().toLowerCase().contains(Sname.toLowerCase()))
                .findAny()
                .orElse(null);
       if (result != null){
           System.out.println(result);
       }else{
           System.out.println("This item is not there");
       }





    }
}
