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

    Box(Box oldBox) {
        this.width = oldBox.width;
        this.height = oldBox.height;
        this.length = oldBox.length;
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

    public Box smallerBox(Box oldBox ) {
        return new Box(oldBox.width() * 0.75, oldBox.height() * 0.75, oldBox.length() * 0.75);
    }

    public boolean nests(Box outsideBox){
        if (outsideBox.length > length && outsideBox.height > height && outsideBox.length > length) {
            return true;
        } else {
            return false;
        }
    }
}
