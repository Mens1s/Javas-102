package Z_Homeworks.InsuranceSystem;

public class InvalidAuthenticationException extends Exception{
    public InvalidAuthenticationException(String msg){
        super(msg);
        System.out.println("Invalid passsword!");
    }
}
