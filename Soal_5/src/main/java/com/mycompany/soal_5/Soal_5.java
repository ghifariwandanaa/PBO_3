/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal_5;
import java.util.Scanner;
/**
 *
 * @author Ghifari
 */

public class Soal_5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Data: ");
        String kombinasiAngka = scan.nextLine();
        scan.close();

        String[] konversi = kombinasiAngka.split(" ");
        String hasil = konversi[0] + konversi[1] + konversi[2] + konversi[3];

        long hasilKonversi = Long.parseLong(hasil);

        if ((hasilKonversi-999999) % 5 != 0) {
            System.out.println("Berhenti");
        } else {
            System.out.println("Jalan");
        }
    }
}
