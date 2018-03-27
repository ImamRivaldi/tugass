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
public class PemesananTiket {
    int hrgTiket;
    int jmlBeli;
    
    void tampildata(){
        System.out.println("~~~~~~~~~~~Pemesanan~~~~~~~~~~~~");
        System.out.println("Harga Tiket         = "+hrgTiket);
        System.out.println("Jumlah Pembelian    = "+jmlBeli);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
    int hitungPembelian(){
        int total;
        total=hrgTiket*jmlBeli;
        return total;
    }
}
