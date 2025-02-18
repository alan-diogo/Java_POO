public class Refrigerator extends Product {
    int size;

    public Refrigerator(String brand, double price, int size) {
        super(brand,price);
        this.size = size;
    }

    int getSize(){
        return size;
    }
}
