package N_Threads;

public class Counter extends Thread{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());

        for(int i = 0 ; i < 10000; i++)
            System.out.println(Thread.currentThread().getName());


    }
}
