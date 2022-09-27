package section7;

public class findEbob {
    public static int ebob(int a, int b) {
        if (a<b) {
            int temp = a;
            a = b;
            b = temp;
        }
        int res = 1;
        for(int i = 1; i <= b; i++ )
            if (a % i == 0 && b % i == 0)
                res = i;

        return res;
    }
}
