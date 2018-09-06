/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author SMK TELKOM
 */
public class praktikum1 {
    public static void main(String[] args) {
        //pengambilan fungsi main
        int a  =45; //deklarasi tipe data
        int b=15; //deklarasi tipe data
        try{
            int c  = a/b;
            System.out.println("Hasilnya adalah " + c); 
            int[] angka = {1, 2, 3}; // array dengan 5 elemen
            angka[4] = 60; // mengakses indeks ke 24
            //int y = x/0;
        }catch (Exception e) {
            System.out.println("Salah");
            System.out.println(e); //blok jika terjadi kesalahan
        }finally    {
            System.out.println("Kesalahan Sudah selesai");
            
        }
        System.out.println("Selesai");

        }
}
