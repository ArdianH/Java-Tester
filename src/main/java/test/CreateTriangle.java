package test;

import java.util.Scanner;

/**
 * Created by Ardian Hosen on 05/09/2016.
 */
public class CreateTriangle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int height = scan.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + ",");
            }
            System.out.println("");
        }

    }
}
