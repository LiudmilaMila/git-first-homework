package task6;

import java.util.Objects;

public class Human {

    private String name;
    private int age;
    private Eyecolor eyecolor;
    private double height;
    private double weight;

    public Human(String name, int age, Eyecolor eyecolor, double height, double weight) {
        this.name = name;
        this.age = age;
        this.eyecolor = eyecolor;
        this.height = height;
        this.weight = weight;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Human)) {
            return false;
        }
        Human theOther = (Human) other;
        return Objects.equals(theOther.name, this.name) &&
                Objects.equals(theOther.age, this.age) &&
                Objects.equals(theOther.eyecolor, this.eyecolor) &&
                Objects.equals(theOther.height, this.height) &&
                Objects.equals(theOther.weight, this.weight);
    }

    public int hashCode() {
        return Objects.hash(name, age, eyecolor, height, weight);
    }

    public String toString() {
        return String.format(" name: %s, age: %d, eyecolor: %s, height: %.2f, weight: %.2f",
                name, age, eyecolor, height, weight);
    }
}
