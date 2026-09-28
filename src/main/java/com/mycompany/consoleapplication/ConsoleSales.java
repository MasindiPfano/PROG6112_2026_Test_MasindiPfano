/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consoleapplication;

/**
 *
 * @author emeris
 */
public class ConsoleSales extends Console{
public ConsoleSales(String deviceType, String storeName, int totalSales) {

       super(deviceType, storeName, totalSales);  
}
    // Required Print Method
    public void printReport() {
        System.out.println("--------------------------------------------------");
        System.out.println("                  ENTITY REPORT                   ");
        System.out.println("--------------------------------------------------");
        System.out.println("FIELD ONE: " + deviceType());
        System.out.println("FIELD TWO: " + storeName());
        System.out.println("NUMERIC TOTAL: " + totalSales());
        System.out.println("--------------------------------------------------");
    }
}    

