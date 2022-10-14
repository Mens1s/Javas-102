package F_NestedClasses;

public class Local {
    public void run(){

         class Yerel{

            public int a;
            public Yerel(int a){
                this.a = a;
            }
            public int getA() {return a;}

            public void setA(int a) {this.a = a;}

        }

        Yerel y = new Yerel(15);
        y.a = 4; // but that is private ?
        System.out.println(y.getA());
        System.out.println("Local'in run u calisti");
    }


}
