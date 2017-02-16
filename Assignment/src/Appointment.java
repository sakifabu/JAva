import net.sf.cglib.core.Local;
import org.jaxen.function.TrueFunction;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by sakif on 2/6/2017.
 */
public class Appointment {
    private String description;
    private Date day;

    public Appointment(String des, int year, int month, int day) {
        this.description = des;
        this.day = new Date(year, month, day);
    }

    public Date getDay() {

        return day;
    }
    public String getDescription(){
        return description;
    }

    public String toString() {
        return "Description :" + this.description + " Date of appointment : " + this.day;
    }

    public boolean occursOn(int year, int month , int day){
        Date day1 = new Date(year,month,day);
        if (day1==this.day) {
            return true;
        } else {
            return false;
        }

    }
}
class Onetime extends Appointment {
    public Onetime(String des, int year, int month, int day){
        super(des, year,month,day);
    }
    public String toString() {
        return super.toString() ;
    }

}
class Daily extends Appointment {
    public Daily(String des, int year, int month, int day) {
        super(des, year,month,day);
    }
    public boolean occursOn(int year, int month , int day){
        return true;
    }
    public String toString() {
        return super.toString();
    }

}


class Monthly extends Appointment {

    public Monthly(String des, int year, int month, int day) {
        super(des, year,month,day);
    }
    public boolean occursOn(int year, int month , int day) {

        ;
        if (day == getDay().getDay()) {
            return true;
        }
        else
            return false;
    }
    public String toString() {
        return super.toString() ;
    }

}
class Appointmenttry{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Appointment a[] = new Appointment[5];
        a[0]=new Daily("Do pushups",2017,1,12);
        a[1]=new Monthly("Go to the Doctor",2017,1,15);
        a[2]=new Appointment("See the Lawyer",2017,1,10);
        a[3]=new Onetime("Superman Pose",2017,1,16);
        a[4]=new Daily("Be Awesome",2017,1,13);
        System.out.println("The year of appointment : ");
        int year = reader.nextInt();
        System.out.println("The month of appointment : ");
        int month = reader.nextInt();
        System.out.println("The day of appointment : ");
        int day = reader.nextInt();
        for (int k = 0; k < a.length; k++) {
            if (a[k].occursOn(year,month,day)){
                System.out.print(a[k].getDescription());
            }

        }

    }
}