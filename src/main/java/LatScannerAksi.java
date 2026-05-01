/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author tessalonikagreciakormasela
 */
public class LatScannerAksi {
    
    public static void main(String[] args) {
        
        LatScanner scan = new LatScanner();
        
        scan.inputScanner();
        scan.rata();
        System.out.println("PROGRAM NILAI MAHASISWA");
        System.out.println("------------------------------");
        System.out.println("\nNIM : " + scan.nim);
        System.out.println("Nama Mahasiswa/i : " + scan.nama);
        System.out.println("Nilai Absen : " + scan.na);
        System.out.println("Nilai Tugas : " + scan.nt);
        System.out.println("Nilai UTS : " + scan.nuts);
        System.out.println("Nilai UAS : " + scan.nuas);
        System.out.println("------------------------------");
        System.out.println("Rata-rata : " + scan.rata);
    
}
}
