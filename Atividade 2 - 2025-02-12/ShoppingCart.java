import java.util.ArrayList;
import java.util.Scanner;


public class ShoppingCart {
    private int customerID;
    private ArrayList<Product>productList = new ArrayList<>();

    void addProduct(Scanner scanner){
        System.out.println("Enter product name: ");
        String brand = scanner.next();
        System.out.println("Enter product price: ");
        double price = scanner.nextDouble();

        productList.add(new Product(brand, price));
    }
    void removeProduct(Scanner scanner){
        System.out.println("Enter removed product: ");
        String brand = scanner.next();
        for (Product search : productList) {
            if (search.getBrand().equals(brand)) {
                productList.remove(search);
                System.out.printf("Ex2_POO.Product %s removed%n", brand);
                return;
            }
        }
    }
    String getContents() {
        String contents = "";
        for (Product product : productList) {
            contents += product + "\n";
        }
        return contents;
    }
    int getCustomerID() {
        return customerID;
    }

    int getItemCount() {
        return productList.size();
    }
    double getTotalPrice() {
        double total = 0;
        for (Product product : productList) {
            total += product.getPrice();
        }
        return total;
    }

}
