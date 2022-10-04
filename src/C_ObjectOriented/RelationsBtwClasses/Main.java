package C_ObjectOriented.RelationsBtwClasses;
// uc temel iliski vardir
// bagimlilik   dependecy
// birlestirme  composition
// kalitim      inheritence
public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Ahmet", "Yigit","121","Ankara",90);
        Student st2 = new Student("Patika", "Dev","231","CCC",190);
        Student st3 = new Student("Kod", "Luyoruz","321","DDDD",50);

        Instructor tch1 = new Instructor("YS","A","CSE");
        Course course = new Course("Matematik","Math-101",tch1);

        Student[] std = {st1,st2,st3};
        System.out.println(course.calcAverage(std));
    }
}
