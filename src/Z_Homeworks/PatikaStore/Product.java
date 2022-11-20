package Z_Homeworks.PatikaStore;

import java.util.ArrayList;
import java.util.HashMap;

public class Product {
    static ArrayList<Integer> idList = new ArrayList<>();
    static HashMap<String, HashMap<Integer, Product>> productList = new HashMap<>();;
    private int storage;
    private int batMHA;
    private int RAM;

    public void setCategories(String categories) {this.categories = categories;}

    private double inch;
    private int id;
    private int stock;
    private double price;
    private double discount;
    private String name;
    private String categories;
    private Brand brand;

    Product(int id, int stock, double price, double discount, String name,String categories, Brand brand,int storage, int batMHA, int RAM, double inch){

        this.storage = storage;
        this.batMHA = batMHA;
        this.RAM = RAM;
        this.inch = inch;
        this.id = id;
        this.stock = stock;
        this.price = price;
        this.discount = discount;
        this.name = name;
        this.categories = categories;
        this.brand = brand;
    }

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public int getStock() {return stock;}

    public void setStock(int stock) {this.stock = stock;}

    public double getPrice() {return price;}

    public void setPrice(double price) {this.price *= ((100-discount)/100);}

    public double getDiscount() {return discount;}

    public void setDiscount(double discount) {this.discount = discount;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public Brand getBrand() {return brand;}

    public void setBrand(Brand brand) {this.brand = brand;}

    public int getStorage() {return storage;}

    public void setStorage(int storage) {this.storage = storage;}

    public int getBatMHA() {return batMHA;}

    public void setBatMHA(int batMHA) {this.batMHA = batMHA;}

    public int getRAM() {return RAM;}

    public void setRAM(int RAM) {this.RAM = RAM;}

    public double getInch() {return inch;}

    public void setInch(double inch) {this.inch = inch;}
    public void delete(String type){
        idList.remove(this.id);
        productList.get(type).remove(this.id);
        //finalize();
    }


    public String getCategories() {
        return categories;
    }
}
