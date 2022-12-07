package O_OtherSubjects;

public enum DaysEnum {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);
    private int day;

    private DaysEnum(int day){
        this.day = day;
    }

    public int getDay(){return day;}
    public void setDay(int day){this.day = day;}

    public String getDayName(){
        String temp = null;
        switch (this){
//            case FRIDAY -> temp = "FRIDAY";

            case MONDAY:
                temp = "Monday";
                break;
            case TUESDAY:
                temp = "Tuesday";
                break;
        }
        return temp;
    }
}
