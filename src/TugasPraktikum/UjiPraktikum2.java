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
public class UjiPraktikum2 {
 public double hitung(int x, int y)throws Exception{
 double hasil = 0;
 try{
 hasil =  x/y;
 }catch(Exception ex){
 throw new Exception("Error Pembagian dengan Nol");
 }
 return hasil;
 }
}

