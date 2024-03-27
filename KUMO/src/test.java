public class test {
    public static void main(String[] args) {
        String pepe = new String("ohmevengo");
        String kuko = new String("ohmevengo");

        if (pepe.equals(kuko)){
            System.out.println("100% real no fake");
        }

        Integer a = new Integer(6);
        Integer b = new Integer(7);

        if (a.compareTo(b) < 0) {
            System.out.println("meno");
        } else {
            System.out.println("nel");
        }

    }
}
