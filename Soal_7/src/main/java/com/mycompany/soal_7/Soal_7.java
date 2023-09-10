/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal_7;

/**
 *
 * @author Ghifari
 */
public class Soal_7{
public static void main(String[] args)
	 	{
		 //One Dimensional Arrays
		 int[] fisrtArray = {2, 5, 3};
		 int[] secondArray = {9, 5, 3};
		 int[] thirdArray = {2, 4, 9};
		 int[] fourthArray = {10, 11, 12};
		 int[] fifthArray = {13, 14, 15};
		 int[] sixthArray = {16, 17, 18};
		 int[] seventhArray = {19, 20, 21};
		 int[] eighthArray = {22, 23, 24};
		 int[] ninthArray = {25, 26, 27};
		 //Two Dimensional Arrays
		 int[][] twoDimensionalArray1 = {fisrtArray, secondArray, thirdArray};
		 int[][] twoDimensionalArray2 = {fourthArray, fifthArray, sixthArray};
		 int[][] twoDimensionalArray3 = {seventhArray, eighthArray, ninthArray};
		 //Three Dimensional Array
		 int[][][] threeDimensionalArray = {twoDimensionalArray1,twoDimensionalArray2, twoDimensionalArray3};
		
                for (int X = 0; X < 3; X++) {
                    System.out.print("{ ");
                    for (int Y = 0; Y < 3; Y++) {
                        System.out.print("{ ");

                        for (int Z = 0; Z < 3; Z++) {
                            System.out.print(threeDimensionalArray[X][Y][Z] + " ");
                        }

                        System.out.print("} ");
                    }
                    System.out.println("} ");
                }	
	 }
}