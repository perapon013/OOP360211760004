package lap5;

import javax.net.ssl.SSLContext;
import java.util.Scanner;

public class Myarray {
    public static void main(String[] args) {
        int a[] = new int[5];
        System.out.println(a[0]);
        a[0] = 10;
        System.out.println(a[0]);

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "]: ");
            a[i] = sc.nextInt();
        }

        System.out.println("Data in array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"\t");

        }
        System.out.println("\n Enhanced for loop");
        for (int val:a){
            System.out.print(val+"\t");
        }
    }
}