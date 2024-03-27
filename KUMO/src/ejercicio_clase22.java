import java.util.Scanner;

public class ejercicio_clase22 {
    public static void main(String[] args) {
        Scanner test;
        test = new Scanner(System.in);
        String name;
        String LastName;
        String NL;w

        System.out.println("name");
        name = test.nextLine();
        System.out.println("Lastname");
        LastName = test.nextLine();

        NL = String.valueOf(name.charAt(0)) + String.valueOf(LastName.charAt(0));

        System.out.println("Su acronimo es " + NL);
    }
}
