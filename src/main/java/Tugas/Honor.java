/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;
import java.util.Scanner;
/**
 *
 * @author tessalonikagreciakormasela
 */
public class Honor {
    
    Scanner input = new Scanner(System.in);
    
    String nama, pendidikan;
    int jam_kerja, lembur, golongan;
    double honor_tetap = 300000;
    double tunJab, tunPend, honor_lembur, total;
    
    public void InputDataKaryawan(){
        System.out.println("Program Hitung Honor Karyawan Kontrak");
        System.out.println("           PT DINGIN DAMAI           ");
        System.out.println("-------------------------------------");
        
        System.out.println("Masukkan Nama Karyawan          : ");
        nama = input.nextLine();
        
        System.out.println("Masukkan Golongan (1/2/3)       : ");
        golongan = input.nextInt();
        input.nextLine();
        
        System.out.println("Masukkan Pendidikan (SMU/D3/S1) : ");
        pendidikan = input.nextLine();
        
        System.out.println("Masukkan Jumlah Jam Kerja       : ");
        jam_kerja = input.nextInt(); 
        
        System.out.println("-------------------------------------");
    }
    
    public void getTunJab(){
        if(golongan == 1){
            tunJab = 0.05 * honor_tetap;
        }
        else if (golongan == 2){
            tunJab = 0.10 * honor_tetap;           
        }
        else if (golongan == 3){
            tunJab = 0.15 * honor_tetap;
        }
        else {
            tunJab = 0;
        }
    }
    
    public void getTunPend(){
        if (golongan == 1) {
            if (pendidikan.equalsIgnoreCase("SMU")) {
                tunPend = 0.025 * honor_tetap;
            } else if (pendidikan.equalsIgnoreCase("D3")) {
                tunPend = 0.05 * honor_tetap;
            } else if (pendidikan.equalsIgnoreCase("S1")) {
                tunPend = 0.075 * honor_tetap;
            }
        } 
        else if (golongan == 2) {
            if (pendidikan.equalsIgnoreCase("SMU")) {
                tunPend = 0.035 * honor_tetap;
            } else if (pendidikan.equalsIgnoreCase("D3")) {
                tunPend = 0.06 * honor_tetap;
            } else if (pendidikan.equalsIgnoreCase("S1")) {
                tunPend = 0.085 * honor_tetap;
            }
        } 
        else if (golongan == 3) {
            if (pendidikan.equalsIgnoreCase("SMU")) {
                tunPend = 0.045 * honor_tetap;
            } else if (pendidikan.equalsIgnoreCase("D3")) {
                tunPend = 0.07 * honor_tetap;
            } else if (pendidikan.equalsIgnoreCase("S1")) {
                tunPend = 0.095 * honor_tetap;
            }
        }
        else {
            tunPend = 0;
        }
    }
    
    public void getLembur(){
        if(jam_kerja > 8){
            lembur = jam_kerja - 8;
            honor_lembur = lembur * 2500;
        }
        else{
            honor_lembur = 0;
        }
    }
    
    public void SumTotal(){
        total = honor_tetap + tunJab + tunPend + honor_lembur;
    }
    
    public void OutPut(){
        System.out.println("               HASIL DATA              ");
        System.out.println("\nKaryawan yang bernama   : " + nama);
        System.out.println("Honor yang diterima sebagai berikut ");
        System.out.println("Honor Tetap             : Rp. " + honor_tetap);
        System.out.println("Tunjangan Jabatan       : Rp. " + tunJab);
        System.out.println("Tunjangan Pendidikan    : Rp. " + tunPend);
        System.out.println("Honor Lembur            : Rp. " + honor_lembur);
        System.out.println("------------------------------------- +");
        System.out.println("Honor yang diterima     : Rp. " + total);
    }
    
    
    
    
    
    
    
    
    
}
