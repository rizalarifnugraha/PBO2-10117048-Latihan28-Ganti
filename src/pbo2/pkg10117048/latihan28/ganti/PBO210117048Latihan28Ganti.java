/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117048.latihan28.ganti;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama              : Rizal Arif Nugraha
 * Kelas             : PBO2
 * NIM               : 10117048 
 * Deskripsi Program : Program yang berisi tentang mengganti kata yang kita
 *                      inginkan.
 */
public class PBO210117048Latihan28Ganti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String said1;
        String said2;
        String said3;

        Scanner kata = new Scanner(System.in);

        System.out.println("===== Program Mengganti Nama =====");
        System.out.println("");
        System.out.print("Masukkan Kalimat\t : ");
        said1 = kata.nextLine();
        System.out.print("Ganti Kata\t : ");
        said2 = kata.next();
        System.out.print("Menjadi Kata\t : ");
        said3 = kata.next();

        System.out.println("");
        System.out.println("===== Hasil Formatting =====");
        System.out.println("Kalimat Awal\t : " + said1);
        String kataAkhir = said1.replace(said2, said3);
        System.out.println("Kalimat Baru\t : " + kataAkhir);

    }

}
