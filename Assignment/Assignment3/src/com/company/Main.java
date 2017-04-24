package com.company;

import java.io.IOException;
import java.util.*;

import static com.oracle.jrockit.jfr.ContentType.StackTrace;
import static java.lang.Enum.valueOf;

/**
 * Created by Sakif on 4/23/2017.
 */
public class Main {

    public static void main(String[] args) {
        Address Address1 = Address.AddressBuilder .build().StName("1600 Woodland Rd").City("Abington").State("PA").ZipCode("19446").getAddress();

        Address Address2 = Address.AddressBuilder.build().StName("1600 Pennsylvania Ave").City("Washington").State("DC ").ZipCode("20500").getAddress();

            System.out.println(Address1);
            System.out.println(Address2);
        try {
            List StudentList = new ArrayList();
            StudentList.add (new Student(111,"John Doe","IST","Senior"));
            StudentList.add(new Student(112,"Johnathan Doe","IST","Sophmore"));
            StudentList.add(new Student(113,"Sakif Abu","IST","Freshman"));
            Iterator iter = StudentList.iterator();
            int k=0;
            while (iter.hasNext()) {
                System.out.println(StudentList.get(k));
                k++;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        Map<Integer,String> people= new HashMap<>();
        people.put(11112,"John Oliver");
        people.put(11122,"Stephen Colbert");
        people.put(11222,"John Stewart");
        people.forEach((k, v) ->
            System.out.println("Key = "+k+ " Value = "+v));

    }

}