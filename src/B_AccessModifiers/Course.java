package B_AccessModifiers;

public class Course {
    public String name;
    public String code;
    public int note;

    public Course(String name, String code, int note){
        this.name = name;
        this.code = code;
        this.note = note;
    }

    public static void calcAverage(int[] notes){
        double total = 0;
        for (int j : notes) {
            total += j;
        }

        double avg = total / notes.length;
        System.out.println("Average of your note is : " + avg);
    }

    public static void calcAverage(Course[] courses){
        double total = 0;
        for(Course j : courses){
            total += j.note;
        }
        double avg = total  / courses.length;
        System.out.println("Average of your note is : " + avg);
    }
}
