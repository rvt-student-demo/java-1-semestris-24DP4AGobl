package rvt;

public class App {
    public static void main(String[] args) {
        Box box = new  Box(2.5, 5.0, 6.0) ;

        System.out.println("Area: "  + box.area() + " volume: " + box.volume());
        System.out.println("length: " + box.length() + " height: " + box.height() +
                            " width:  " + box.width() + "\n")  ;
        

        Box newBox = new Box(box);

        System.out.println("Area: "  + newBox.area() + " volume: " + newBox.volume());
        System.out.println("length: " + newBox.length() + " height: " + newBox.height() +
                            " width:  " + newBox.width() + "\n")  ;


        Box biggerBox = newBox.biggerBox(newBox);

        System.out.println("Area: "  + biggerBox.area() + " volume: " + biggerBox.volume());
        System.out.println("length: " + biggerBox.length() + " height: " + biggerBox.height() +
                            " width:  " + biggerBox.width() + "\n")  ;


        Box smallerBox = newBox.smallerBox(biggerBox);

        System.out.println("Area: "  + smallerBox.area() + " volume: " + smallerBox.volume());
        System.out.println("length: " + smallerBox.length() + " height: " + smallerBox.height() +
                            " width:  " + smallerBox.width() + "\n")  ;

        System.out.println(biggerBox.nests(smallerBox));
    }
}