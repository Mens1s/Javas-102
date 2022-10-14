package I_Generic;

public class Sol <T> {
    public final T[] arr;

    public Sol(T[] arr) {
        this.arr = arr;
        System.out.println(this.arr);
    }

    public void printArray() {
        for (T a : this.arr)
            System.out.println(a);
    }
}