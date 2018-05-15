package lab7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class StudentAppArrayList {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("How many data you do have?: ");
        int val = Integer.parseInt(reader.readLine());
        ArrayList<Student> myList = new ArrayList<Student>();
        myList = inputData(myList,val);
    }//main

    private static ArrayList inputData(ArrayList<Student> myList, int val) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 1; i <= val; i++) {
                Student s = new Student();
                System.out.println("Enter student info "+i+": ");
                System.out.print("Name: ");
                s.setName(reader.readLine());
                System.out.print("Age: ");
                s.setAge(Integer.parseInt(reader.readLine()));
                System.out.print("Gender: ");
                s.setGender(reader.readLine());
                System.out.print("Height: ");
                s.setHeight(Double.parseDouble(reader.readLine()));
            myList.add(s);
        }
        return myList;
    }

}//Class
