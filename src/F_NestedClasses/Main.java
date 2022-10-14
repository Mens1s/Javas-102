package F_NestedClasses;

public class Main {
    public static void main(String[] args) {
    
        /*
        inner class non-static
        Out out = new Out();
        out.run();

        Out.In in = out.new In();
        in.run();
        */
        /*
        inner class static olaylari asiri basitlestiriyor
        Out out = new Out();
        out.run();

        Out.In in = new Out.In();
        in.run();

        Out.In.run();
        */
        /*
        local classes

        Local l = new Local();
        l.run();
        */
        Anonim a = new Anonim(){

            @Override
            public void run() {
                System.out.println("Anonim ana sinifi calisti a : " + this.a);
                this.a = 17;
                System.out.println("Anonim ana sinifi calisti a : " + this.a);
                super.a = 43;
                System.out.println("Anonim ana sinifi calisti a : " + this.a);
            }
        };
        a.run();
    }
}
