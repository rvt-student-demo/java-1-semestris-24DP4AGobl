package rvt;

public class Box {
    private double width;
    private double height;
    private double length;

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public double volume() {
        return width * height * length;
    }

    private double faceArea() {
        return width * height;
    }

    private double topArea() {
        return width * length;
    }

    private double sideArea() {
        return height * length;
    }

    public double area() {
        return 2 * (faceArea() + topArea() + sideArea());
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
    
    

    Box(Box oldBox) {
    }

    public double length() {
        return length;
    }

    public double height() {
        return height;
    }

    public double width() {
        return width;
    }


    public Box biggerBox(Box oldBox) {
        return new Box( 1.25 * oldBox.width(), 1.25 * oldBox.height(), 1.25 * oldBox.length());
    }

    public Box smallerBox( Box oldBox ) {
        return new Box(oldBox.width() - oldBox.width() * 0.25, oldBox.height() - oldBox.height() * 0.25, oldBox.length() - oldBox.length() * 0.25);
    }

    public boolean nests(Box outsideBox){
        if (outsideBox.length > length && outsideBox.height > height && outsideBox.length > length) {
            return true;
        } else {
            return false;
        }
    }
}