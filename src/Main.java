public class Main {
    public static void main(String[] args) {
        Line2D line = new Line2D(2,4);
        LineCalc.lineLength(line);

        ShapeCalculator calc = new ShapeCalculator();

        Circle circle = new Circle(2);
        Ball ball = new Ball(4);
        Rectangle rectangle = new Rectangle(2,3);
        Cube cube = new Cube(3);

        System.out.println(calc.circleArea(circle));
        System.out.println(calc.ballVolume(ball));
        System.out.println(calc.cubeVolume(cube));
        System.out.println(calc.rectangleArea(rectangle));


    }



}
