/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;
import java.util.Scanner;
/**
 *
 * @author tessalonikagreciakormasela
 */
public class ArrayPlg {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i, jd;
        String[] nm = new String[10];
        String[] kp = new String[10];
        String[] almt = new String[10];
        String tanya = "";

        do {
            System.out.print("Masukkan jumlah data (maks 10): ");
            jd = input.nextInt();

            // Validasi jumlah data
            if (jd > 10) {
                System.out.println("Data melebihi kapasitas array!");
                continue;
            }

            // Input data
            for (i = 0; i < jd; i++) {
                System.out.println("\nData Ke- " + (i + 1));
                System.out.print("Kode pelanggan   : ");
                kp[i] = input.next();

                System.out.print("Nama pelanggan   : ");
                nm[i] = input.next();

                System.out.print("Alamat pelanggan : ");
                almt[i] = input.next();
            }

            // Output data
            System.out.println("\n\nDATA PELANGGAN PT. SENTOSA JAYA");
            System.out.println("Jl. Sagu No.27A Kebagusan Jakarta Selatan");
            System.out.println("==============================================================");
            System.out.println("No \tKode Pelanggan \t Nama Pelanggan\t\t Alamat");
            System.out.println("==============================================================");
            
            for (i = 0; i < jd; i++) {
                ///System.out.println("Data Ke- " + (i + 1));
                ///System.out.println("Kode pelanggan   : " + kp[i]);
                ///System.out.println("Nama pelanggan   : " + nm[i]);
                ///System.out.println("Alamat pelanggan : " + almt[i]);
                ///System.out.println("==============================================================");
                System.out.println(i+"\t\t"+kp[i]+"\t\t"+nm[i]+"\t\t"+almt[i]);
            }

            System.out.print("Mau input data lagi? (Y/T): ");
            tanya = input.next();

        } while (tanya.equalsIgnoreCase("Y"));

        System.out.println("Program selesai.");
    }
}
