import java.util.ArrayList;
import java.util.List;

public class ArrayListProducts implements Products {
    private final List<Product> products = new ArrayList();


    //Now: A constructor to put THREE PRODUCT OBJECTS inside of our arraylist to begin [test data, hard code data]

    public ArrayListProducts(){
        insert(new Product("generator", 499.99));
        insert(new Product("snow plow", 199.99));
        insert(new Product("flux capacitors", 4999.99));

    }
    @Override
    public List<Product> all() {
        return this.products;
    }

    @Override
    public void insert(Product product) {
        this.products.add(product);
    }
}