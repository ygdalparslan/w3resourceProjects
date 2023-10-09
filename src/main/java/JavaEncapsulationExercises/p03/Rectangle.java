package JavaEncapsulationExercises.p03;
/*
3. Write a Java program to create a class called Rectangle with private instance variables length and width.
Provide public getter and setter methods to access and modify these variables.
 */

public class Rectangle {

    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
