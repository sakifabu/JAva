package com.company;

/**
 * Created by Sakif on 4/23/2017.
 */
public class Student {
    private int Id;
    private String Year;
    private String Major;
    private String Name;
    Student(int id,String name,String Major, String Year){
        this.Id =id;
        this.Name =name;
        this.Major= Major;
        this.Year = Year;
    }
    @Override
    public String toString(){
        return String.format(
                "ID : %d \nName :  %s\nMajor :  %s\nYear :  %s\n",Id, Name, Major, Year);
    }
}
