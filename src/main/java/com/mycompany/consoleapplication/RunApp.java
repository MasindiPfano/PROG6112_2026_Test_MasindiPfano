/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consoleapplication;

import java.util.Scanner;

/**
 *
 * @author emeris
 */


public class RunApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter console type 1: ");
        String fieldOne = scanner.nextLine();

        System.out.print("Enter console type 2: ");
        String fieldTwo = scanner.nextLine();

        System.out.print("Enter console type 3: ");
        String fieldThree = scanner.nextLine();
        
        System.out.print("Enter numeric value: ");
        int numericField = scanner.nextInt();

        // Instantiate Subclass Object
        salesReport report = new salesReport(deviceType, storeName, totalSales);

        // Execute Print Method
        report.printReport();

        scanner.close();
    }
}


