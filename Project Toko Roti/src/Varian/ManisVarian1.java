/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Varian;

import Interface.FillingTopping;
import uasfikss.Manis;

/**
 *
 * @author ACER
 */
public class ManisVarian1 extends Manis implements FillingTopping {
    int beratKejuFilling=5;
    int beratCoklatFilling=5;
    int beratCoklatTopping=5;
    

    @Override
    public double hargaFilling() {
        hitungHargaFilTopPerGram();
        double hargaCoklatFilling = this.hargaCoklatPerGram*this.beratCoklatFilling;
        double hargaKeju = this.hargaKejuPerGram*this.beratKejuFilling;
        double hargaFillingTotal = hargaCoklatFilling+hargaKeju;
        return hargaFillingTotal;
    }


    @Override
    public double hargaTopping() {
        hitungHargaFilTopPerGram();
        double hargaCoklatTopping = this.hargaCoklatPerGram*this.beratCoklatTopping;
        return hargaCoklatTopping;
    }
    
    public void tampil(){
        hitungHargaPerPCS();
        System.out.println("Variasi                         = Roti Manis Varian 1");
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
        System.out.println("------------------------------------------------------------------");
        System.out.println("Harga modal bahan(tnp Profit)   = Rp "+hargaTotal*this.jumlahPesanan);
        System.out.println("Harga jual Total                = Rp "+hargaJual*this.jumlahPesanan);
        System.out.println("Harga jual per PCS              = Rp "+hargaJual);
        System.out.println("\n \n");
    }
    
}
