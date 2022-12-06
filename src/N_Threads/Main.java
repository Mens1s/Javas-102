package N_Threads;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    static int a = 1;
    public void getN(){
        System.out.println("hey babbby!" + a);
        a++;
    }
    public static void main(String[] args) throws InterruptedException {
//        Counter c1 = new Counter();
//        Counter c2 = new Counter();
//
//        c1.start();
//        c2.start();

//        Count c1 = new Count("C1");
//        Count c2 = new Count("C2");
//        Count c3 = new Count("C3");
//
//        Thread t1 = new Thread(c1);
//        Thread t2 = new Thread(c2);
//        Thread t3 = new Thread(c3);
//
//        t1.start();
//        t2.start();
//        t3.start();

//        bekletmeye alma
//        CounterWait c1 = new CounterWait("t1",1);
//        Thread t1 = new Thread(c1);
//        t1.start();
//        Thread.sleep(2000);
//        c1.stop();
//
//        CounterWait c2 = new CounterWait("t2", 2);
//        Thread t2 = new Thread(c2);
//        t2.start();
//        c2.stop();
//        Critical Sections
//        senkron sorunlarinin çozumu
//        OrderMatic om = new OrderMatic();
//        Thread t1 = new Thread(om);
//        t1.start();
//        t1.join();
//
//        Thread t2 = new Thread(om);
//        t2.start();
//        t2.join();
//          senkron sorun çozumu part 2
//        List<Thread> proccess = new ArrayList<>();
//        for(int i = 0; i < 100; i++){
//            Thread t = new Thread(om);
//            proccess.add(t);
//            t.start();
//        }
//        for(Thread t : proccess){
//            t.join();
//        }
//        System.out.println(om.getOrderNo());
         OrderMatic om = new OrderMatic();

        ExecutorService pool = Executors.newFixedThreadPool(50);

        for(int i = 0; i < 100; i++){
            pool.execute(om);
        }
        System.out.println(om.getOrderNo());
    }
}
