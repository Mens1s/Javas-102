package Z_Homeworks.PatikaStore;

import java.util.Comparator;
import java.util.TreeSet;

public class Brand {
    private String name;
    private int id = 1;

    Brand(String name, int id){
        this.name = name;
        this.id = id;
    }
    public String getName() {return name;}
    public int getId() {return id;};

    public static TreeSet<Brand> brandList = new TreeSet<>(new Comparator<Brand>() {
        @Override
        public int compare(Brand o1, Brand o2) {
            return o1.getName().compareTo(o2.getName());
        }
    });

    static {addBrands();}
    public static void addBrands(){
        brandList.add(new Brand("Samsung", 1));
        brandList.add(new Brand("Lenovo", 2));
        brandList.add(new Brand("Apple", 3));
        brandList.add(new Brand("Huawei", 4));
        brandList.add(new Brand("Casper", 5));
        brandList.add(new Brand("Asus", 6));
        brandList.add(new Brand("HP", 7));
        brandList.add(new Brand("Xiaomi", 8));
        brandList.add(new Brand("Monster", 9));
    }

    public static Brand getBrand(int id){
        for(Brand brand : brandList){
            if(brand.getId() == id){
                return brand;
            }
        }
        return null;
    }



}
