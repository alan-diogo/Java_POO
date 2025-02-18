public class Tv extends Product {

    int inches;

    public Tv(String brand, double price, int inches) {
        super(brand, price);
        this.inches = inches;
    }

    int getInches(){
        return inches;
    }
}
