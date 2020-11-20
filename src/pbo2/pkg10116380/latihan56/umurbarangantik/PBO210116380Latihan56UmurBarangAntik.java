/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116380.latihan56.umurbarangantik;

/**
 * Nama : Zain Achmad Rizqullah 
 * Nim : 10116380
 * Kelas : PBO2 
 * Deskripsi Program : Program ini berisi tentang usia barang antik
 */
public class PBO210116380Latihan56UmurBarangAntik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Radio rdo = new Radio(234);
        rdo.setName("Radio AM");
        System.out.println("Nama Barang Antik : " + rdo.getName());
        rdo.tampilUmur();
    }
        
    
    
}
