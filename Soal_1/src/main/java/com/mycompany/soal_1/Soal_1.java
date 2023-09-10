/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal_1;
import java.util.Scanner;

public class Soal_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if (!scan.hasNext()) {
            System.out.println("0");
            scan.close();
            return;
        }
        String s = scan.nextLine().trim();
        scan.close();

        String[] tokens = s.split("[^A-Za-z]+");

       System.out.println(tokens.length);

        // Print each token on a new line
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}

