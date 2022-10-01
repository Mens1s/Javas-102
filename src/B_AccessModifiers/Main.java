package B_AccessModifiers;

public class Main {
    public static void main(String[] args) {
        // statick variables and methods
        /*
        Player p1 = new Player("Mens1s", 1);
        p1.login();
        System.out.println(Player.count);

        Player p2 = new Player("Ahmet", 2);
        System.out.println(Player.count);

        p2.showName();
        */
        Course mat = new Course("Math","MATH-101",70);
        Course phys = new Course("Phy", "PHYS-101", 20);
        Course kimya = new Course("CHM", "CHM-101", 50);

        int[] notes = {70,20,50};

        Course.calcAverage(notes); // illa bir sınıftaki method için nesne üretmeye gerek yok o yüzden statik yapıp direkt course.calcAverage den erişmek daha mantıklı

        Course[] classes = {mat,phys,kimya};
        Course.calcAverage(classes);

        // static cod blocks

        User u1 = new User("Ahmet");
        User u2 = new User("Mens1s");
        User u3 = new User("Yigit");

        System.out.println(User.counter);

        // final keyword

        Circle c1 = new Circle(5);
        c1.calcArea();
    }
}
