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
public class latIfClass {
            public String nama_pembeli, kode, kue;
            public double harga, total;
            public int jumlah_beli; 
            Scanner input = new Scanner(System.in);
            
            public void InputDataKue(){
            System.out.print("Masukkan Nama Pembeli           : ");
            nama_pembeli = input.nextLine();
            System.out.print("Masukkan kode [B001|C001|T001]  :" );
            kode = input.nextLine();
            System.out.print("Masukkan Jumlah Beli            : ");
            jumlah_beli = input.nextInt();
            }
            
            public String getKue(){
                if (kode.equalsIgnoreCase("B001")){
                    kue = "Bolu" ;
                    harga = 10000;
                }
                else if(kode.equalsIgnoreCase("C001")){
                    kue = "Cake";
                    harga = 20000;
                }
                else if(kode.equalsIgnoreCase("T001")){
                    kue = "Tart";
                    harga = 15000;   
                }
                else{
                    kode = "Kode Tidak Valid";
                    harga = 0;
                }
                return kue;
            }
            
            
            public double HitungTotal(){
                total = harga * jumlah_beli;
                return total;
            }        
                
            public void keluaran(){     
                System.out.println("\nPENJUALAN KUE PADA TOKO KUE LEZAT");
                System.out.println("JL. Sagu No.27A Kebagusan , Jakarta Selatan");
                System.out.println("--------------------------------------------");
                System.out.println("Pembeli                 : " + nama_pembeli);
                System.out.println("Kode Kue                : "+ kode);
                System.out.println("Nama Kue                : " + kue);
                System.out.println("Harga                   : " + harga);
                System.out.println("Jumlah Beli             : " + jumlah_beli);
                System.out.println("--------------------------------------------");
                System.out.println("TOTAL                   : " + total);
                System.out.println("--------------------------------------------");
            }
                
            }          


