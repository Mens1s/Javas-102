package Z_Homeworks.InsuranceSystem;


import java.util.Scanner;

class HomeAddress implements Address {
    private String address;

    public HomeAddress(String address){
        this.address = address;
    }

    @Override
    public void setAddress(String address){
        this.address = address;
    }

    @Override
    public String getAddress() {
        return address;
    }


}

class BusinessAddress implements Address{

    @Override
    public void setAddress(String address){

    }
    @Override
    public String getAddress() {
        return null;
    }
}


public class AddressManager{

    public static void addAddress(User user, Address address){
        user.getAddressList().add(address);
    }

    public static void removeAddress(User user, Address address){
        user.getAddressList().remove(address);
    }

    public static Address createAddress(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter address : ");
        String adr = scn.nextLine();
        return new HomeAddress(adr);


    }
}