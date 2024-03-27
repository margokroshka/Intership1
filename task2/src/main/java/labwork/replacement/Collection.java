package labwork.replacement;

import java.util.Map;
import java.util.HashMap;

public class Collection {
    protected static Map<String, Integer> product = new HashMap<>();

    static {
        product.put("Book", 5);
        product.put("Iphone", 500);
        product.put("Laptop", 1500);
        product.put("Shirt", 15);
        product.put("Shoes", 20);
    }
}
