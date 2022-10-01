package A_JavaBasics.section6;

public class Main {
    public static void main(String[] args) {
        /*
        for (int i = 0 ; i < 10; i++)
            System.out.println(i);
        int i = 0;
        while(i<10)
        {
            System.out.println(i);
            i++;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();
        int sum = 0;
        do {
            sum += (num%10);
            num /= 10;
        }while(num>0);
        System.out.println("Result : "+sum);
         */
        //new atm().Atm();
        //new Armstrong().armstrong();
        new Carpim().carpim();
        new Login().login();
    }
}
