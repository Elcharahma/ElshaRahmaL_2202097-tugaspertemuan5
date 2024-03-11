/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihanpertemuan5soal1;

/**
 *
 * @author ELSHA
 */
import java.util.Scanner;
public class LatihanPertemuan5Soal1 {

    static void jalanN(int n){
        System.out.println("Bilangan dari 1 sampai dengan " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    } 
    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);
      
        System.out.println("Masukkan Angka Lebih dari 1");
        int nilai = angka.nextInt();
        
        if(nilai>=1){
            jalanN(nilai);
        }else{
            System.out.println("Lebihan dong!");
        }
    }
}
    

