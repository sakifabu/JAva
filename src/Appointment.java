import net.sf.cglib.core.Local;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by sakif on 2/6/2017.
 */
public class Appointment {
    private String description;
    public Date day;
    public Appointment(String des, Date day){
        this.description= des;
        this.day = day;
    }
    public String toString() {
        return "Description :"+ this.description + " Date of appointment : "+ this.day ;
    }

}
class Onetime extends Appointment {
    String type;
    public Onetime(String des, Date day, String type){
        super(des, day);
        this.type = type;
    }
    public boolean occursOn(Date day) {

        return false;
    }
    public String toString() {
        return super.toString() +" Type of appointment is : "+ this.type;
    }

}
class Daily extends Appointment {
    String type;
    int numberofdays;
    public Daily(String des, Date day, String type, int numberofdays) {
        super(des, day);
        this.type = type;
        this.numberofdays = numberofdays;
        //setTime(super.day[0].getDay(),super.day[i].setMonth(day.getMonth()+1), super.day[0].getYear());
        //for (int i = 1; i < numberofdays; i++) {
         //   super.day[i].setDate(super.day[0].getDay() + 1);
        //}
    }
    public String toString() {
        return super.toString() +" Type of appointment is : "+ this.type;
    }

}


class Monthly extends Appointment {
    String type;
    int numberofmonths;

    public Monthly(String des, Date day, String type) {
        super(des, day);
        this.type = type;
       // for (int i = 1; i < numberofmonths; i++) {
        //    super.day[i].setMonth(super.day[0].getMonth() + 1);
        //}
    }

    public String toString() {
        return super.toString() + " Type of appointment is : " + this.type;
    }

}
class Appointmenttry{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Date d1 = new Date(2009,1,31);
        System.out.println("What is the appointment for");
        String des = reader.nextLine();

        //Appointment a[] = new Appointment(des,d1);

        Daily a = new Daily(des ,d1 ,"daily",2);
    System.out.println(a);

    }
}