/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perulangan;

/**
 *
 * @author tessalonikagreciakormasela
 */
public class DeretBilGanjil {
    public static void main(String[] args){
        
        int a, b;
        int c=0;
        
        for(a = 1; a <=10; a++){
            int genap = (a * 2)-1;
            
            System.out.print(genap);
            c += genap;
            if(a<10){
                System.out.print("+");
                            }
        }
        System.out.print("=" + c); 
    }
}
