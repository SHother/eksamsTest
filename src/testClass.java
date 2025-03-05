import java.util.ArrayList;

public class testClass {
    public static void main(String[] args) {
        Product apple = new Product("apple",10.5,1000);
        Product orange = new Product("orange",15.5,2000);
        Product pear = new Product("pear",5,17);


        ArrayList<Product> fruits = new ArrayList<>();
        fruits.add(apple);
        fruits.add(orange);
        fruits.add(pear);


        apple.sell(500);
        apple.sell(501);
        System.out.println(apple.getStockQuantity());

        System.out.print(getMostExpensiveProduct(fruits).getName() + " is the most expensive product.");
    }



    public static Product getMostExpensiveProduct(ArrayList<Product> products) {
        Product mostExpensiveProduct = new Product("test", -1,0);

        for (Product product : products) {
            if (product.getPrice() > mostExpensiveProduct.getPrice()) {
                mostExpensiveProduct = product;
            }
        }
        return mostExpensiveProduct;
    }
}
