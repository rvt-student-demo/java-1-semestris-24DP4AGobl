package rvt;

public class Counter {
    private int counter;

    public Counter(int startValue) {
        counter = startValue;
    }

    public Counter() {
        counter = 0;
    }


    public int value() {
        return counter;
    }


    public void increase(int increaseBy) {
        counter += increaseBy;
    }

    public void increase() {
        counter ++;
    }
    

    public void decrease(int decreaseBy) {
        counter -= decreaseBy;
    }

    public void decrease() {
        counter --;
    }
}
