/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saldotabungan;

import java.util.Scanner;

/**
 * Nama : Moch Rizki Maulana N
 * Kelas : IF-1/S1/III
 * NIM : 10118012
 * Deskripsi Program: menghitung saldo tabungan berdasarkan lama 
 *
 * @author LENOVO
 */
public class Saldotabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Saldo Awal\t : Rp ");
        int Sa = input.nextInt();
        System.out.print("Bunga/Bulan(%)\t : ");
        int Bunga = input.nextInt();
        System.out.print("Lama(Bulan)\t : ");
        int lama = input.nextInt();
        
        double sat;
        int i =1;
        Sa=2500000;
        while(i <= lama){
            Bunga = Sa * 15/100;
            Sa = Bunga + Sa;
            System.out.println("Saldo Di Bulan Ke-"+i+" = Rp "+Sa);
            i++;
        }
        
        System.out.println("( Develoved By : Moch Rizki Maulna N )");
    }
    
}
