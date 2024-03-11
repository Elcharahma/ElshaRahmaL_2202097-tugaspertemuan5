/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihanpertemuan5soal2;

/**
 *
 * @author ELSHA
 */
import java.util.Scanner;
public class LatihanPertemuan5Soal2 {

    static void segitigaSisi(){
        
        int sisi1, sisi2, sisi3;
        Scanner sisi = new Scanner(System.in);
        
        System.out.println("Masukkan 3 Sisi");
        sisi1 = sisi.nextInt();
        sisi2 = sisi.nextInt();
        sisi3 = sisi.nextInt();
        if(sisi1 == sisi2 && sisi2 == sisi3){
            System.out.println("Termasuk Kubus");
        }else{
            System.out.println("Bukan Kubus wle");
        }
    }
    public static void main(String[] args) {
        
        segitigaSisi();
        
    }
}
