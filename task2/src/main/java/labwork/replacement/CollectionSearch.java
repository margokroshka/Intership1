package labwork.replacement;

import java.util.NoSuchElementException;

public class CollectionSearch extends Collection {
    public static Integer valueSearch(Integer key) throws NoSuchElementException {
        if (product.containsKey(key)) {
            return product.get(key);
        } else throw new NoSuchElementException("Collection haven't this key!");
    }
}
