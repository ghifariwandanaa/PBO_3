/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal_2;
import java.util.Scanner;
/**
 *
 * @author Ghifari
 */
public class Soal_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================");
        for(int i = 0; i < 3; i++ )
        {
            String s1=sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15s%03d %n",s1,x);
        }
        System.out.println("================");
    }
}
