package rvt;

public class Person {

    private String name;
    private String address;

    public Person(String name) {
        this(name, null);
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // other constructors and methods

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return name + "\n  " + address;
    }
}
