package J_ExceptionHandling;

public class AgeCheckException extends Exception{
    public AgeCheckException(String msg){
        super(msg);
        System.out.println("exc class");
    }
}
