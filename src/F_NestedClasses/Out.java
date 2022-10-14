package F_NestedClasses;

public class Out {
    public int a = 5;

    /*
    // Inner Class
    public class In{
        public int a = 10;
        // Non-static inner class
        public void run(){
            int a = 15;
            System.out.println(Out.this.a);
            System.out.println(this.a);
            System.out.println(a);
        }
    }
    */
    public static class In{
        public static int a = 10;
        // Non-static inner class
        public static void run(){
            int a = 15;
            System.out.println(a);
            System.out.println(In.a);
        }
    }

    public void run(){
        In.run();
    }
}
