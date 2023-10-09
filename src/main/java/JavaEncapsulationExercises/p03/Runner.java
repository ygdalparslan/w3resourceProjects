package JavaEncapsulationExercises.p03;

public class Runner {
    public static void main(String[] args) {
        Rectangle rectangle =new Rectangle();

        rectangle.setLength(6.7);
        rectangle.setWidth(12.7);

        double length = rectangle.getLength();
        double width = rectangle.getWidth();

        System.out.println("length = " + length);
        System.out.println("width = " + width);
    }
}
