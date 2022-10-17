package I_Generic;

public class Print {
    public static <T> void printArr(T[] arr){
        for(T item:arr)
            System.out.println(item);
    }
}
