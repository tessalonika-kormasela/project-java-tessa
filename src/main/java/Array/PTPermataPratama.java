/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;
import java.util.*;
/**
 *
 * @author tessalonikagreciakormasela
 */
public class PTPermataPratama {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String Petugas, tanggal;
        int i,jumlahData;

        System.out.print("\t\tPT. PERMATA PRATAMA\t\t");
        System.out.print("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
     
        System.out.print("Nama Petugas : ");
        namaPetugas = input.nextLine();

        System.out.print("Tanggal : ");
        tanggal = input.nextLine();

        System.out.print("Jumlah Data : ");
        jumlahData = input.nextInt();


        String[] kode = new String[jumlahData];
        String[] nama = new String[jumlahData];
        int[] harga = new int[jumlahData];
        int[] jumlah = new int[jumlahData];
        int[] total = new int[jumlahData];

        int totalPendapatan = 0;
        
    
        

        // Input data
        for(i = 0; i<jumlahData; i++);
        {
            System.out.print("\t\tData ke - " + (i+1));
            System.out.print("\t\tKode Barang   : ");
            kode[i] = input.next();
            
            System.out.print("\t\tJumlah        : ");
            jumlah[i] = input.nextInt();
            System.out.print("\t-------------------------------------------");
        }
        if(kode[i].equalsIgnoreCase("P001")){
            nama[i]="Printer";
            harga[i]=700000;
        } 
        else if(kode[i].equalsIgnoreCase("V001")){
            nama[i]="VGA Card";
            harga[i]=75000;        
        }
        else if(kode[i].equalsIgnoreCase("M001")){
            nama[i]="Motherboard";
            harga[i]=950000;
        }   
        else
        {
            nama[i]="Input Tidak Valid";
            harga[i]=0;
        }
        
        total[i]=harga[i]*jumlah[i];
        totalPendapatan += total[i];
        
    
    System.out.print("\t\t\tPT. PERMATA PRATAMA\t\t\t");
    System.out.print("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    System.out.
    }
}
        