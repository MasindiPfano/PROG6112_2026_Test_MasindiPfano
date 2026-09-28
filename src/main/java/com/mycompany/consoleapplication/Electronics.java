/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.consoleapplication;

/**
 *
 * @author emeris
 */
import java.util.Scanner;

public class Electronics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // city array declarations
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
        
        // 2D Array for sales ps5, xbox, switch
        int[][] electronics = new int[3][3];
        
        // Array to store calculated totals per city
        int[] rowTotals = new int[3];

        // Entering sales & Accumulation Loop
        for (int i = 0; i < cities.length; i++) {
            System.out.print("Enter PS5 sales for " + cities[i] + ": ");
            electronics[i][0] = scanner.nextInt();

            System.out.print("Enter XBOX sales for " + cities[i] + ": ");
            electronics[i][1] = scanner.nextInt();

            System.out.print("Enter Nintendo Switch sales for " + cities[i] + ": ");
            electronics[i][2] = scanner.nextInt();

            // Accumulate Row Total
            rowTotals[i] = electronics[i][0] + electronics[i][1] + electronics[i][2];
            System.out.println(); 
        }

        // Report
        System.out.println("---------------------------------------------------------------");
        System.out.println("           GAMING CONSOLE  REPORT              ");
        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-18s %-12s %-12s %-15s\n", "CITY", "PS5", "XBOX", "SWITCH");

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-18s %-12d %-12d %-15d\n", 
                    cities[i], electronics[i][0], electronics[i][1], electronics[i][2]);
        }

        //  Totals Report
        System.out.println("---------------------------------------------------------------");
        System.out.println("                 TOTAL SALES FOR EACH CITY                     ");
        System.out.println("---------------------------------------------------------------");

        int maxTotal = -1;
        int maxIndex = 0;

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-18s %-12d\n", cities[i], rowTotals[i]);

            // tracking city with the highest total console sales
            if (rowTotals[i] > maxTotal) {
                maxTotal = rowTotals[i];
                maxIndex = i;
            }
        }

        // displaying city with most Sales
        System.out.println("---------------------------------------------------------------");
        System.out.println("CITY WITH THE MOST SALES: " + cities[maxIndex]);
        System.out.println("---------------------------------------------------------------");

        scanner.close();
    }
}