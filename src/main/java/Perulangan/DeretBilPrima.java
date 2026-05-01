/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perulangan;

/**
 *
 * @author tessalonikagreciakormasela
 */
public class DeretBilPrima {
    public static void main(String[] args){
        int a = 0, b;
        
        for(b = 2; a <=8; b++){
            int pembagi = 0;
            
            for(int i = 2; i<b; i++){
                if(b % i == 0){
                    pembagi ++;
                    break;
                }
            }
            
            if(pembagi == 0){
                if(a > 0) System.out.print(", ");
                System.out.print(b);
                a++;
            }
        }
    }
}
