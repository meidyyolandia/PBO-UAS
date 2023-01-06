/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uasfikss;

import Varian.ManisVarian1;
import Varian.ManisVarian2;
import Varian.ManisVarian3;
import Varian.PizzaVarian1;
import Varian.TawarVarian1;
import Varian.TawarVarian2;

/**
 *
 * @author ACER
 */
public class UASFIKSS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ManisVarian1 pesan1 = new ManisVarian1();
        pesan1.jumlahPesanan=20;
        pesan1.tampil();
        
        ManisVarian2 pesan2 = new ManisVarian2();
        pesan2.jumlahPesanan=100;
        pesan2.tampil();
        
        ManisVarian3 pesan3 = new ManisVarian3();
        pesan3.jumlahPesanan=70;
        pesan3.tampil();
        
        TawarVarian1 pesan4 = new TawarVarian1();
        pesan4.jumlahPesanan=20;
        pesan4.tampil();
        
        TawarVarian2 pesan5 = new TawarVarian2();
        pesan5.jumlahPesanan=15;
        pesan5.tampil();
        
        PizzaVarian1 pesan6 = new PizzaVarian1();
        pesan6.jumlahPesanan=10;
        pesan6.tampil();
    }
    
}
