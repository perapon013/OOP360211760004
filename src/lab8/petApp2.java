package lab8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class petApp2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many your PET?: ");
        int val = Integer.parseInt(reader.readLine());
        ArrayList<Pet> myList = new ArrayList<>();
        myList = inputData(myList, val);
        Showdata(myList);


    }

    private static void Showdata(ArrayList<Pet> myList) {
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("Pet info " + (i + 1) + ": ");
            System.out.println("Name: " + myList.get(i).getName());
            System.out.println("Age: " + myList.get(i).getAge());
            System.out.println("General: " + myList.get(i).getGeneral());
        }
    }

    private static ArrayList inputData(ArrayList<Pet> mylist, int val) throws IOException  {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 1; i <= val; i++) {
            Pet p = new Pet();
            System.out.println("Enter student info "+i+": ");
            System.out.print("Name: ");
            p.setName(reader.readLine());
            System.out.print("Age: ");
            p.setAge(Integer.parseInt(reader.readLine()));
            System.out.print("Gender: ");
            p.setGeneral(reader.readLine());
            myList.add(p);
        }
        return myList;
    }
}