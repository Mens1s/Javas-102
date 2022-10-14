package I_Generic;

public class NullableGeneric <T> {
    private final T value;

    public NullableGeneric(T value){
        this.value = value;
    }

    public T getValue(){
        return this.value;
    }

    public boolean isNull(){
        return this.value == null;
    }

    public void run(){
        if(isNull())
            System.out.println("This value is null so fill it!" );
        else
            System.out.println("Value : " + this.value + "Type : " + this.value.getClass().getName());
    }
}
