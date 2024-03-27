package labwork.replacement;

import java.util.NoSuchElementException;

public class CollectionReplace extends Collection {
    public static void valueReplace(String key, Integer value) throws NoSuchElementException{
        if (product.containsKey(key)) {
            product.put(key, value);
        } else throw new NoSuchElementException("Collection haven't this key!");
    }
}
