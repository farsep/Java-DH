package weas;

public class a {

    // Variables de clase
    static int numeroEntero = 1;
    static double numeroConComa = 15.5;

    static double sumar() {
        // Aquí va tu código
        double suma = numeroConComa + numeroEntero;

        // No modificar esta línea
        return suma;
    }
    public static void main(String[] args) {
        // Llamada al método sumar y mostrar el resultado
        System.out.println(sumar());
    }
}
