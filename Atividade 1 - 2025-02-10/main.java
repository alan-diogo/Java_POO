import java.util.ArrayList;
import java.util.Scanner;

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ShoppingCart cart = new ShoppingCart();

    while (true) {
        System.out.println("1: Add Product");
        System.out.println("2: Remove Product");
        System.out.println("3: View Contents");
        System.out.println("4: Get Item Count");
        System.out.println("5: Get Total Price");
        System.out.println("6: Exit");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                cart.addProduct(scanner);
                break;
            case 2:
                cart.removeProduct(scanner);
                break;
            case 3:
                System.out.println(cart.getContents());
                break;
            case 4:
                System.out.println("Item count: " + cart.getItemCount());
                break;
            case 5:
                System.out.println("Total price: " + cart.getTotalPrice());
                break;
            case 6:
                scanner.close();
                return;
            default:
                System.out.println("Invalid option");
        }
    }
}

