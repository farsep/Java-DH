import java.util.Scanner;

public class scan_test {
    public static void main(String[] args) {
        Scanner pepe;
        pepe = new Scanner(System.in);
        int juan;
        String juan2;

        System.out.println("pon tu numbre gei");
        juan2 = pepe.nextLine();

        System.out.println("ingrese matricula");
        juan = pepe.nextInt();


        System.out.println(juan + juan2);


    }
}
