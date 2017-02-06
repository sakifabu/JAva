/**
 * Created by sakif on 2/6/2017.
 */
public class Person {
    private String name;
    private int year;
    Person(String name, int year) {
        this.name = name;
        if (year <= 2012) this.year = year;
        else this.year = -1;
    }
    public String toString() {
        return "My name is "+ this.name + this.year + "This is a string";
    }
}

class Student extends Person {
    String major;
    Student(String name, int year, String major) {
        super(name, year);
        this.major = major;
    }
    public String toString() {
        return "" + super.toString() + this.major;
    }
}

class Instructor extends Person {
    double salary;
    Instructor(String name, int year, double salary) {
        super(name, year);
        this.salary = salary;
    }
    public String toString() {
        return "Instructor: " + super.toString() + " with salary " + this.salary;
    }
}

class Story {
    public static void main(String[] args) {
        Instructor a = new Instructor("Laura", 1980, 12345.67);
        Student b = new Student("Janice", 1965, "History");
        Person c = new Instructor("Bob", 1979, 10000.01);
        Person d = new Student("Joe", 1995, "Accounting");
        Person e = new Person("Johnny Bravo", 1991);
        System.out.println( a );
        System.out.println( b );
        System.out.println( c );
        System.out.println( d );
        System.out.println( e );


    }
}
