/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Varian;

import Interface.FillingTopping;
import uasfikss.Pizza;

/**
 *
 * @author ACER
 */
public class PizzaVarian1 extends Pizza implements FillingTopping {
    int beratKejuTopping=30;
    int beratSosisTopping=50;
    int beratSmokedBeefTopping=50;
    int beratBawangBombayTopping=30;

    @Override
    public double hargaFilling() {
        return 0;
    }


    @Override
    public double hargaTopping() {
        hitungHargaFilTopPerGram();
        double hargaKejuTopping = this.hargaKejuPerGram*this.beratKejuTopping;
        double hargaSosisTopping = this.hargaSosisPerGram*this.beratSosisTopping;
        double hargaSmokedBeefTopping = this.hargaSmokedBeefPerGram*this.beratSmokedBeefTopping;
        double hargaBawangBombayTopping = this.hargaBawangBombayPerGram*this.beratBawangBombayTopping;
        double hargaToppingTotal = hargaKejuTopping+hargaSosisTopping+hargaSmokedBeefTopping+hargaBawangBombayTopping;
        return hargaToppingTotal;
    }
    
    public void tampil(){
        hitungHargaPerPCS();
        System.out.println("Variasi                         = Roti Pizza Varian 1");
        System.out.println("Jumlah Pesanan                  = "+this.jumlahPesanan);
        System.out.println("-----------------------------------------------------------------");
        hitungBeratAdonanTotal();
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Harga Bahan 1 pcs               = Rp "+hitungHargaPerPCS());
        System.out.println("Harga Filling 1 pcs             = Rp "+hargaFilling());
        System.out.println("Harga Topping 1 pcs             = Rp "+hargaTopping());
        double hargaTotal = hitungHargaPerPCS()+hargaFilling()+ hargaTopping();
        double tambahanHargaJual = hargaTotal/2;
        double hargaJual = hargaTotal+tambahanHargaJual;
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Harga modal bahan(tnp Profit)   = Rp "+hargaTotal*this.jumlahPesanan);
        System.out.println("Harga jual Total                = Rp "+hargaJual*this.jumlahPesanan);
        System.out.println("Harga jual per PCS              = Rp "+hargaJual);
        System.out.println("\n \n");
    }
}
