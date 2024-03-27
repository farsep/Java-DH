import java.util.Scanner;

public class S2_2 {
    public static Integer maxAmongNumbers(Integer a, Integer b, Integer c){
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner kum;
        kum = new Scanner(System.in);
        Integer a;
        Integer b;
        Integer c;

        a = kum.nextInt();
        b = kum.nextInt();
        c = kum.nextInt();

        System.out.println(maxAmongNumbers(a,b,c));
    }
}
