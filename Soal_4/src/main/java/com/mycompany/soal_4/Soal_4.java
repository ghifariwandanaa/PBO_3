/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal_4;
import java.util.Scanner;
/**
 *
 * @author Ghifari
 */
public class Soal_4 {

    public static void main(String[] args) {
        float gajiutama = 500000;
        float hargabarang = 50000;
        System.out.print("Input Jumlah Penjualan : ");
        Scanner myObj = new Scanner(System.in);
        int totaljual = myObj.nextInt();
         float bati = totaljual*(hargabarang*10/100);
         float bonus = 0;
        if(totaljual > 80)
        {
            bonus = totaljual * (hargabarang * 35/100);
        }
        else if(totaljual >= 40 )
        {
            bonus = totaljual * (hargabarang * 25/100);
        }
        else if(totaljual < 15)
        {
            bonus = (totaljual-15) * (hargabarang * 15/100); //jadi denda
            bati = 0;
        }
        float totalgaji= gajiutama + bati + bonus;
        System.out.println("Total Gaji Adalah : " + totalgaji);
    }
}
