public class S2_3 {
        public static void main(String[] args) {
            System.out.println(cadenasDeTextoDistintas("texto1", "texto2")); // Devuelve true
            System.out.println(cadenasDeTextoDistintas("hola", "hola")); // Devuelve false
        }

        public static boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB) {
            return !unTextoA.equals(unTextoB);
        }

}
