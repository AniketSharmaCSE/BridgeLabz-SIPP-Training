package WarehouseSystem;
import java.util.*;

class StorageUtil {
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item.info());
        }
    }
}
