public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(5, 10);
        Circulo circulo = new Circulo(5);
        Triangulo triangulo = new Triangulo(5, 10);

        System.out.println("Area del rectangulo: " + rectangulo.area());
        System.out.println("Area del circulo: " + circulo.area());
        System.out.println("Area del triangulo: " + triangulo.area());

        Composite vagon = new Composite();
        vagon.add(rectangulo);
        vagon.add(circulo);
        vagon.add(triangulo);

        System.out.println("Area del vagon: " + vagon.area());

    }
}
