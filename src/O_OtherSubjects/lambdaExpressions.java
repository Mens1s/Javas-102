package O_OtherSubjects;

public class lambdaExpressions {
    public static void main(String[] args) {
//        Runnable r1 = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("R1 worked!");
//            }
//        };
//        r1.run();
//
//        Runnable r2 = () -> System.out.println("R2 worked!");
//        r2.run();
        Mathematic add = new Mathematic() {
            @Override
            public int transaction(int a, int b) {
                return a+b;
            }
        };
        Mathematic add2 = (a, b) -> a+b;
        Mathematic extract = (a, b) -> a-b;
        Mathematic multiply = (a, b) -> a*b;
        Mathematic division = (a, b) -> {
            if(b == 0) b = 1;
            return a/b;
        };
        System.out.println(add2.transaction(10,15));
        System.out.println(extract.transaction(10,15));
        System.out.println(multiply.transaction(10,15));
        System.out.println(division.transaction(10,4));
    }

}
