package I_Generic;

public class NullableInt {
    private final Integer value;

    public NullableInt(Integer value){
        this.value = value;
    }

    public Integer getValue(){
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
}
