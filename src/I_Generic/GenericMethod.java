package I_Generic;

public class GenericMethod <T>{
    private final T[] arr;

    public GenericMethod(T[] arr){this.arr = arr;}

    public void run(){
        for (T item: arr){
            System.out.println(item);
        }
    }
}
