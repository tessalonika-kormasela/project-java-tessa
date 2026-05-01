/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OperatorKondisi;

/**
 *
 * @author tessalonikagreciakormasela
 */
public class IfClass {
    public double TotBeli, potongan;
    
    public void setTotalBeli (double a) {
        TotBeli = a;
    }
    
    public double getPotongan(){
        if (TotBeli >= 50000){
            potongan = 0.2 * TotBeli;
        }
        return potongan;
    }
    
    public double JumlahBayar() {
        return (TotBeli - potongan);
    }
}
