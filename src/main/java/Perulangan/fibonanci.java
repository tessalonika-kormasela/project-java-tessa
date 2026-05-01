/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perulangan;

/**
 *
 * @author tessalonikagreciakormasela
 */
public class fibonanci {
    public static void main(String[] args){

    int a = 1, b = 1;
    
    for(int i = 0; i<8; i++){
       if(i>0)
           System.out.print(",");
    System.out.print(a);
    int jumlah = a+b;
    a = b;
    b = jumlah;
                   
   }
    
}
}