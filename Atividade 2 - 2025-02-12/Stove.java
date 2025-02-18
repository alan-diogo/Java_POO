public class Stove extends Product {
    int burners;

    public Stove(int id, String brand, double price, int burners) {
        this.burners = burners;
        super(brand, price);
    }
    int getBurners(){
        return burners;
    }
}
