/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugass;

/**
 *
 * @author ACER
 */
public class PemesananAksi {
    public static void main(String[] args) {
        PemesananTiket P1 = new PemesananTiket();
        
        P1.hrgTiket=200000;
        P1.jmlBeli=5;
        
        P1.tampildata();
        System.out.println("Total Harga         = "+P1.hitungPembelian());
        P1.cetaktotal();
        
        PemesananTiket P2 = new PemesananTiket();
        P2.tampildata();
        P2.cetaktotal();
        
        PemesananTiket P3 = new PemesananTiket(180000,2);
        P3.tampildata();
        P3.cetaktotal();
    }
}
