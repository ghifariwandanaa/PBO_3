/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal_3;
import java.util.Scanner;
/**
 *
 * @author Ghifari
 */

public class Soal_3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();
        
        String[] tokens = input.split("\\s+");
        
        try {
            int A = Integer.parseInt(tokens[0]);
            int B = Integer.parseInt(tokens[2]);
            int hasil = 0;

            if (A < 1 || B > 1000) {
                System.out.println("A atau B tidak dalam rentang yang valid.");
                return;
            }
            
            switch (tokens[1]) {
                case "+" -> hasil = A + B;
                case "-" -> hasil = A - B;
                case "*" -> hasil = A * B;
                case "/" -> hasil = A / B;
                case "%" -> hasil = A % B;
                default -> System.out.println("Operator tidak valid");
            }
            
            System.out.println(hasil);
        } catch (NumberFormatException e) {
            System.out.println("Format angka tidak valid.");
        }
    }
}


