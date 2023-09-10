/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal_6;
import java.util.Scanner;
import java.math.*;
/**
 *
 * @author Ghifari
 */
public class Soal_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BigInteger a = new BigInteger(scan.nextLine());
		BigInteger b = new BigInteger(scan.nextLine());
		BigInteger tambah = a.add(b);
		BigInteger kali = a.multiply(b);
		
		System.out.println(tambah+"\n"+kali);
	}
}
