package Z_Homeworks.Thread;

import java.util.ArrayList;
import java.util.List;

public class homework extends Thread {

    private static List<Integer> even = new ArrayList<>();
    private static List<Integer> odd = new ArrayList<>();
    static int num;
    List<Integer> arr;

    public homework(List<Integer> arr){
        this.arr = arr;
    }

    @Override
    public void run() {
        finder(this.arr);
        print();
    }

    private synchronized void finder(List<Integer> arr){
        for(int i = 0; i < 2500; i++){
            int n = arr.get(i);
            if(n % 2 == 0)
                even.add(n);
            else
                odd.add(n);
        }
    }

    private void print(){
        System.out.println(Thread.currentThread().getName());
        System.out.println("Even List : " + even);
        System.out.println("Odd List : " + odd);
    }
}
