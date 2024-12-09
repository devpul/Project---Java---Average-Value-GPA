/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ratarata;

/**
 *
 * @author PCDEWA
 */
public class RataRataIPK {
    //deklarasi variabel
    private double matdis, data_mining, keamanan_data_informasi;
    private double komputasi_paralel, kecerdasan_buatan;
    private double kompleksitas_algo, pemrograman_web, praktikum_pemweb;
    
    //fungsi setter
    public void setMatdis(double matdis){
        this.matdis = matdis;
    }
    
    public void setDataMining(double data_mining){
        this.data_mining = data_mining;
    }
   
    public void setKeamananDataInfo(double keamanan_data_informasi){
        this.keamanan_data_informasi = keamanan_data_informasi;
    }
    
    public void setKomputasiParalel(double komputasi_paralel){
        this.komputasi_paralel = komputasi_paralel;
    }
    
    public void setKecerdasanBuatan(double kecerdasan_buatan){
        this.kecerdasan_buatan = kecerdasan_buatan;
    }
    
    public void setKompleksitasAlgo(double kompleksitas_algo){
        this.kompleksitas_algo = kompleksitas_algo;
    }
    
    public void setPemWeb(double pemrograman_web){
        this.pemrograman_web = pemrograman_web;
    }
    
    public void setPrakPemWeb(double praktikum_pemweb){
        this.praktikum_pemweb = praktikum_pemweb;
    }
       
    
    //fungsi getter
    public double getMatdis(){
        return matdis;
    }
   
    public double getDataMining(){
        return data_mining;
    }
    
    public double getKeamananDataInfo(){
        return keamanan_data_informasi;
    }
    
    public double getKomputasiParalel(){
        return komputasi_paralel;
    }
    
    public double getKecerdasanBuatan(){
        return kecerdasan_buatan;
    }
    
    public double getKompleksitasAlgo(){
        return kompleksitas_algo;
    }
    
    public double getPemWeb(){
        return pemrograman_web;
    }
    
    public double getPrakPemWeb(){
        return praktikum_pemweb;
    }
    
    //fungsi hitung rata rata nilai
    public double totalNilaiRataRata(){
        double nilai = matdis + data_mining + keamanan_data_informasi + komputasi_paralel + kecerdasan_buatan+kompleksitas_algo+ pemrograman_web+praktikum_pemweb;
        double total = nilai / 8;
        return total;
    }
    
    public void keterangan(){
        System.out.println("Nilai IPK Rata Rata Mahasiswa adalah "+totalNilaiRataRata());
    }
}
