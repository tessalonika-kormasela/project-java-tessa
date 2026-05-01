/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perulangan;

/**
 *
 * @author tessalonikagreciakormasela
 */
public class LatFor {
    public static void main(String[] args){
        
        int a, b;
        
        for(a = 1; a<=5; a++){
            int c = 0;
            
            
            System.out.println();
            
            for(b = a; b<=5; b++)
            {
            System.out.print(a);
            c += a;
            if(b<5){
                System.out.print("+");
                            }
        }
        System.out.println("=" + c); 
    }
}
}