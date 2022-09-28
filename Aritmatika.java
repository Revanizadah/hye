/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpertama;

import java.util.Scanner;

/**
 *
 * @author Noval
 */
public class Aritmatika {
    public static void main(String[] args) {
        int i=2, j=3, k=5;
//        int l = 1,5;
//        double hasil = x+y/2;
        System.out.println((i+j+k)/3);
    int jam, sisaJam, menit, detik, masukkan;
    Scanner input = new Scanner(System.in);
    
    
        System.out.println("Sistem Koverensi Waktu");
        System.out.println("====================================");
        System.out.println("Masukkan Angka Dalam Satuan Detik =");
        masukkan = input.nextInt();
        jam = masukkan/3600;
        sisaJam =masukkan%3600;
        menit = (sisaJam) /60;
        detik =sisaJam%60;
        
        System.out.println("Hasil konservasi :" + jam + " jam " + sisaJam + " sisaJam " 
                + menit + " menit " + detik + " detik " + masukkan + " masukkan ");
//        
    }
}
