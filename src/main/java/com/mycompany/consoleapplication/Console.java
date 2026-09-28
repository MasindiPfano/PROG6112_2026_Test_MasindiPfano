/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consoleapplication;

/**
 *
 * @author emeris
 */
public abstract class Console implements IConsoles{
    //Variables
    private String deviceType;
    private String storeName;
    private int totalSales;
    
    // Constructor with parameters
    public Console(String deviceType, String storeName, int totalSales) {
        this.deviceType = deviceType;
        this.storeName = storeName;
        this.totalSales = totalSales;
}
// Interface Method Implementations (Getters)
    @Override
    public String getdeviceType() {
        return deviceType;
    }

    @Override
    public String getstoreName() {
        return storeName;
    }

    @Override
    public int gettotalSales() {
        return totalSales;
    }
}