/**
 * Created by sakif on 2/6/2017.
 */

public class Person {
    private String name;
    private int yearofbirth;

    Person(String name, int year) {
        this.name = name;
        this.yearofbirth = year;
    }
    public String toString() {
        return "name is :"+ this.name + " Year of birth is : "+ this.yearofbirth ;
    }

}
class Student extends Person {
    private String major;

    Student(String name, int year, String major) {
        super(name, year);
        this.major = major;
    }
    public String toString() {

        return "Students " + super.toString() +" Major is : "+ this.major;
    }
}

class Instructor extends Person {
    private Double sallary;

    Instructor(String name, int year, double sallary) {
        super(name, year);
        this.sallary = sallary;
    }
    public String toString() {

        return "Instructors " + super.toString() + " with sallary : " + this.sallary;
    }
}
class People {
    public static void main(String[] args) {
        Person a = new Person("Steve Austin", 1971);
        Instructor b = new Instructor("Joe", 1964, 40000.01);
        Student c = new Student("Penolope Cruz", 1980, "IST");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}