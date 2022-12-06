package N_Threads;

public class Count implements Runnable{
    private String name;

    public Count(String name){
        this.name = name;
    }


    public void setName(String name){this.name = name;}
    public String getName(){return name;}

    @Override
    public void run() {
        System.out.println(this.getName() + " count started...");
        for(int i = 0; i < 1000; i++) System.out.print(i);
    }
}
