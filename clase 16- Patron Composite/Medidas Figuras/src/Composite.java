import java.util.ArrayList;
import java.util.List;
import java.text.DecimalFormat;
public class Composite implements Figura {
    private List<Figura> arrayFiguras = new ArrayList<>();


    public void add(Figura figura) {
        arrayFiguras.add(figura);
    }
    @Override
    public double area() {

        double area = 0;
        for (Figura figura : arrayFiguras) {
            area += figura.area();
        }
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        return Double.parseDouble(numberFormat.format(area));
    }
}
