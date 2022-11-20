package Z_Homeworks.PatikaStore;

import java.text.Format;
import java.util.ArrayList;
import java.util.SortedMap;

public class Telephone extends Product{

    private String colour;

    Telephone(int id, int stock, double price, double discount, String name, String categories, Brand brand, int storage, int batMHA, int RAM, double inch, String colour) {
        super(id, stock, price, discount, name, categories, brand, storage, batMHA, RAM, inch);
        this.colour = colour;

    }

    public String getColour() {return colour;}

    public void setColour(String colour) {this.colour = colour;}

    public static void productFilter(int type, String choice){
        ArrayList<Product> tempList = new ArrayList<>();
        // 1 => marka  2 => id ve 3 => fiyat
        if(type == 1){
            for(Product product : productList.get("Telephone").values()){
                if (product.getBrand().getName().equals(choice)){
                    tempList.add(product);
                }
            }
        } else if(type == 2){
            for(Product product : productList.get("Telephone").values()){
                if (Integer.toString(product.getId()).equals(choice)){
                    tempList.add(product);
                }
            }
        } else{
            for(Product product : productList.get("Telephone").values()){
                if (product.getPrice() < Double.parseDouble(choice)){
                    tempList.add(product);
                }
            }
        }
        System.out.printf("%10s%10s%10s%10s%10s\n", "ID","Name","Price","Brand Name","Storage");
        for(Product product : tempList){
            System.out.printf("%10s||%10s||%10s||%10s||%10s\n", product.getId(),product.getName(),product.getPrice(),product.getBrand().getName(),product.getStorage());
        }
        System.out.println("\n\n\n\n");
    }

    public static int add(int id, Telephone t){
        while(idList.contains(id))  id++;
        idList.add(id);

        productList.get("Telephone").put(id, t);
        System.out.println(productList);
        System.out.println(idList);
        return id;
    }

}
