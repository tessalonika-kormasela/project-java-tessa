/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OperatorKondisi;
import java.util.Scanner;
/**
 *
 * @author tessalonikagreciakormasela
 */
public class IfClassAksi {
    public static void main(String[] args){
        
     double tot_beli;
     Scanner input = new Scanner(System.in);
     IfClass fungsiif = new IfClass();
     
     System.out.print("Total Pembelian Rp. ");
     fungsiif.TotBeli = input.nextDouble();
     
     System.out.println("Besarnya Potongan Rp. " + fungsiif.getPotongan());
     System.out.println("Jumlah yang harus dibayarkan Rp. " + fungsiif.JumlahBayar());
        
    }
    
}
