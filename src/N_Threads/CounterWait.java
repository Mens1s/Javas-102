package N_Threads;

public class CounterWait implements Runnable{
    private String name;
    private int id;
    private boolean isRun = true;
    CounterWait(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName(){return name;}
    public void setName(String name){ this.name = name;}

    @Override
    public void run() {
        System.out.println(this.getName() + " calisti");

        while(isRun){

            System.out.println(this.getName() + " calisti : " + 1);
            try{
                Thread.sleep(1000L * this.id);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }

        }
    }
    public void stop(){
        this.isRun = false;
    }
}


