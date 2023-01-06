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
public abstract class Roti {
    public double hargaTepungPerAdonan;
    public double hargaGulaPerAdonan;
    public double hargaButterPerAdonan;
    public double hargaRagiPerAdonan;
    public double hargaSusuBubukPerAdonan;
    public double hargaSusuCairPerAdonan;
    public double hargaTelurPerAdonan;
    public double hargaEsBatuPerAdonan;
    
    public double hargaTepungPerGram;
    public double hargaGulaPerGram;
    public double hargaButterPerGram;
    public double hargaRagiPerGram;
    public double hargaSusuBubukPerGram;
    public double hargaSusuCairPerGram;
    public double hargaTelurPerGram;
    public double hargaEsBatuPerGram;
    
    public double hargaKejuPerGram;
    public double hargaCoklatPerGram;
    public double hargaKrimVanillaPerGram;
    public double hargaSelaiRedBeanPerGram;
    public double hargaSosisPerGram;
    public double hargaSmokedBeefPerGram;
    public double hargaBawangBombayPerGram;
    
    public double beratTepungPerPesanan;
    public double beratGulaPerPesanan;
    public double beratButterPerPesanan;
    public double beratRagiPerPesanan;
    public double beratSusuBubukPerPesanan;
    public double beratSusuCairPerPesanan;
    public double beratTelurPerPesanan;
    public double beratEsBatuPerPesanan;
    
    public double totalHargaAdonan;
    public double jumlahPesanan;
    
    public abstract double hitungHargaAdonan();
    public abstract double hitungHargaPerPCS();
    public abstract void hitungBeratAdonanTotal();
    public void hitungHargaBahanPerGram(){
        this.hargaTepungPerGram = 40000/1000;
        this.hargaGulaPerGram = 25000/1000;
        this.hargaButterPerGram = 23000/500;
        this.hargaRagiPerGram = 5000/11;
        this.hargaSusuBubukPerGram = 39000/1000;
        this.hargaSusuCairPerGram = 24000/1000;
        this.hargaTelurPerGram = 23000/1000;
        this.hargaEsBatuPerGram = 2000/1000;
    }
    public void hitungHargaFilTopPerGram(){
        this.hargaKejuPerGram = 31000/250;
        this.hargaCoklatPerGram = 29000/500;
        this.hargaKrimVanillaPerGram = 30000/500;
        this.hargaSelaiRedBeanPerGram = 25000/500;
        this.hargaSosisPerGram = 80000/1000;
        this.hargaSmokedBeefPerGram = 90000/1000;
        this.hargaBawangBombayPerGram = 40000/500;
    }
}
