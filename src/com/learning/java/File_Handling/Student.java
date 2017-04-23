package com.learning.java.File_Handling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Aditya Rajput on 4/22/2017.
 */
public class Student {
    private String name;
    public String regNum;
    private String facultyName;

    private String branch;

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }


    private String year,semester;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }



    public void writeConvoy(Student student) throws IOException {

        try (FileWriter fw = new FileWriter("Test_Sheets/"+regNum+".txt",true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println("\t-------------Information--------------");
            out.println("Name of the student :" + student.getName());
            out.println("Element Number :" + student.getRegNum());
            out.println("About Faculty :" + student.getFacultyName());
            out.println("Year :" + student.getYear());
            out.println("Semester :" + student.getSemester());
            out.println("\t--------------------------------------");
        }
    }




}
