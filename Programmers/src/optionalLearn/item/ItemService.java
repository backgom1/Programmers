package optionalLearn.item;

import java.util.List;
import java.util.stream.Collectors;

public class ItemService {

    private static ItemService instance;

    private ItemService() {
    }


    public static ItemService getInstance() {
        if (instance == null) {
            instance = new ItemService();
        }
        return instance;
    }

    public int calculateTotalPrice(List<Item> items) {
        if (items == null || items.isEmpty()) {
            return 0;
        }
        return items.stream()
                .mapToInt(Item::getPrice)
                .sum();
    }

    public List<String> upperFruitName(List<Item> items) {
        if (items == null || items.isEmpty()) {
        }
        return items.stream()
                .map(s-> s.getName().toUpperCase())
                .collect(Collectors.toList());
    }
}
