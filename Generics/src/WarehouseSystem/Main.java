package WarehouseSystem;
public class Main {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));

        Storage<Grocery> groceryStorage = new Storage<>();
        groceryStorage.addItem(new Grocery("Apple"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair"));

        StorageUtil.displayItems(electronicsStorage.getAllItems());
        StorageUtil.displayItems(groceryStorage.getAllItems());
        StorageUtil.displayItems(furnitureStorage.getAllItems());
    }
}
