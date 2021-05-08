/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/
package hackerearth;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

import java.io.*;

class BirthdayParty {
    public static void main(String args[]) throws Exception {
        /*
         * Sample code to perform I/O: Use either of these methods for input
         * 
         * //BufferedReader BufferedReader br = new BufferedReader(new
         * InputStreamReader(System.in)); String name = br.readLine(); // Reading input
         * from STDIN System.out.println("Hi, " + name + "."); // Writing output to
         * STDOUT
         * 
         * //Scanner Scanner s = new Scanner(System.in); String name = s.nextLine(); //
         * Reading input from STDIN System.out.println("Hi, " + name + "."); // Writing
         * output to STDOUT
         * 
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int line[][] = new int[t][2];
        for (int i = 0; i < t; i++) {
            String lines = br.readLine();
            String[] strs = lines.trim().split(" ");

            for (int j = 0; j < strs.length; j++) {
                line[i][j] = Integer.parseInt(strs[j]);
            }
        }
        for (int i = 0; i < t; i++) {
            if ((line[i][1] % line[i][0]) == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }
}