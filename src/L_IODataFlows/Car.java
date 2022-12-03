package L_IODataFlows;

import java.io.Serializable;

public class Car implements Serializable {
    public String brand;
    public String model;

    public Car(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    public void setBrand(String brand) {this.brand = brand;}
    public void setModel(String model) {this.model = model;}
    public String getBrand(){return brand;}
    public String getModel(){return model;}
}
