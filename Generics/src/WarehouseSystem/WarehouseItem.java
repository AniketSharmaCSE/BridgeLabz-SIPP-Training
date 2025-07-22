package WarehouseSystem;
abstract class WarehouseItem {
    private String name;

    public WarehouseItem(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public abstract String info();
}

class Electronics extends WarehouseItem {
    public Electronics(String name) { super(name); }
    public String info() { return "Electronics: " + getName(); }
}
class Grocery extends WarehouseItem {
    public Grocery(String name) { super(name); }
    public String info() { return "Grocery: " + getName(); }
}
class Furniture extends WarehouseItem {
    public Furniture(String name) { super(name); }
    public String info() { return "Furniture: " + getName(); }
}
