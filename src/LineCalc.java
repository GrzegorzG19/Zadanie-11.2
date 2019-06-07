

public class LineCalc {

    public static int lineLength(Line2D line) {
        int odc;
        odc = line.getB() - line.getA();
        return odc;
    }
}
