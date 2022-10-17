package I_Generic;

public class Student<T> implements IDatabase<T> {

    @Override
    public boolean insert(T data) {
        System.out.println("Veri eklendi");
        return false;
    }

    @Override
    public boolean delete(T data) {
        System.out.println("Veri silindi");

        return false;
    }

    @Override
    public boolean update(T data) {
        System.out.println("Veri guncellendi");
        return false;
    }

    @Override
    public T select() {
        System.out.println("Veri secildi");

        return null;
    }
}
