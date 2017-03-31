/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.simpleconsolecalcmaven;

/**
 *
 * @author Da-pro
 */
public class Main {

    
    private int first;
    private int second;
    
    public Main(int first, int second) {
       this.first = first;
       this.second = second;
    }

    public int getResult(){
       return first * second;
    }
    public int getMinus() {
    return first - second;
    
    }
    
    public double Divnull() {
    return first/second;
    
    }
    
}
