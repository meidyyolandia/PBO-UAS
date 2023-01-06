/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uasfikss;

/**
 *
 * @author ACER
 */
public class Pizza extends Roti {
    
    @Override
    public double hitungHargaAdonan() {
        hitungHargaBahanPerGram();
        this.hargaTepungPerAdonan = this.hargaTepungPerGram*1000;
        this.hargaGulaPerAdonan = this.hargaGulaPerGram*100;
        this.hargaButterPerAdonan = this.hargaButterPerGram*100;
        this.hargaRagiPerAdonan = this.hargaRagiPerGram*20;
        this.hargaSusuBubukPerAdonan = this.hargaSusuBubukPerGram*200;
        this.hargaSusuCairPerAdonan = this.hargaSusuCairPerGram*180;
        this.hargaTelurPerAdonan = this.hargaTelurPerGram*50;
        this.hargaEsBatuPerAdonan = this.hargaEsBatuPerGram*300;
        
        this.totalHargaAdonan = this.hargaTepungPerAdonan+this.hargaGulaPerAdonan+this.hargaButterPerAdonan
                +this.hargaRagiPerAdonan+this.hargaSusuBubukPerAdonan+this.hargaSusuCairPerAdonan+this.hargaTelurPerAdonan
                +this.hargaEsBatuPerAdonan;
        return this.totalHargaAdonan;
    }

    @Override
    public double hitungHargaPerPCS() {
        double jumlahPcsPerAdonan = 1950/190;
        hitungHargaAdonan();
        double totalHargaPerPCS = this.totalHargaAdonan/jumlahPcsPerAdonan;
        return totalHargaPerPCS;
    }
    
    @Override
    public void hitungBeratAdonanTotal(){
        double jumlahPcsPerAdonan = 1950/190;
        this.beratTepungPerPesanan = (1000/jumlahPcsPerAdonan)*this.jumlahPesanan;
        this.beratGulaPerPesanan = (100/jumlahPcsPerAdonan)*this.jumlahPesanan;
        this.beratButterPerPesanan = (100/jumlahPcsPerAdonan)*this.jumlahPesanan;
        this.beratRagiPerPesanan = (20/jumlahPcsPerAdonan)*this.jumlahPesanan;
        this.beratSusuBubukPerPesanan = (200/jumlahPcsPerAdonan)*this.jumlahPesanan;
        this.beratSusuCairPerPesanan = (180/jumlahPcsPerAdonan)*this.jumlahPesanan;
        this.beratTelurPerPesanan = (50/jumlahPcsPerAdonan)*this.jumlahPesanan;
        this.beratEsBatuPerPesanan = (300/jumlahPcsPerAdonan)*this.jumlahPesanan;
        
        System.out.println("Berat tepung yg dibutuhkan      = "+this.beratTepungPerPesanan+ " gr");
        System.out.println("Berat gula yg dibutuhkan        = "+this.beratGulaPerPesanan+ " gr");
        System.out.println("Berat butter yg dibutuhkan      = "+this.beratButterPerPesanan+ " gr");
        System.out.println("Berat ragi yg dibutuhkan        = "+this.beratRagiPerPesanan+ " gr");
        System.out.println("Berat susu bubuk yg dibutuhkan  = "+this.beratSusuBubukPerPesanan+ " gr");
        System.out.println("Berat susu cair yg dibutuhkan   = "+this.beratSusuCairPerPesanan+ " gr");
        System.out.println("Berat telur yg dibutuhkan       = "+this.beratTelurPerPesanan+ " gr");
        System.out.println("Berat es batu yg dibutuhkan     = "+this.beratEsBatuPerPesanan+ " gr");
        
    }
    
}
