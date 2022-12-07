package O_OtherSubjects;

public class Days {
    public static final Days MONDAY = new Days(1);
    public static final Days TUESDAY = new Days(2);
    public static final Days WEDNESDAY = new Days(3);
    public static final Days THURSDAY = new Days(4);
    public static final Days FRIDAY = new Days(5);
    public static final Days SATURDAY = new Days(6);
    public static final Days SUNDAY = new Days(7);
    private int day;

    private Days(int day){
        this.day = day;
    }

    public int getDay(){return day;}
    public void setDay(int day){this.day = day;}
}
