public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {

    @Override
    public double circleArea(Circle circle) {
        double pole = circle.getR()*circle.getR() * 3.14;
        return pole;
    }

    @Override
    public double rectangleArea(Rectangle rectangle) {
        double pole = rectangle.getA() * rectangle.getB();
        return pole;
    }
    @Override
    public double  cubeVolume(Cube cube){
        double pole = cube.getA() * cube.getA() * cube.getA();
        return pole;
    }
    @Override
    public double ballVolume(Ball ball){
        double pole = 4/3*3.14*ball.getR() * ball.getR() * ball.getR();
        return pole;
    }
}
