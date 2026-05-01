/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author tessalonikagreciakormasela
 */

public class LatScanner {
    public String nama, nim;
    public double na, nt, nuts, nuas, rata;
    
    Scanner input = new Scanner (System.in);
    
    public String getnama(){
        return nama;
    }
    
    public String nim(){
        return nim;
    }
  
    public void inputScanner(){

System.out.print("Masukan Nama Anda : ");
nama = input.nextLine();
System.out.print("Masukan NIM Anda : ");
nim = input.nextLine();
System.out.print("Masukkan Nilai Absen : ");
na = input.nextDouble();
System.out.print("Masukkan Nilai Tugas : ");
nt = input.nextDouble();
System.out.print("Masukkan Nilai UTS : ");
nuts = input.nextDouble();
System.out.print("Masukkan Nilai UAS : ");
nuas = input.nextDouble();
    }
    
public void rata(){
    rata = ((na * 0.10)+(nt * 0.20)+(nuts * 0.30)+(nuas * 0.40));
 }

    
    
}
