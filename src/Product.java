public class Product {
    private String name;
    private double price;
    private int stockQuantity;

    public Product(String name, double price, int stockQuantity) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    // returns the remaining stock quantity after sell or -1 if not enough in stock
    public void sell(int quantity){

        if(quantity > stockQuantity){
            System.out.println("Not enough stock");
            
        }else {
            stockQuantity -= quantity;
        }

    }


    public double getPrice() {
        return price;
    }
    public int getStockQuantity() {
        return stockQuantity;
    }
    public String getName() {
        return name;
    }
}
