package FigureOOP;

public class Rectangular extends Figure {

    private double height;
    private double weight;

    public Rectangular(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public double squre() {
        return height * weight;
    }



}
