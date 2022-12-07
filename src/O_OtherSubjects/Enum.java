package O_OtherSubjects;

public class Enum {
    public static void main(String[] args) {
        System.out.println(Days.THURSDAY.getDay());
        System.out.println(DaysEnum.MONDAY.getDay());
        // enum can not create object
        System.out.println(DaysEnum.MONDAY.getDayName());
    }

}
