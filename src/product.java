public class product  {

    private int id;
    private String name;
    private double price;
    private String category;

    public product(int id, String name, double price,String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category=category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }



    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return id +" "+name+" "+"$"+price;
    }
}
