package N_Threads;

public class OrderMatic implements Runnable{
    private int orderNo;
    private final Object LOCK = new Object();
    public OrderMatic(){
        this.orderNo = 0;
    }
    public int getOrderNo(){return this.orderNo;}
    public void setOrderNo(int orderNo){this.orderNo = orderNo;}

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        synchronized (LOCK){
            this.orderNo++;
            System.out.println("Thread : "+Thread.currentThread().getName()+ " Order No : " + getOrderNo());
        }
    }
}
