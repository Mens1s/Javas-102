package I_Generic;

public class Nullable {
    private final String value;

    public Nullable(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }

    public boolean isNull(){
        return this.value == null;
    }

    public void run(){
        if(!isNull())
            System.out.println("Value : "+ this.value);
        else
            System.out.println("Value is null so Fill it babe!");
    }
    /*
    @Override
    public String toString(){
        if (!isNull())
            return this.value.toString();
        return "";
    }
    */
}
