/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihanpertemuan5soal3;

/**
 *
 * @author ELSHA
 */
import java.util.Scanner;
public class LatihanPertemuan5Soal3 {

    static String segitiga(int s1, int s2, int s3){
        if(s1 * s1 + s2 * s2 == s3 * s3){
            return "Segitiga Siku - Siku";
        }else if(s1 * s1 + s2 * s2 > s3 * s3){
             return "Segitiga Lancip";
        }else{
             return "Segitiga Tumpul";
        }
    }    
    
    public static void main(String[] args) {
         Scanner segitiga = new Scanner(System.in);
        int s1,s2,s3;
        
             
        System.out.println("Masukkan 3 sisi Segitiga");
        s1 = segitiga.nextInt();
        s2 = segitiga.nextInt();
        s3 = segitiga.nextInt();
        
        String jenisSegitiga = segitiga(s1,s2,s3);
        System.out.println(jenisSegitiga);
        
    }
}
